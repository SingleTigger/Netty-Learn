package com.chenws.netty.mqtt.service;

import com.chenws.iot.mqtt.bean.RetainMessageBO;

import java.util.List;

/**
 * Created by chenws on 2019/10/11.
 */
public interface RetainMsgService {

    /**
     * 存储保留信息
     * @param topic
     * @param retainMessageStore
     */
    void put(String topic, RetainMessageBO retainMessageStore);

    /**
     * 根据主题获取保留信息
     * @param topic
     * @return
     */
    RetainMessageBO get(String topic);

    /**
     * 删除
     * @param topic
     */
    void remove(String topic);

    /**
     *
     * @param topic
     * @return
     */
    boolean containsKey(String topic);

    /**
     * 获取集合
     * @param topicFilter
     * @return
     */
    List<RetainMessageBO> search(String topicFilter);
}
