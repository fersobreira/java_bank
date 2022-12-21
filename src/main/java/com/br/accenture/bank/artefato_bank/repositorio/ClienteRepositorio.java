package com.br.accenture.bank.artefato_bank.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.br.accenture.bank.artefato_bank.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

}
