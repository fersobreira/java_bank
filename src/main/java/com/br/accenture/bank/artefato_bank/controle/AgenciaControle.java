package com.br.accenture.bank.artefato_bank.controle;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.accenture.bank.artefato_bank.modelo.Agencia;
import com.br.accenture.bank.artefato_bank.repositorio.AgenciaRepositorio;

@RestController
@RequestMapping("/agencias")
public class AgenciaControle {

    @Autowired
    private AgenciaRepositorio agencia_repositorio;

    @GetMapping("/listar")
    public Iterable<Agencia> listar(){
        return agencia_repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Agencia cadastrar(@RequestBody Agencia obj){
        return agencia_repositorio.save(obj);
    }

    @ResponseBody
    @PutMapping("/alterar")
    public Agencia alterar(@RequestBody Agencia obj){
        return agencia_repositorio.save(obj);

    }

    @ResponseBody
    @RequestMapping("/{idAgencia}")
    public Optional<Agencia> filtrar(@PathVariable Integer idAgencia){
        return agencia_repositorio.findById(idAgencia);
    }

    @ResponseBody
    // @RequestMapping("/{idAgencia}")
    @DeleteMapping("/remover/{idAgencia}")
    public Object remover(@PathVariable Integer idAgencia){
        agencia_repositorio.deleteById(idAgencia);
        return idAgencia;
        
    }


}
    
