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
public class RepositorioAdmin {
    @Autowired
    private InterfaceAdmin crud6;
    
    public List<Admin>getAll(){
        return (List<Admin>) crud6.findAll();
    }
    
    public Optional<Admin>getAdmin(int id){
        return crud6.findById(id);
    }
    public Admin save(Admin admin){
        return crud6.save(admin);
    }
    public void delete(Admin admin) {
        crud6.delete(admin);
        
    }
}