package com.example.backlama.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "receita")
public class Receita {

    @Id
    @Column(name = "id_receita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_receita;

    @Column(name = "nome")
    @JsonProperty("nome")
    private String nome;

    @Column(name = "foto")
    @JsonProperty("foto")
    private String foto;

    @Column(name = "nivel_experiencia")
    @JsonProperty("nivel_experiencia")
    private String nivelExperiencia;

    @Column(name = "visibilidade")
    @JsonProperty("visibilidade")
    private String visibilidade;

    @Column(name = "cores")
    @JsonProperty("cores")
    private Boolean cores;

    public Receita() {}

    public Long getIdReceita() {
        return id_receita;
    }

    public void setIdReceita(Long idReceita) {
        this.id_receita = idReceita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade;
    }

    public Boolean getCores() {
        return cores;
    }

    public void setCores(Boolean cores) {
        this.cores = cores;
    }
}