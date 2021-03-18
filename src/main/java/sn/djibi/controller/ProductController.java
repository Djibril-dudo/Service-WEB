package sn.djibi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sn.djibi.entity.Produit;
import sn.djibi.repository.ProductRepository;

@CrossOrigin
@RestController
public class ProductController
{
	@Autowired
	private ProductRepository productRepository;
	@PostMapping("/produit/ajouter")
	public Produit create(@RequestBody Produit etudiant)
	{
		Produit etudiant2= productRepository.save(etudiant);

		return etudiant2;
	}
	@DeleteMapping("/produit/{id}")
	public void delete(@PathVariable int id)
	{

		productRepository.deleteById(id);
	}
	@GetMapping("/produit/all")
	public List<Produit> getAll()
	{
		return productRepository.findAll();
	}
	@GetMapping(value="/produit/{id}")
	public Produit  getId(@PathVariable int id)
	{
	return productRepository.findById(id).get();
	}
	@PutMapping("/update")
	public Produit update(@RequestBody Produit produit)
	{
		Produit etudiant2=productRepository.save(produit);

		return etudiant2;
	}
}

