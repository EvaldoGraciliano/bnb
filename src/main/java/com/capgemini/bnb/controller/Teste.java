package com.capgemini.bnb.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.bnb.model.Pem;

public class Teste {
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bnb"); 
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Pem pem = new Pem();
		
		pem.setCodigo(0644);
		pem.setInstituicao("Banco do brasil");
		pem.setValorDoLimiteUtilizado(500);
		
		manager.persist(pem);
		
		trx.commit();
		
		
	}
}
