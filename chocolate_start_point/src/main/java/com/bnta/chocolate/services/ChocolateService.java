package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {

    @Autowired
    ChocolateRepository chocolateRepository;

    public Chocolate addChocolate(Chocolate chocolate){
        return chocolateRepository.save(chocolate);
//        return chocolate;
    }

    public List<Chocolate> getAllChocolates(){
        return this.chocolateRepository.findAll();
    }
}
