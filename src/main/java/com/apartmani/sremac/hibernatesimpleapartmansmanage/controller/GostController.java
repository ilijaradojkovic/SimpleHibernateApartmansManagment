/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.controller;

import com.apartmani.sremac.hibernatesimpleapartmansmanage.controller.interfaces.IController;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Gost;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.utility.HibernateUtility;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author radoj
 */
public class GostController implements  IController<Gost>{
    
    
    private static GostController instance
;    
    public static GostController getInstance(){
        if(instance==null) instance=new GostController();
        return instance;
    }
    private GostController(){
        
    }



    @Override
    public void Reserve(Gost entity) {
        try(Session s = HibernateUtility.getSessionFactory().openSession()) {
            s.getTransaction().begin();
            s.save(entity);
            s.getTransaction().commit();
        
        }catch(Exception e){
           
            System.err.println(e.getMessage());
        }
    }
}
