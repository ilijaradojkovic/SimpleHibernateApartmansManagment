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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author radoj
 */
@Entity
@Table(name = "apartman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apartman.findAll", query = "SELECT a FROM Apartman a"),
    @NamedQuery(name = "Apartman.findByIdApartman", query = "SELECT a FROM Apartman a WHERE a.idApartman = :idApartman"),
    @NamedQuery(name = "Apartman.findByNaziv", query = "SELECT a FROM Apartman a WHERE a.naziv = :naziv"),
    @NamedQuery(name = "Apartman.findByCena", query = "SELECT a FROM Apartman a WHERE a.cena = :cena")})
public class Apartman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApartman")
    private Integer idApartman;
    @Basic(optional = false)
    @Column(name = "Naziv")
    private String naziv;
    @Basic(optional = false)
    @Column(name = "Cena")
    private double cena;

    public Apartman() {
    }

    public Apartman(Integer idApartman) {
        this.idApartman = idApartman;
    }

    public Apartman(Integer idApartman, String naziv, double cena) {
        this.idApartman = idApartman;
        this.naziv = naziv;
        this.cena = cena;
    }

    public Integer getIdApartman() {
        return idApartman;
    }

    public void setIdApartman(Integer idApartman) {
        this.idApartman = idApartman;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApartman != null ? idApartman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apartman)) {
            return false;
        }
        Apartman other = (Apartman) object;
        if ((this.idApartman == null && other.idApartman != null) || (this.idApartman != null && !this.idApartman.equals(other.idApartman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apartmani.sremac.hibernatesimpleapartmansmanage.models.Apartman[ idApartman=" + idApartman + " ]";
    }
    
}
