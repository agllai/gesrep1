package com.FRS.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Personnel;
import com.FRS.main.entities.Piece;

public interface PieceRepository extends JpaRepository<Piece, Long>{

}
