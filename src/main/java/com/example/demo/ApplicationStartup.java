package com.example.demo;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

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
