package com.microservices.notification;

import com.microservices.clients.notifications.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void registerNotification(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .message(notificationRequest.message())
                        .toCustomerId(notificationRequest.toCustomerId())
                        .sender("Marcin")
                        .to_customer(notificationRequest.toCustomer())
                        .sent_at(LocalDateTime.now())
                        .build()
        );

    }
}
