package com.example.demo;

import java.util.Random;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class ApplicationStartup {

    private final Consumer consumer;
    private final String projectId = "das-ct-lab";
    private final String subscriptionId = "sam-test-topic1-sub";

    @EventListener(ApplicationReadyEvent.class)
    public void afterStartup() throws Exception {
        consumer.subscribeAsyncExample(projectId, subscriptionId);
    }

}
