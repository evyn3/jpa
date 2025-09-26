package org.example;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager(); //inicia a conexão

        //CADASTRAR-------------------------------------------------
        /*Pessoa pessoa1 = new Pessoa(null, "Alguém1", "alguem1@gmail.com");
        Pessoa pessoa2 = new Pessoa(null, "Alguém2", "alguem2@gmail.com");
        Pessoa pessoa3 = new Pessoa(null, "Alguém3", "alguem3@gmail.com");*/

        //em.getTransaction().begin(); //inicia uma transação

        /*em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(pessoa3);*/

        //em.getTransaction().commit();//para finalizar a transação

        //----------------------------------------------------------------

        //Faz a consulta-----------------------------------------------
        Pessoa p = em.find(Pessoa.class, 1);
        System.out.println(p);
        //------------------------------------------------------------

        //EXCLUIR-------------------------------------------------//pra excluir tem que fazer o find primeiro
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        //System.out.println("pronto!");
    }
}