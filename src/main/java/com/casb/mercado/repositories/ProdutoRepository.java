package com.casb.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casb.mercado.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
