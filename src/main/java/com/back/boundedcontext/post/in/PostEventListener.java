package com.back.boundedcontext.post.in;

import com.back.shared.member.event.MemberJoinedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author : JAKE
 * @date : 25. 12. 31.
 */
@Component
@RequiredArgsConstructor
public class PostEventListener {

    @KafkaListener(topics = "MemberJoinedEvent", groupId = "PostEventListener__handle__1")
    public void handle(MemberJoinedEvent event) {
        System.out.println("handle, MemberJoinedEvent, member: " + event.member().id());
    }

    @KafkaListener(topics = "MemberJoinedEvent", groupId = "PostEventListener__handle__2")
    public void handle2(MemberJoinedEvent event) {
        System.out.println("handle2, MemberJoinedEvent, member: " + event.member().id());
    }

    @KafkaListener(topics = "MemberJoinedEvent", groupId = "PostEventListener__handle__2")
    public void handle2Again(MemberJoinedEvent event) {
        System.out.println("handle2-again, MemberJoinedEvent, member: " + event.member().id());
    }
}
