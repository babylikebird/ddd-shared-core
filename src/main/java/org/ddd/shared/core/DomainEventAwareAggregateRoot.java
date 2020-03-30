package org.ddd.shared.core;

import org.ddd.shared.core.event.DomainEvent;

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
    private List<DomainEvent> events = new ArrayList<>();

    protected void raiseEvent(DomainEvent event){
        this.events.add(event);
    }

    public List<DomainEvent> getEvents() {
        return Collections.synchronizedList(events);
    }

    public void clearEvent(){
        events.clear();
    }
}
