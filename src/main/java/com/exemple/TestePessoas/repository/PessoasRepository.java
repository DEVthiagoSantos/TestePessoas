package com.exemple.TestePessoas.repository;

import com.exemple.TestePessoas.model.PessoasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<PessoasModel, Long> {
}
