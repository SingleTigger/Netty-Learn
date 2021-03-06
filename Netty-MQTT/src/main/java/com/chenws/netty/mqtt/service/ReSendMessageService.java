package com.chenws.netty.mqtt.service;

import com.chenws.iot.mqtt.bean.Message;

import java.util.Collection;
import java.util.List;

/**
 * Created by chenws on 2019/11/1.
 */
public interface ReSendMessageService {

    void put(String clientId, Message message);

    void remove(String clientId, Integer packetId);

    List<Message> listAllMessage();

    Collection<Message> listMessageByClient(String clientId);

}
