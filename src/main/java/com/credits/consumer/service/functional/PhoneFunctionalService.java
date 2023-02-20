package com.credits.consumer.service.functional;

import com.credits.consumer.entity.Phone;
import com.credits.consumer.repository.PhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneFunctionalService {

    private final PhoneRepository phoneRepository;

    public PhoneFunctionalService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public void addPhone(Phone phone) {
        phoneRepository.save(phone);
    }
}
