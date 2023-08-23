package com.example.listacontatos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idContato;
    @NotBlank(message = "O nome do contato não pode estar em branco")
    private String nomeContato;

    @NotNull(message = "O telefone não pode ser nulo")
    private Integer telefone;
    private String endereco;
    private boolean status;

    public UUID getIdContato() {
        return idContato;
    }
    public String getNomeContato() {
        return nomeContato;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public boolean isStatus() {
        return status;
    }
    public void setIdContato(UUID idContato) {
        this.idContato = idContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}