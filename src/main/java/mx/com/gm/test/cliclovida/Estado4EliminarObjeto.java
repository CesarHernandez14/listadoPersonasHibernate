package mx.com.gm.test.cliclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable 
        Contacto contacto = null;

        //Recuperamos el objeto
        //1. transitivo
        contacto = em.find(Contacto.class, 3);
        em.getTransaction().begin();
        
        //3. remove
        em.remove(em.merge(contacto));
        em.getTransaction().commit();
        
        //
        
    }

}
