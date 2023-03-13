/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.example.SpringHello.repositories;

import com.example.SpringHello.models.Alumno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yuan-
 */
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

    public List<Alumno> findByModulo(String modulo);
    
}
