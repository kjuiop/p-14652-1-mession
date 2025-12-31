package com.back.standard.event;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author : JAKE
 * @date : 25. 12. 31.
 */
public interface HasEventName {

    @JsonIgnore
    default String getEventName() {
        return this.getClass().getSimpleName();
    }

}
