/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.additivesapi.additive;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Tommi
 */
@Entity
@Table(name = "additives")
public class Additive implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private Integer id;
    private String elga;
    private String boehler;
    private String thyssen_tput;
    private String soudokay;
    private String fontargen;
    private String oerlikon_fro;
    private String fileur;
    private String esab;
    private String filarc;
    private String kobelco;
    private String lincoln;
    private String saf_air_liquide;
    private String welding_alloys;

    public Additive() {

    }

    public Additive(String elga, String boehler, String thyssen_tput, String soudokay, String fontargen, String oerlikon_fro, String fileur, String esab, String filarc, String kobelco, String lincoln, String saf_air_liquide, String welding_alloys) {
        this.elga = elga;
        this.boehler = boehler;
        this.thyssen_tput = thyssen_tput;
        this.soudokay = soudokay;
        this.fontargen = fontargen;
        this.oerlikon_fro = oerlikon_fro;
        this.fileur = fileur;
        this.esab = esab;
        this.filarc = filarc;
        this.kobelco = kobelco;
        this.lincoln = lincoln;
        this.saf_air_liquide = saf_air_liquide;
        this.welding_alloys = welding_alloys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getElgaAdditive() {
        return elga;
    }

    public void setElgaAdditive(String elgaAdditive) {
        this.elga = elgaAdditive;
    }

    public String getBoehler() {
        return boehler;
    }

    public void setBoehler(String boehler) {
        this.boehler = boehler;
    }

    public String getThyssen_tput() {
        return thyssen_tput;
    }

    public void setThyssen_tput(String thyssen_tput) {
        this.thyssen_tput = thyssen_tput;
    }

    public String getSoudokay() {
        return soudokay;
    }

    public void setSoudokay(String soudokay) {
        this.soudokay = soudokay;
    }

    public String getFontargen() {
        return fontargen;
    }

    public void setFontargen(String fontargen) {
        this.fontargen = fontargen;
    }

    public String getOerlikon_fro() {
        return oerlikon_fro;
    }

    public void setOerlikon_fro(String oerlikon_fro) {
        this.oerlikon_fro = oerlikon_fro;
    }

    public String getFileur() {
        return fileur;
    }

    public void setFileur(String fileur) {
        this.fileur = fileur;
    }

    public String getEsab() {
        return esab;
    }

    public void setEsab(String esab) {
        this.esab = esab;
    }

    public String getFilarc() {
        return filarc;
    }

    public void setFilarc(String filarc) {
        this.filarc = filarc;
    }

    public String getKobelco() {
        return kobelco;
    }

    public void setKobelco(String kobelco) {
        this.kobelco = kobelco;
    }

    public String getLincoln() {
        return lincoln;
    }

    public void setLincoln(String lincoln) {
        this.lincoln = lincoln;
    }

    public String getSaf_air_liquide() {
        return saf_air_liquide;
    }

    public void setSaf_air_liquide(String saf_air_liquide) {
        this.saf_air_liquide = saf_air_liquide;
    }

    public String getWelding_alloys() {
        return welding_alloys;
    }

    public void setWelding_alloys(String welding_alloys) {
        this.welding_alloys = welding_alloys;
    }

}
