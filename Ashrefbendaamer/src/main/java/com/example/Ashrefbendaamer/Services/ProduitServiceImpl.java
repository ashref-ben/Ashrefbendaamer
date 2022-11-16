package com.example.Ashrefbendaamer.Services;

import com.example.Ashrefbendaamer.Entity.Produit;
import com.example.Ashrefbendaamer.Repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService{

    private final ProduitRepository produitRepository;
    @Override
    public Produit Ajouter(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> Afficher() {
        return produitRepository.findAll();
    }

    @Override
    public Produit Modifier(Integer id, Produit produit) {
            return produitRepository.findById(id).map(p->{

            p.setName(produit.getName());
            p.setDescription(produit.getDescription());
            p.setPrix(produit.getPrix());
            return produitRepository.save(p);

        }).orElseThrow(()-> new RuntimeException("produit Introuvable"));
    }

    @Override
    public String Supprimer(Integer id) {
        produitRepository.deleteById(id);
        return "Produit Supprimé ";
    }
}
