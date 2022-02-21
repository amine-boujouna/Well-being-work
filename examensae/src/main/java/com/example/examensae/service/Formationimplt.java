package com.example.examensae.service;

import com.example.examensae.Entity.Appreneant;
import com.example.examensae.Entity.Formateur;
import com.example.examensae.Entity.Formation;
import com.example.examensae.Repository.ApprenantRepository;
import com.example.examensae.Repository.FormationRepository;
import com.example.examensae.Repository.foramteurRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;

@Service
@Slf4j
public class Formationimplt {
    @Autowired
    foramteurRepository foramteurRepository;
    @Autowired
    FormationRepository formationRepository;
    @Autowired
    ApprenantRepository apprenantRepository;
    public void ajouteretaffecteurforamtionaforamteur(Formation formation,Long idformateur){
        Formateur f=foramteurRepository.findById(idformateur).get();
        formation.setFormateur(f);
        formationRepository.save(formation);
    }
    public void affecterapprenantaforamtion(Long ida,Long idf) {
        Appreneant a = apprenantRepository.findById(ida).get();
        Formation f = formationRepository.findById(idf).get();

        if (f.getAppreneantList().size() < f.getNbMaxParticipant()) {
            a.getFormationList().add(f);
            f.getAppreneantList().add(a);
            apprenantRepository.save(a);
            formationRepository.save(f);
        }
    }
    @Scheduled(fixedRate=30000)
    public void nbrapprenatbyformation(){
        List<Formation> formation=formationRepository.findAll();
        for(Formation f:formation){
           log.info("la formation"+f.getTitle()+"contient"+f.getAppreneantList().size());
        }
    }

public Integer getRevenuebyformation(Long idf){
        Formation f=formationRepository.findById(idf).get();
        return f.getAppreneantList().size()*f.getFrais();
}
}
