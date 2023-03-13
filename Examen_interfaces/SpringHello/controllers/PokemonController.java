/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.example.SpringHello.controllers;

import com.example.SpringHello.models.Pokemon;
import com.example.SpringHello.repositories.PokemonRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author yuan-
 */
@RestController
@RequestMapping("/pokedex")
//como se va a llamar la ruta/////////////// localhost:8080/pokedex 
public class PokemonController {
    
    @Autowired
    PokemonRepository repo;
    
    @GetMapping()
    public List<Pokemon> list(){
        return repo.findAll();
    }
    
//    @GetMapping()
//    public List<Object> list() {
//        return null;
//    }
//    
    //http://localhost:8080/pokedex/name/Bulbasaur
    @GetMapping("/name/{name}")
    public ResponseEntity<Pokemon> getPokemonByName(@PathVariable String name){
        var pok =repo.findByName(name);
        if(pok.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Pokemon>(pok.get(),HttpStatus.OK);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> get(@PathVariable Long id) {
        //return repo.findById(id).get();
       if( repo.existsById(id)){
           return new ResponseEntity<Pokemon>(repo.findById(id).get(),HttpStatus.OK);
       }else{
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
//    
//    @GetMapping("/{id}")
//    public Pokemon get(@PathVariable Long id) {
//        //return repo.findById(id).get();
//    }
//    
    
    
    
//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
//        return null;
//    }
//    
    @PostMapping
    public ResponseEntity<Pokemon> post(@RequestBody Pokemon input) {
        repo.save(input);
        System.out.println(input);
        return new ResponseEntity<>(input,HttpStatus.CREATED);
    }
//    
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }
    
}
