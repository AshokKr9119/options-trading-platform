package com.trading.integration;

import org.springframework.stereotype.Service;

@Service
public class TelegramService {
    public void sendNotification(String chatId, String message) {
        // TODO: Implement HTTP call to Telegram Bot API
        System.out.println("Sending Telegram message to " + chatId + ": " + message);
    }
} 