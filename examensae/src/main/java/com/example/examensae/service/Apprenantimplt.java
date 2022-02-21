package com.example.examensae.service;

import com.example.examensae.Entity.Appreneant;
import com.example.examensae.Repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Apprenantimplt {
    @Autowired
    private ApprenantRepository apprenantRepository;
    public void ajouterApprenat(Appreneant appreneant){
        apprenantRepository.save(appreneant);
    }
}
