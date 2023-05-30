package com.example.sentinel.service;

import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 阮威敏
 * @date 2023/5/30
 */

public interface ParamFlowService {

    void paramFlow(String paramA, String paramB);

}
