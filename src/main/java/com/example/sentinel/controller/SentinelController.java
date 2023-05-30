package com.example.sentinel.controller;

import com.example.sentinel.service.ParamFlowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 阮威敏
 * @since 2023.05.30
 */
@RequestMapping("/sentinel")
@RestController
public class SentinelController {

    @Resource
    private ParamFlowService paramFlowService;

    @GetMapping("/paramFlow")
    public String paramFlow(@RequestParam(value = "paramA", defaultValue = "") String paramA,
                            @RequestParam(value = "paramB", defaultValue = "") String paramB) {
        paramFlowService.paramFlow(paramA, paramB);
        return "paramFlow";
    }

    @GetMapping("/degrade")
    public void degrade() {
        throw new RuntimeException("exception occurs");
    }
}
