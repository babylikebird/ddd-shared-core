package com.dsy.sunshine.core.event;

import java.util.Date;

/**
 * <p>领域事件</p>
 * @author Mr.Yangxiufeng
 * @date 2020-03-25 11:17
 */
public abstract class AbstractEvent {
    /**
     * 事件的唯一标识
     */
    private final String id;
    /**
     * 事件的时间
     */
    private final Date createAt = new Date();

    public AbstractEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Date getCreateAt() {
        return createAt;
    }
}
