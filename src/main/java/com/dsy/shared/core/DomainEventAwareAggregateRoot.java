package com.dsy.shared.core;

import com.dsy.shared.core.event.AbstractEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>封装领域事件的聚合根</p>
 * @author Mr.Yangxiufeng
 * @date 2020-03-25 11:16
 */
public abstract class DomainEventAwareAggregateRoot extends AggregateRoot {
    private static final long serialVersionUID = 1L;
    private List<AbstractEvent> events = new ArrayList<>();

    protected void raiseEvent(AbstractEvent event){
        this.events.add(event);
    }

    public List<AbstractEvent> getEvents() {
        return Collections.synchronizedList(events);
    }

    public void clearEvent(){
        events.clear();
    }
}
