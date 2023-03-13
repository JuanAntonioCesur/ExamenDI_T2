/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SpringHello.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author yuan-
 */
    @Data
    @Entity
    @Table(name = "alumnado")
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private int id;
   
    @Column(name = "nombre")
    private String nombre;
     
    @Column(name = "telefono")
    private String telefono;
  
    @Column(name = "email")
    private String email;
    
    @Column(name = "ad")
    private Double ad;
    
    @Column(name = "di")
    private Double di;

}
