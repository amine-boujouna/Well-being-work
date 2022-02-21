package com.example.examensae.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idforamteur;
    private String nom;
    private String prenom;
    private int tarif;
    private  String Email;
   @OneToMany(mappedBy = "formateur")
   List<Formation> formationList;

}
