package com.credits.consumer.service.functional;

import com.credits.consumer.entity.CustomerDetails;
import com.credits.consumer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerFunctionalService {

    private final CustomerRepository customerRepository;

    public CustomerFunctionalService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDetails addCustomerDetails(CustomerDetails customerDetails) {

        return customerRepository.save(customerDetails);
    }
}
