package com.example.examensae.service;

import com.example.examensae.Entity.Formateur;
import com.example.examensae.Repository.foramteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Foramteurimplt {
@Autowired
private foramteurRepository foramteurRepository;
    public void ajouterformateur(Formateur formateur){
        foramteurRepository.save(formateur);
    }

}
