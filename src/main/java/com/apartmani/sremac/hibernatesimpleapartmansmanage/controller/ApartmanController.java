/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.controller;

import com.apartmani.sremac.hibernatesimpleapartmansmanage.controller.interfaces.IController;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Apartman;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.services.ApartmanService;
import com.apartmani.sremac.hibernatesimpleapartmansmanage.services.IService;
import java.util.List;

/**
 *
 * @author radoj
 */
public class ApartmanController {
    
    ApartmanService apartmanService;
    List<Apartman> apartmni;
    public ApartmanController(){
        apartmanService=new ApartmanService();
    }
    public String[] getApartmans(){
       apartmni= apartmanService.getAll();
       String [] niz=new String[apartmni.size()];
    for(int i=0;i<niz.length;i++){
        niz[i]=apartmni.get(i).getNaziv();
    }
    return niz;
    }
    public Apartman getApartman(String naziv){
        for(Apartman a:apartmni){
            if(a.getNaziv().equals(naziv)) return a;
        }
        return null;
    }
}
