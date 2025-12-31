package com.back.shared.member.event;

import com.back.shared.member.dto.MemberDto;
import com.back.standard.event.HasEventName;

/**
 * @author : JAKE
 * @date : 25. 12. 31.
 */
public record MemberJoinedEvent(
        MemberDto member
) implements HasEventName {
}