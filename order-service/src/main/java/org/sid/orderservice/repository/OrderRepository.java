package org.sid.orderservice.repository;

import org.sid.orderservice.entites.Order;
import org.sid.orderservice.entites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order,Long> {

    @RestResource(path="/byCustomerId")
    List<Order> findByCustomerId(@Param("customerId") Long customerId);
}
