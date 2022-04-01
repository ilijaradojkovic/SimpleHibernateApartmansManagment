/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.controller;

import com.apartmani.sremac.hibernatesimpleapartmansmanage.INotify;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.controller.interfaces.IController;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Apartman;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Gost;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.services.GostService;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.services.IService;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.utility.HibernateUtility;
import java.util.Date;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author radoj
 */
public class GostController implements  IController<Gost>{
    
    private IService service;
    private INotify notify;
 

    public  GostController(INotify notify){
        service=new GostService();
        this.notify=notify;
    }



    @Override
    public void Reserve(Gost entity) {
        if(!service.Exists(entity))
            service.Insert(entity);
        
        else {
            notify.notify("Rezervisano je vec");
        }
    }

    @Override
    public void Search(Date dateDo,Date dateOd, Apartman apartman) {
        
        if(dateDo==null || dateOd==null)  notify.notify("Datum nije unet");
       if(service.Exists(new Gost(dateOd,dateDo,apartman.getIdApartman()))){
           notify.notify("Zauzeto");
       }
       else{
           notify.notify("Nije zauzeto");
       }
        
    }
}
