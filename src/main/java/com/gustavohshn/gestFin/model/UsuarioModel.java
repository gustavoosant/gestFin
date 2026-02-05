package com.gustavohshn.gestFin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsario;

    @Column(name = "nome_usuario", length = 80, nullable = false)
    private String nomeUsuario;

    @Column(name = "email_usuario", length = 70, nullable = false, unique = true)
    private String emailUsuario;

    @Column(name = "ativo", nullable = false )
    private Boolean ativo;

    public Integer getIdUsario() {
        return idUsario;
    }

    public void setIdUsario(Integer idUsario) {
        this.idUsario = idUsario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
