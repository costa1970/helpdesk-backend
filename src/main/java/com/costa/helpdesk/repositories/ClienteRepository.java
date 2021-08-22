package com.costa.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costa.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
