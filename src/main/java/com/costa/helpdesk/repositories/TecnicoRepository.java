package com.costa.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costa.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
