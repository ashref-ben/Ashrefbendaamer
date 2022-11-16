package com.example.Ashrefbendaamer.Controller;

import com.example.Ashrefbendaamer.Entity.Produit;
import com.example.Ashrefbendaamer.Services.ProduitService;
import com.example.Ashrefbendaamer.Services.ProduitServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produit")
@AllArgsConstructor
public class ProduitController {

   // private final
    @Autowired
    ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.Ajouter(produit);
    }

    @GetMapping("/read")
    public List<Produit> read (){
        return produitService.Afficher();
    }

    @PutMapping("update/{id}")
    public Produit update(@PathVariable Integer id,@RequestBody Produit produit){
        return produitService.Modifier(id,produit);
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id){
        return  produitService.Supprimer(id);

    }
}