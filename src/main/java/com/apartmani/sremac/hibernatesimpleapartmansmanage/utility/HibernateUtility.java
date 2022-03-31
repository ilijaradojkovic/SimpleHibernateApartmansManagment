/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.utility;


import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author radoj
 */
public class HibernateUtility {
    private static final  SessionFactory sessionFactory=new Configuration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
