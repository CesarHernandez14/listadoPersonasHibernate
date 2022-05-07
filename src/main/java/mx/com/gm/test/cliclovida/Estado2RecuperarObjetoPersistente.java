package mx.com.gm.test.cliclovida;

import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. Definimos la variable
        Contacto contacto = null;
        em.getTransaction().begin();
        //2. Recuperamos el objeto
        contacto = em.find(Contacto.class, 3);
        em.getTransaction().commit();
        
        //3.detached
        System.out.println("contacto = " + contacto);
        
    }
}
