package com.credits.consumer.repository;

import com.credits.consumer.entity.OrderGuarantee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderGuaranteeRepository extends JpaRepository<OrderGuarantee,Long> {

}
