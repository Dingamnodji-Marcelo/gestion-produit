package com.midatacomputer.produitspring.exceptions;

public class ProduitNotFoundException extends RuntimeException {
    public ProduitNotFoundException(String message)
    {
        super(message);
    }
}
