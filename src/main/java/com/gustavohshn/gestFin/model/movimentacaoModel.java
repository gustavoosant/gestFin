package com.gustavohshn.gestFin.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimentacao")
public class movimentacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimentacao", nullable = false)
    private Integer idMovimentacao;

    @Column(name = "tipo_movimentacao", length = 45, nullable = false)
    private String tipoMovimentacao;

    @Column(name = "valor_movimentacao", nullable = false)
    private Double valorMovimentacao;

    @Column(name = "data_movimentacao", nullable = false)
    private LocalDate dataMovimentacao;

    @Column(name = "categoria_movimentacao", length = 45, nullable = false)
    private String categoriaMovimentacao;

    @Column(name = "origem_movimentacao", length = 45, nullable = false)
    private String origemMovimentacao;

    @Column(name = "descricao_movimentacao", length = 80, nullable = false)
    private String descricaoMovimentacao;

    @Column(name = "dividido", nullable = false)
    private Boolean dividido;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private usuarioModel usuario;

    @ManyToOne
    @JoinColumn(name = "conta_id_conta")
    private contaModel conta;

    public Integer getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(Integer idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Double getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(Double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getCategoriaMovimentacao() {
        return categoriaMovimentacao;
    }

    public void setCategoriaMovimentacao(String categoriaMovimentacao) {
        this.categoriaMovimentacao = categoriaMovimentacao;
    }

    public String getOrigemMovimentacao() {
        return origemMovimentacao;
    }

    public void setOrigemMovimentacao(String origemMovimentacao) {
        this.origemMovimentacao = origemMovimentacao;
    }

    public String getDescricaoMovimentacao() {
        return descricaoMovimentacao;
    }

    public void setDescricaoMovimentacao(String descricaoMovimentacao) {
        this.descricaoMovimentacao = descricaoMovimentacao;
    }

    public Boolean getDividido() {
        return dividido;
    }public void setDividido(Boolean dividido) {
        this.dividido = dividido;
    }

    public usuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarioModel usuario) {
        this.usuario = usuario;
    }

    public contaModel getConta() {
        return conta;
    }

    public void setConta(contaModel conta) {
        this.conta = conta;
    }
}
