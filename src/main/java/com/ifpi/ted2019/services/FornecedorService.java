package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Fornecedor;
import com.ifpi.ted2019.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired

	private FornecedorRepository repository;

	public Fornecedor buscar(Integer id) {
		Optional<Fornecedor> object = repository.findById(id);
		return object.orElse(null);

	}

}