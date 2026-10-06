package com.umca.study.service;

import com.umca.study.repository.RentalRepository;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalService {

    private final RentalRepository rentalRepository;

    public void createRental(Map<String, Object> body){

        rentalRepository.save(body);
        return;
    }
}
