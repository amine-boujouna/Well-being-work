package com.example.examensae.Controller;

import com.example.examensae.Entity.Formateur;
import com.example.examensae.service.Foramteurimplt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class formateurController {
    @PostMapping("/addforamteur")
    @ResponseBody
    public void ajouterformateur(@RequestBody Formateur formateur) {
        foramteurimplt.ajouterformateur(formateur);
    }

    @Autowired
    private Foramteurimplt foramteurimplt;

}
