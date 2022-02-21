package com.example.examensae.Repository;

import com.example.examensae.Entity.Appreneant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantRepository extends JpaRepository<Appreneant,Long> {
}
