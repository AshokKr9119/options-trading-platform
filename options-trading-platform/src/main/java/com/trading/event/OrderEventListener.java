package com.trading.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {
    private static final Logger logger = LoggerFactory.getLogger(OrderEventListener.class);

    @EventListener
    public void handleOrderEvent(Object event) {
        logger.info("Received event: {}", event);
        // TODO: Add event handling logic (e.g., notifications, order updates)
    }
} 