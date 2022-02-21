package com.example.examensae.Repository;

import com.example.examensae.Entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface foramteurRepository extends JpaRepository<Formateur,Long> {
}
