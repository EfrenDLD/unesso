package com.example.unesso.services.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.unesso.repository.CatEscolaridadRepository;
import com.example.unesso.repository.TrabajoRepository;
import com.example.unesso.services.ITrabajoService;

@Service
@Primary
public class TrabajoServiceJPA implements ITrabajoService {
	@Autowired
	private TrabajoRepository trabajoRepo;
	
	
}
