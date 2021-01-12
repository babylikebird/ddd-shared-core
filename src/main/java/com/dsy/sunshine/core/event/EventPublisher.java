package com.dsy.sunshine.core.event;

/**
 * <p>领域事件发行器</p>
 * @author Mr.Yangxiufeng
 * @date 2020-03-25 14:44
 */
public interface EventPublisher {
    void publish(AbstractEvent event);
}
