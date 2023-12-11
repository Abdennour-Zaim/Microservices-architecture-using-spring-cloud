package org.sid.orderservice.entites;

@Projection(name="fullOrder",types=Order.class)
public interface OrderProjection {
    Long getId();
    Date getCreatedAt;
    OrderStatus getStatus;
    Long getCustomerId;
}