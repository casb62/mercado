package com.casb.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casb.mercado.domain.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}