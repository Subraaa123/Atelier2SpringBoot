package com.mohamed.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohamed.produits.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}