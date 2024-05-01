package com.example.TERCEIROPERIODO.Repository;

import com.example.TERCEIROPERIODO.model.Cidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    public Page<Cidade> findAll(Pageable pageable);
}
