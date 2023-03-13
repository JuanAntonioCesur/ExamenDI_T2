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
@Table(name="pokemon2")
public class Pokemon implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
            
    @Column(name="Name")
    private String name;
    
    @Column(name="Type")
    private String type;
}
