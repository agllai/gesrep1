package com.FRS.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Composant;

public interface ComposantRepository extends JpaRepository<Composant, Long> {

}
