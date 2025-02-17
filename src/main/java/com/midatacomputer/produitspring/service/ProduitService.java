package com.midatacomputer.produitspring.service;

import com.midatacomputer.produitspring.model.ProduitModel;

import java.util.List;

public interface ProduitService {
    List<ProduitModel> getProduits();

    //ProduitModel getProduitByName(String productName);

    ProduitModel getProduitById(int productId);

    ProduitModel createProduit(ProduitModel produit);

    String deleteProduit(int productId);

    String updateProduit(int productId, ProduitModel produit);
}
