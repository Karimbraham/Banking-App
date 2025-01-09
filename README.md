# Banking API - Spring Boot Application

This is a **Spring Boot** application that provides RESTful API routes for a basic banking system. It supports functionalities such as account management, PIN creation, fund transfers, transaction history, user authentication, and OTP-based login.

---

## Features

### Account Management
- Create, update, and check PIN.
- Deposit and withdraw cash.
- Transfer funds to another account.
- View transaction history.

### User Authentication
- Register and log in using account number and password.
- JWT-based authentication for secure API access.
- OTP generation and verification for additional security.

### Dashboard
- Retrieve user details.
- Fetch account details.

---

## API Endpoints

### Account API (`/api/account`)
- `GET /pin/check`: Check if a PIN is created for the logged-in user's account.
- `POST /pin/create`: Create a new PIN for the logged-in user's account.
- `POST /pin/update`: Update the PIN for the logged-in user's account.
- `POST /deposit`: Deposit cash into the logged-in user's account.
- `POST /withdraw`: Withdraw cash from the logged-in user's account.
- `POST /fund-transfer`: Transfer funds to another account.
- `GET /transactions`: Fetch all transactions for the logged-in user's account.

### Dashboard API (`/api/dashboard`)
- `GET /user`: Get user details for the logged-in account.
- `GET /account`: Get account details for the logged-in account.

### User API
- `POST /register`: Register a new user.
- `POST /login`: Authenticate a user and generate a JWT token.
- `POST /generate-otp`: Generate and send an OTP to the user's email.
- `POST /verify-otp`: Verify the OTP and log in the user.
- `POST /update`: Update user details.

---

## Setup Instructions 

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Karimbraham/Banking-App.git
   cd Banking-App
   ```

2. **Configure the Application**:
   - Update the `application.properties` file with your database and email configuration.

3. **Build and Run the Application**:
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Test the APIs**:
   Use tools like **Postman** or **curl** to interact with the APIs.

---

## Tech Stack

- **Spring Boot**: Backend framework.
- **Spring Security**: For authentication and authorization.
- **JWT**: Token-based authentication.
- **MySQL/PostgreSQL**: Database (can be configured).
- **JavaMailSender**: For sending OTPs via email.

