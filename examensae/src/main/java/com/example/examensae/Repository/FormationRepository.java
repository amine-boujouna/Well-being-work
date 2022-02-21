package com.example.examensae.Repository;

import com.example.examensae.Entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FormationRepository extends JpaRepository<Formation,Long> {
    @Query("select sum(f.nbheur * f.formateur.tarif)from Formation f where f.formateur.Idforamteur= :id and :dateDebut >=f.dateDebut ")
    public Integer getformateurremnbydate(@Param("id") Long idf,@Param("dateDebut")Date datedebut);
}
