package com.microservices.clients.notifications;

public record NotificationRequest (
        Integer toCustomerId,
        String toCustomer,
        String message
){
}
