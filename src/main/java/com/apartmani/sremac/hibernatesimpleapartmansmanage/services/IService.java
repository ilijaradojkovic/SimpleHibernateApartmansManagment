/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.services;

/**
 *
 * @author radoj
 * @param <T>
 */
public interface IService <T>{
    void Insert(T entity);
    T Find(T entity);
    boolean Exists(T entity);
}
