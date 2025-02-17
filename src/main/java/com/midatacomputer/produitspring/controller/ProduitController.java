package com.midatacomputer.produitspring.controller;

import com.midatacomputer.produitspring.model.ProduitModel;
import com.midatacomputer.produitspring.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @GetMapping
    public List<ProduitModel> getProduits() {
        return produitService.getProduits();
    }

    //@GetMapping("/{productName}")
    //public ProduitModel getProduitByName(@PathVariable String productName) {
        //return produitService.getProduitByName(productName);
    //}

    @GetMapping("/{id}")
    public ProduitModel getProduitById(@PathVariable int id) {
        return produitService.getProduitById(id);
    }

    @PostMapping("/create")
    public ProduitModel createProduit(@RequestBody ProduitModel produit) {
        return produitService.createProduit(produit);
    }

    @PutMapping("/{id}")
    public String updateProduit(@PathVariable("id") int productId, @RequestBody ProduitModel produit) {
        return produitService.updateProduit(productId, produit);
    }

    @DeleteMapping("/{id}")
    public int deleteProduit(@PathVariable("id") int productId) {
        return produitService.deleteProduit(productId);
    }
}
