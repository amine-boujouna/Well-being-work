package com.example.examensae.Controller;

import com.example.examensae.Entity.Formateur;
import com.example.examensae.Entity.Formation;
import com.example.examensae.Repository.FormationRepository;
import com.example.examensae.service.Foramteurimplt;
import com.example.examensae.service.Formationimplt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class FormationController {
    @Autowired
    Formationimplt formationimplt;
    @Autowired
    FormationRepository formationRepository;
    @PostMapping("/addforamtion/{idformateur}")
    @ResponseBody
    public void ajouteretaffecteurforamtionaforamteur(@RequestBody Formation formation,@PathVariable("idformateur") Long idformateur) {
        formationimplt.ajouteretaffecteurforamtionaforamteur(formation, idformateur);
    }
@PutMapping("/affecterapprenataformation/{ida}/{idf}")
@ResponseBody
    public void affecterapprenantaforamtion(@PathVariable("ida")Long ida,@PathVariable("idf")Long idf) {
        formationimplt.affecterapprenantaforamtion(ida,idf);
    }

    @GetMapping("enumeration/{id}/{date}")
    public int gethzhzhf(@PathVariable("id") Long idf,@PathVariable("date") @DateTimeFormat(pattern = "YYYY-MM-DD") Date dateDebut){
       return formationRepository.getformateurremnbydate(idf,dateDebut);
    }
    @GetMapping("/getformation/{idf}")
    @ResponseBody
    public Integer getformation(@PathVariable("idf") Long idf){
        return formationimplt.getRevenuebyformation(idf);
    }

}
