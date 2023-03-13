/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hellojasper;

/**
 *
 * @author yuan-
 */

import java.io.Serializable;


public class Alumno implements Serializable {
    
    int id;
    String nombre;
    String apellidos;
    int AD;
    int SGE;
    int DI;
    int PMDM;
    int PSP;
    int EIE;
    int HLC;
//    Producto producto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getSGE() {
        return SGE;
    }

    public void setSGE(int SGE) {
        this.SGE = SGE;
    }

    public int getDI() {
        return DI;
    }

    public void setDI(int DI) {
        this.DI = DI;
    }
    
    public int getPMDM() {
        return PMDM;
    }

    public void setPMDM(int PMDM) {
        this.PMDM = PMDM;
    }
    
    public int getPSP() {
        return PSP;
    }

    public void setPSP(int PSP) {
        this.PSP = PSP;
    }
    
    public int getEIE() {
        return DI;
    }

    public void setEIE(int EIE) {
        this.EIE = EIE;
    }
    
    public int getHLC() {
        return DI;
    }

    public void setHLC(int HLC) {
        this.HLC = HLC;
    }
}