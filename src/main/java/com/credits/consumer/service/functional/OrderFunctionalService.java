package com.credits.consumer.service.functional;

import com.credits.consumer.entity.Order;
import com.credits.consumer.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderFunctionalService {

    private final OrderRepository orderRepository;

    public OrderFunctionalService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }
}
