package com.back.infra.kafka;

import com.back.standard.event.HasEventName;

/**
 * @author : JAKE
 * @date : 25. 12. 31.
 */
public record MyEvent(String msg) implements HasEventName {
}
