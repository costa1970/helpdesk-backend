package com.costa.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costa.helpdesk.domain.Chamado;
import com.costa.helpdesk.domain.Cliente;
import com.costa.helpdesk.domain.Tecnico;
import com.costa.helpdesk.domain.enums.Perfil;
import com.costa.helpdesk.domain.enums.Prioridade;
import com.costa.helpdesk.domain.enums.Status;
import com.costa.helpdesk.repositories.ChamadoRepository;
import com.costa.helpdesk.repositories.ClienteRepository;
import com.costa.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	//Injetando dependencias
		@Autowired
		private TecnicoRepository tecnicoRepository;
		@Autowired
		private ClienteRepository clienteRepository;
		@Autowired
		private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Sergio Costa", "014.916.810-12", "sergio@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Dunga Silva", "039.802.160-04", "dunga@gmail.com", "789");
		tec2.addPerfil(Perfil.TECNICO);
		
		Cliente cli1 = new Cliente(null, "Maria José", "535.206.980-05", "maria@yahoo.com.br", "456");
				
		Chamado ch1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1,tec2));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}
}
