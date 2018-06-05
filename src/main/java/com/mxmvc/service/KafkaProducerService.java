package com.mxmvc.service;

import java.util.Map;

/**
 * Created by menxu on 18/6/5.
 */
public interface KafkaProducerService {
    public Map<String,Object> sndMesForTemplate(String topic, Object value, String ifPartition,
                                                Integer partitionNum, String role);
}
