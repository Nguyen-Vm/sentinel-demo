package com.example.sentinel.service.impl;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
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

    @Override
    public void paramFlow(String paramA, String paramB) {
        Entry entry = null;
        try {
            entry = SphU.entry("paramFlow", EntryType.IN, 1, paramA, paramB);
        } catch (BlockException e) {
            throw new RuntimeException(e);
        } finally {
            if (entry != null) {
                entry.exit(1, paramA, paramB);
            }
        }
        log.info("paramA: {}, paramB: {}", paramA, paramB);
    }
}
