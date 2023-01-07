package com.microservices.notification;

import com.microservices.clients.notifications.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/notification")
@AllArgsConstructor
@RestController
@Slf4j
public class NotificationController {

    private final NotificationService notificationService;
    @PostMapping
    public void registerNotification(@RequestBody NotificationRequest notificationRequest){
        log.info("new notification was registred", notificationRequest);
        notificationService.registerNotification(notificationRequest);
    }
}
