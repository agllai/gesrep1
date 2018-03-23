package com.FRS.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {

}
