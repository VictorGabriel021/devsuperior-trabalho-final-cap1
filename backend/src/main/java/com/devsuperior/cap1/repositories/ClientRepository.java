package com.devsuperior.cap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.cap1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
