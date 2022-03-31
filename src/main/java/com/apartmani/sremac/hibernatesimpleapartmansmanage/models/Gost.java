/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author radoj
 */
@Entity
@Table(name = "gost")
@NamedQueries({
    @NamedQuery(name = "Gost.findAll", query = "SELECT g FROM Gost g"),
    @NamedQuery(name = "Gost.findByIdGost", query = "SELECT g FROM Gost g WHERE g.idGost = :idGost"),
    @NamedQuery(name = "Gost.findByIme", query = "SELECT g FROM Gost g WHERE g.ime = :ime"),
    @NamedQuery(name = "Gost.findByPrezime", query = "SELECT g FROM Gost g WHERE g.prezime = :prezime"),
    @NamedQuery(name = "Gost.findByPol", query = "SELECT g FROM Gost g WHERE g.pol = :pol")})
public class Gost implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGost")
    private Integer idGost;
    @Basic(optional = false)
    @Column(name = "Ime")
    private String ime;
    @Basic(optional = false)
    @Column(name = "Prezime")
    private String prezime;
    @Basic(optional = false)
    @Column(name = "Pol")
    private String pol;

    public Gost() {
    }

    public Gost(Integer idGost) {
        this.idGost = idGost;
    }

    public Gost(Integer idGost, String ime, String prezime, String pol) {
        this.idGost = idGost;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
    }

    public Integer getIdGost() {
        return idGost;
    }

    public void setIdGost(Integer idGost) {
        this.idGost = idGost;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGost != null ? idGost.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gost)) {
            return false;
        }
        Gost other = (Gost) object;
        if ((this.idGost == null && other.idGost != null) || (this.idGost != null && !this.idGost.equals(other.idGost))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Gost[ idGost=" + idGost + " ]";
    }
    
}
