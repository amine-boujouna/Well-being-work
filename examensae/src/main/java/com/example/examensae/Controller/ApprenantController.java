package com.example.examensae.Controller;

import com.example.examensae.Entity.Appreneant;
import com.example.examensae.service.Apprenantimplt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprenantController {
    @PostMapping("/addApprenat")
    @ResponseBody
    public void ajouterApprenat(@RequestBody Appreneant appreneant) {
        apprenantimplt.ajouterApprenat(appreneant);
    }
    @Autowired
    private Apprenantimplt apprenantimplt;

}
