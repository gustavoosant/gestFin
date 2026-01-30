package com.gustavohshn.gestFin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conta")
public class contaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta", nullable = false)
    private Integer idConta;

    @Column(name = "nome_conta", length = 45, nullable = false)
    private String nomeConta;

    @Column(name = "tipo_conta", length = 45, nullable = false)
    private String tipoConta;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private usuarioModel usuario;

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public usuarioModel getId_usuario() {
        return usuario;
    }

    public void setId_usuario(usuarioModel usuario) {
        this.usuario = usuario;
    }
}
