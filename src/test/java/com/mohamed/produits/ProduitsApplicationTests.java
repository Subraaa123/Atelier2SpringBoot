package com.mohamed.produits;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mohamed.produits.entities.Produit;
import com.mohamed.produits.repos.ProduitRepository;
@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private ProduitRepository produitRepository;
@Test
public void testCreateProduit() {
Produit prod = new Produit("PC Dell",2200.500,new Date());
produitRepository.save(prod);
}
@Test
public void testFindProduit()
{
Produit p = produitRepository.findById(4L).get();

System.out.println(p);
}
@Test
public void testUpdateProduit()
{
Produit p = produitRepository.findById(3L).get();
p.setPrixProduit(1000.0);
produitRepository.save(p);
}
@Test
public void testDeleteProduit()
{
produitRepository.deleteById(3L);;
}
@Test
public void testListerTousProduits()
{
List<Produit> prods = produitRepository.findAll();
for (Produit p : prods)
{
System.out.println(p);
}

}
}