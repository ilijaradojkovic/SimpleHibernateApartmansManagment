/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.services;

import com.apartmani.sremac.hibernatesimpleapartmansmanage.controller.interfaces.IController;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Gost;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.utility.HibernateUtility;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author radoj
 */
public class GostService implements  IService<Gost>{

    private boolean isDBEmpty=false;
    
    public GostService(){
        isDBEmpty=CheckIfIsEmpty();
    }
    @Override
    public void Insert(Gost entity) {
      try(Session s = HibernateUtility.getSessionFactory().openSession()) {
            s.getTransaction().begin();
            
            s.save(entity);
            s.getTransaction().commit();
        
        }catch(Exception e){
           
            System.err.println(e.getMessage());
        }
    }

    @Override
    public Gost Find(Gost entity) {
        Date d=entity.getDatumOd();
      try(Session s = HibernateUtility.getSessionFactory().openSession()) {
          List<Gost> g=  s.createQuery("From Gost G Where G.datumOd>:d").setParameter("d", d).list();
            
          System.err.println(g.size());
        
        }catch(Exception e){
           
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean Exists(Gost entity) {
       
      try(Session s = HibernateUtility.getSessionFactory().openSession()) {
        if(isDBEmpty){ isDBEmpty=false; return false;}
          List<Gost> g=  s.createQuery("From Gost G Where ( G.apartman =:apartman and  ((G.datumOd <=:l and G.datumDo>=:l) or(G.datumOd<=:d and G.datumDo>=:d) or(G.datumOd>=:d and G.datumDo<=:l)))").
                  setParameter("d", entity.getDatumOd()).setParameter("l", entity.getDatumDo()).setParameter("apartman",entity.getApartman()).list();
            System.err.println(g.size());
        
            s.clear();
        return !g.isEmpty();
        }catch(Exception e){
           
            System.err.println(e.getMessage());
        }
        return false;
    }

    private boolean CheckIfIsEmpty() {
          boolean isEmpty=true;
      try(Session session = HibernateUtility.getSessionFactory().openSession()) {
         
            
 isEmpty=session.createQuery("select 1 from Gost").setMaxResults(1).list().isEmpty();
        
        }catch(Exception e){
           
            System.err.println(e.getMessage());
        }
        return isEmpty;
    }


    
}
