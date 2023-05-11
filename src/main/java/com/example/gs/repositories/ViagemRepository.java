package com.example.gs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gs.models.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
