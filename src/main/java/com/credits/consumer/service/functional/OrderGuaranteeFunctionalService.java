package com.credits.consumer.service.functional;

import com.credits.consumer.entity.OrderGuarantee;
import com.credits.consumer.repository.OrderGuaranteeRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderGuaranteeFunctionalService {

    private final OrderGuaranteeRepository orderGuaranteeRepository;

    public OrderGuaranteeFunctionalService(OrderGuaranteeRepository orderGuaranteeRepository) {
        this.orderGuaranteeRepository = orderGuaranteeRepository;
    }

    public void addOrderGuarantee(OrderGuarantee orderGuarantee) {
        orderGuaranteeRepository.save(orderGuarantee);
    }
}
