package com.example.Ashrefbendaamer.Repository;

import com.example.Ashrefbendaamer.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository <Produit,Integer> {
}
