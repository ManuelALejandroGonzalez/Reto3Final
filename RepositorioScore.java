/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domingo_Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioScore {
    @Autowired
    private InterfaceScore crud5;
    
    public List<Score>getAll(){
        return (List<Score>) crud5.findAll();
    }
    
    public Optional<Score>getScore(int id){
        return crud5.findById(id);
    }
    public Score save(Score score){
        return crud5.save(score);
    }
    public void delete(Score score) {
        crud5.delete(score);
        
    }
}
