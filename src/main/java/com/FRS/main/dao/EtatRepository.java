package com.FRS.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Etat;

public interface EtatRepository extends JpaRepository<Etat, Long> {

}
