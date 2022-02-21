package com.example.examensae.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    private int nbheur;
    private int nbMaxParticipant;
    private int frais;
    @ManyToMany(fetch =FetchType.EAGER)
    List<Appreneant> appreneantList;
    @ManyToOne
    Formateur formateur;
}
