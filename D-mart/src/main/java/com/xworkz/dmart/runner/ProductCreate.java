package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.ProductEntity;

import javax.persistence.*;

public class ProductCreate {
    public static void main(String[] args) {

        ProductEntity product  = new ProductEntity();
        product.setProductName("brush");
        product.setMfd("30-07-2025");
        product.setPrice(50.0);
        product.setCompany("Oral-B");

        EntityManagerFactory emf=null;
        EntityManager em=null;
        EntityTransaction et=null;

        try {
            emf = Persistence.createEntityManagerFactory("x-workz");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(product);
            et.commit();
        }
        catch(PersistenceException e){
            e.printStackTrace();
            System.out.println("exception in ProductCreate");
            et.rollback();
        }finally {
            if (emf!= null){
                emf.close();
            }
            if (em!= null){
                em.close();
            }
        }
    }
}
