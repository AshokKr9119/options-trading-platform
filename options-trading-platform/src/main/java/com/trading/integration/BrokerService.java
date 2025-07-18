package com.trading.integration;

import java.util.Map;

public interface BrokerService {
    String placeOrder(Map<String, Object> orderDetails);
    Map<String, Object> getAccountInfo(String accessToken);
    Map<String, Object> trackTrade(String orderId, String accessToken);
} 