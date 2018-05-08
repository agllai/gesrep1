package com.FRS.main.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Client;



public interface ClientRepository extends JpaRepository<Client, Long> {
public Client findByNom(String nom);
public Client findByNumtel(Long numtel);

}
