/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.controller;

/**
 *
 * @author radoj
 */
public class GostController {
    
    
    private static GostController instance
;    
    public static GostController getInstance(){
        if(instance==null) instance=new GostController();
        return instance;
    }
    private GostController(){
        
    }
}
