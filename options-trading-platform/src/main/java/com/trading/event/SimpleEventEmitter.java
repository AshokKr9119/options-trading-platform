package com.trading.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SimpleEventEmitter {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void emit(Object event) {
        publisher.publishEvent(event);
    }
} 