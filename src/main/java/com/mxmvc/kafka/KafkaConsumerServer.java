package com.mxmvc.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

/**
 * kafka监听器启动
 * 自动监听是否有消息需要消费
 * Created by menxu on 18/6/5.
 */
public class KafkaConsumerServer implements MessageListener<String, String> {
    protected final Logger logger = LoggerFactory.getLogger("KafkaConsumer");

    /**
     *  监听器自动执行该方法
     *  消费消息
     *  自动提交offset
     *  执行业务代码
     *  （high level api 不提供offset管理，不能指定offset进行消费）
     */
    public void onMessage(ConsumerRecord<String, String> record) {
        logger.info("=============kafkaConsumer开始消费=============");
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        long offset = record.offset();
        int partition = record.partition();
        logger.info("-------------topic:"+topic);
        logger.info("-------------value:"+value);
        logger.info("-------------key:"+key);
        logger.info("-------------offset:"+offset);
        logger.info("-------------partition:"+partition);
        logger.info("~~~~~~~~~~~~~kafkaConsumer消费结束~~~~~~~~~~~~~");
        System.out.println("=============kafkaConsumer开始消费=============");
        System.out.println("topic:"+topic);
        System.out.println("value:"+value);
        System.out.println("key:"+key);
        System.out.println("offset:"+offset);
        System.out.println("partition:"+partition);
        System.out.println("~~~~~~~~~~~~~kafkaConsumer消费结束~~~~~~~~~~~~~");
    }
}
