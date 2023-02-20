package com.credits.consumer.main;

import com.credits.consumer.config.Config;
import com.credits.consumer.dto.request.OrderReq;
import com.credits.consumer.service.business.OrderBusinessService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Main {

   private final OrderBusinessService orderBusinessService;

    public Main(OrderBusinessService orderBusinessService) {
        this.orderBusinessService = orderBusinessService;
    }

    @RabbitListener(queues = Config.QUEUE)
    public void consumerMessageFromQueue(OrderReq orderReq){
      orderBusinessService.addOrder(orderReq);
    }
}
