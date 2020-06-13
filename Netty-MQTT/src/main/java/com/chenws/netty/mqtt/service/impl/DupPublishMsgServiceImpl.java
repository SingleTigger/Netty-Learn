package com.chenws.netty.mqtt.service.impl;

import com.chenws.iot.common.constant.RedisConstant;
import com.chenws.iot.mqtt.bean.DupPublishMessageBO;
import com.chenws.iot.mqtt.service.DupPublishMsgService;
import com.chenws.netty.mqtt.bean.DupPublishMessageBO;
import com.chenws.netty.mqtt.service.DupPublishMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by chenws on 2019/10/10.
 */
public class DupPublishMsgServiceImpl implements DupPublishMsgService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void put(String clientId, DupPublishMessageBO dupPublishMessageBO) {
        redisTemplate.opsForHash().put(RedisConstant.DUP_PUBLISH_MESSAGE + clientId,dupPublishMessageBO.getMessageId(),dupPublishMessageBO);
    }

    @Override
    public List<DupPublishMessageBO> get(String clientId) {
        Map<Integer,DupPublishMessageBO> entries = redisTemplate.opsForHash().entries(RedisConstant.DUP_PUBLISH_MESSAGE + clientId);
        Map<Integer, DupPublishMessageBO> integerDupPublishMessageBOMap = Optional.ofNullable(entries).orElseGet(this::initMap);
        return new ArrayList<>(integerDupPublishMessageBOMap.values());
    }

    private Map<Integer,DupPublishMessageBO> initMap(){
        return new HashMap<>();
    }

    @Override
    public void remove(String clientId, int messageId) {
        redisTemplate.opsForHash().delete(RedisConstant.DUP_PUBLISH_MESSAGE + clientId,messageId);
    }

    @Override
    public void removeByClient(String clientId) {
        redisTemplate.delete(RedisConstant.DUP_PUBLISH_MESSAGE + clientId);
    }
}
