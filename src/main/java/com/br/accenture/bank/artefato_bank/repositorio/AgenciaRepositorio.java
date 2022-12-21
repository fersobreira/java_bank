package com.br.accenture.bank.artefato_bank.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.accenture.bank.artefato_bank.modelo.Agencia;

@Repository
public interface AgenciaRepositorio extends CrudRepository<Agencia, Integer >{
    
    // void delete(Agencia agencia);

    // Agencia findByAgencia(int idAgencia);

}
