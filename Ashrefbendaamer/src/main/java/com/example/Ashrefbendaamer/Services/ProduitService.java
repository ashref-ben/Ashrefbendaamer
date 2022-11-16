package com.example.Ashrefbendaamer.Services;

import com.example.Ashrefbendaamer.Entity.Produit;

import java.util.List;

public interface ProduitService {

    Produit Ajouter(Produit produit);
    List<Produit> Afficher();
    Produit Modifier(Integer id,Produit produit);
    String Supprimer(Integer id);
}
