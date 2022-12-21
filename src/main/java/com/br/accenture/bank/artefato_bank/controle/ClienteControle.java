package com.br.accenture.bank.artefato_bank.controle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.br.accenture.bank.artefato_bank.modelo.Cliente;
import com.br.accenture.bank.artefato_bank.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

    @Autowired
    private ClienteRepositorio cliente_repositorio;

    @GetMapping("/listar")
    public Iterable<Cliente> listar(){

        return cliente_repositorio.findAll();
    }
    
    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente obj){

        return cliente_repositorio.save(obj);
    }

    @ResponseBody
    @PutMapping("/alterar")
    public Cliente alterar(@RequestBody Cliente obj){
        return cliente_repositorio.save(obj);

    }
}
