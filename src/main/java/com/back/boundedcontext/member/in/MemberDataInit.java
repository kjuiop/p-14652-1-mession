package com.back.boundedcontext.member.in;

import com.back.global.eventpublisher.EventPublisher;
import com.back.shared.member.dto.MemberDto;
import com.back.shared.member.event.MemberJoinedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : JAKE
 * @date : 25. 12. 31.
 */
@Configuration
@RequiredArgsConstructor
public class MemberDataInit {
    private final EventPublisher eventPublisher;

    @Bean
    public ApplicationRunner memberDataInitApplicationRunner() {
        return args -> {
            eventPublisher.publish(
                    new MemberJoinedEvent(
                            new MemberDto(2)
                    )
            );
        };
    }
}