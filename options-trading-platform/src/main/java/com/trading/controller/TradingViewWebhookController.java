package com.trading.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/webhook")
public class TradingViewWebhookController {
    private static final Logger logger = LoggerFactory.getLogger(TradingViewWebhookController.class);

    @PostMapping("/tradingview")
    public ResponseEntity<String> receiveAlert(@RequestBody Map<String, Object> payload) {
        logger.info("Received TradingView alert: {}", payload);
        // TODO: Emit event to Socket.io or event bus for auto-execution
        return ResponseEntity.ok("Alert received");
    }
} 