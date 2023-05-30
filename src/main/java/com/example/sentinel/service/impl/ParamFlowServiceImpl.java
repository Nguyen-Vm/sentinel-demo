package com.example.sentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.sentinel.service.ParamFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 阮威敏
 * @date 2023/5/30
 */
@Service
@Slf4j
public class ParamFlowServiceImpl implements ParamFlowService {

    @SentinelResource("paramFlow")
    @Override
    public void paramFlow(String paramA, String paramB) {
        log.info("paramA: {}, paramB: {}", paramA, paramB);
    }
}
