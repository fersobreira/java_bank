package com.br.accenture.bank.artefato_bank.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    private String ClienteNome;

    private String ClienteCpf;

    private Integer ClienteFone;

    @OneToOne
    @JoinColumn(name = "codigo_agencia", referencedColumnName = "idAgencia")
    private Agencia idAgencia;
}
