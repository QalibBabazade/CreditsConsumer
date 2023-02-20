package com.credits.consumer.service.functional;

import com.credits.consumer.entity.CreditDetails;
import com.credits.consumer.repository.CreditRepository;
import org.springframework.stereotype.Service;

@Service
public class CreditFunctionalService {

    private final CreditRepository creditRepository;

    public CreditFunctionalService(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    public CreditDetails addCreditDetails(CreditDetails creditDetails) {
        return creditRepository.save(creditDetails);
    }
}
