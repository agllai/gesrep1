package com.FRS.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Demande_Retour_Reparation;

public interface DemandeRetourRepRepository extends JpaRepository<Demande_Retour_Reparation, Long> {

}
