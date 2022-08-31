package com.poo.biblioteca;

import com.poo.biblioteca.entidades.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main( String[] args )
    {
        Autor cliente = entityManager.find(Autor.class, 1);        
    }
}
