/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.controller.interfaces;

/**
 *
 * @author radoj
 * @param <T> tip sa kojim se radi
 */
public interface IController<T> {
    void Reserve(T entity);
}
