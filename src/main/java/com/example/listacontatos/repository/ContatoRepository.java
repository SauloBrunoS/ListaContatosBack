package com.example.listacontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.UUID;
import com.example.listacontatos.model.Contato;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatoRepository extends JpaRepository<Contato, UUID> {
    
}