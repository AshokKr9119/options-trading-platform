# Options Trading Automation Platform

## Overview
An automated options trading platform built with Java and Spring Boot. Integrates with major Indian brokers (Zerodha, Upstox, AngelOne) for seamless order placement, account management, and trade tracking. Features secure JWT authentication, OAuth2 broker authorization, real-time market data streaming, TradingView alert integration, event-driven microservices, and Telegram notifications.

## Features
- Automated order placement and trade tracking
- Integrations with Zerodha, Upstox, AngelOne APIs
- Secure user authentication (JWT) and OAuth2 for brokers
- Real-time market data streaming (Socket.io, TradingView webhook)
- TradingView alert integration for auto-execution
- Event-driven microservices architecture (Spring events)
- Telegram notifications for instant alerts

## API Endpoints
- User registration: `POST /api/auth/register`
- User login: `POST /api/auth/login`
- Place order: `POST /api/orders/place`
- Get user orders: `GET /api/orders/user/{userId}`
- Place broker order: `POST /api/broker/order/{broker}`
- Get broker account info: `GET /api/broker/account/{broker}?accessToken=...`
- Track broker trade: `GET /api/broker/trade/{broker}?orderId=...&accessToken=...`
- TradingView webhook: `POST /api/webhook/tradingview`

## Event-Driven Architecture
- Uses Spring's ApplicationEventPublisher for emitting and listening to events (see `SimpleEventEmitter` and `OrderEventListener`).

## Telegram Integration
- Notifications are sent using the Telegram Bot API (see `TelegramService`).
- Configure your bot token and chat ID in the service implementation.

## Prerequisites
- Java 11 or higher
- Maven 3.6+

## How to Run
1. **Clone the repository:**
   ```sh
   git clone <repo-url>
   cd options-trading-platform
   ```
2. **Configure application properties:**
   - Edit `src/main/resources/application.properties` with your database and broker API credentials.
3. **Build the project:**
   ```sh
   mvn clean install
   ```
4. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
5. **API Endpoints:**
   - User registration: `POST /api/auth/register`
   - User login: `POST /api/auth/login`
   - (More endpoints for trading, brokers, and notifications will be added as implemented)

## Notes
- For development, an in-memory H2 database can be used. For production, configure MySQL/Postgres in `application.properties`.
- Broker API keys and secrets must be obtained from respective broker portals.
- JWT and OAuth2 configuration will be completed in subsequent steps.

---

For questions or contributions, please open an issue or pull request. 