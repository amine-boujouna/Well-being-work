package com.example.examensae.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Appreneant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idapprenet;
    private String nom;
    private String prenom;
    private int telephone;
    private String email;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "appreneantList")
    List<Formation> formationList;
}
