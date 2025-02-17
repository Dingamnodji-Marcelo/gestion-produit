package com.midatacomputer.produitspring.service.impl;

import com.midatacomputer.produitspring.exceptions.ProduitNotFoundException;
import com.midatacomputer.produitspring.model.ProduitModel;
import com.midatacomputer.produitspring.repository.ProduitRepository;
import com.midatacomputer.produitspring.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    @Override
    public List<ProduitModel> getProduits() {
        return produitRepository.findAll();
    }

    //@Override
    //public ProduitModel getProduitByName(String productName) {
      //  return produitRepository.;
    //}

    @Override
    public ProduitModel getProduitById(int productId) {
        return produitRepository.findById(productId).orElse(null);
    }

    @Override
    public ProduitModel createProduit(ProduitModel produit) {
        return produitRepository.save(produit);
    }

    @Override
    public String deleteProduit(int productId) {
        ProduitModel foundProduit = produitRepository.findById(productId)
                .orElseThrow(() -> new ProduitNotFoundException("Product with ID : "+productId+" not found..."));

        produitRepository.delete(foundProduit);

        return "Product with ID : "+productId+ " deleted successfully...";
    }

    @Override
    public String updateProduit(int productId, ProduitModel produit) {
        ProduitModel foundProduit = produitRepository.findById(productId)
                .orElseThrow(() -> new ProduitNotFoundException("Product with ID : "+productId+" not found..."));

        foundProduit.setProductPrice(produit.getProductPrice());
        foundProduit.setProductQuantity(produit.getProductQuantity());
        produitRepository.save(foundProduit);

        return "Product with ID: "+productId+" updated successfully..!";
    }
}
