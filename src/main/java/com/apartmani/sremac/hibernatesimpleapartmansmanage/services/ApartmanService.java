/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.services;

import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Apartman;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Gost;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.utility.HibernateUtility;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author radoj
 */
public class ApartmanService {
      public List<Apartman> getAll() {
          List<Apartman> apartmani=new LinkedList<>();
      try(Session s = HibernateUtility.getSessionFactory().openSession()) {
           
            
        apartmani= s.createQuery("From Apartman").list();
        
        
        }catch(Exception e){
           
            System.err.println(e.getMessage());
        }
      return apartmani;
    }
}
