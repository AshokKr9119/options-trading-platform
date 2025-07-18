package com.trading.controller;

import com.trading.integration.ZerodhaService;
import com.trading.integration.UpstoxService;
import com.trading.integration.AngelOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/broker")
public class BrokerController {
    @Autowired
    private ZerodhaService zerodhaService;
    @Autowired
    private UpstoxService upstoxService;
    @Autowired
    private AngelOneService angelOneService;

    @PostMapping("/order/{broker}")
    public ResponseEntity<?> placeOrder(@PathVariable String broker, @RequestBody Map<String, Object> orderDetails) {
        String result;
        switch (broker.toLowerCase()) {
            case "zerodha":
                result = zerodhaService.placeOrder(orderDetails);
                break;
            case "upstox":
                result = upstoxService.placeOrder(orderDetails);
                break;
            case "angelone":
                result = angelOneService.placeOrder(orderDetails);
                break;
            default:
                return ResponseEntity.badRequest().body("Unsupported broker");
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/account/{broker}")
    public ResponseEntity<?> getAccountInfo(@PathVariable String broker, @RequestParam String accessToken) {
        Map<String, Object> result;
        switch (broker.toLowerCase()) {
            case "zerodha":
                result = zerodhaService.getAccountInfo(accessToken);
                break;
            case "upstox":
                result = upstoxService.getAccountInfo(accessToken);
                break;
            case "angelone":
                result = angelOneService.getAccountInfo(accessToken);
                break;
            default:
                return ResponseEntity.badRequest().body("Unsupported broker");
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/trade/{broker}")
    public ResponseEntity<?> trackTrade(@PathVariable String broker, @RequestParam String orderId, @RequestParam String accessToken) {
        Map<String, Object> result;
        switch (broker.toLowerCase()) {
            case "zerodha":
                result = zerodhaService.trackTrade(orderId, accessToken);
                break;
            case "upstox":
                result = upstoxService.trackTrade(orderId, accessToken);
                break;
            case "angelone":
                result = angelOneService.trackTrade(orderId, accessToken);
                break;
            default:
                return ResponseEntity.badRequest().body("Unsupported broker");
        }
        return ResponseEntity.ok(result);
    }
} 