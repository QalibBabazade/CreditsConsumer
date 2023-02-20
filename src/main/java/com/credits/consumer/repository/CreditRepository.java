package com.credits.consumer.repository;

import com.credits.consumer.entity.CreditDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<CreditDetails,Long> {

}
