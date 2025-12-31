package com.back.global.eventpublisher;

import com.back.standard.event.HasEventName;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author : JAKE
 * @date : 25. 12. 31.
 */

@Service
@RequiredArgsConstructor
public class EventPublisher {
    private final KafkaTemplate<String, HasEventName> kafkaTemplate;

    public void publish(HasEventName event) {
        kafkaTemplate.send(event.getEventName(), event);
    }
}