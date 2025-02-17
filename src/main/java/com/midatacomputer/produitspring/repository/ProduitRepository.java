package com.midatacomputer.produitspring.repository;

import com.midatacomputer.produitspring.model.ProduitModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitModel, Integer> {
    int deleteProduitModelByProductId(int productId);

    //Optional<ProduitModel> findById(int produitId);

    //int deleteByProductId(int productId);
    //ProduitModel findProduitModelByProductName(String productName);

    //ProduitModel findProduitModelByProductId(int productId);
}
