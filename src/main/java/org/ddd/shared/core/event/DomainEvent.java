package org.ddd.shared.core.event;


import org.ddd.shared.core.utils.UuidGenerator;

import java.util.Date;

/**
 * <p>领域事件</p>
 * @author Mr.Yangxiufeng
 * @date 2020-03-25 11:17
 */
public abstract class DomainEvent {
    private final String id = UuidGenerator.newUuid();
    private final Date createAt = new Date();

    public String getId() {
        return id;
    }

    public Date getCreateAt() {
        return createAt;
    }
}
