/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author No Jeneng
 */
public class Singa {
    
    int kecepatan;
    int energi;
    String nama;
    
    void berlari(){
        energi--;
        if (energi > 50) {
            System.out.println("Singa Berlarii");
            
        }
        
        else {
            System.out.println("Singa kurang energi untuk lari");
        
        }
    }
    
    void berjalan(){
        energi--;
        if (energi < 50) {
            System.out.println("Singa berjalan");
            
        } 
        else {
            System.out.println("Singa berlarii");
        }
    }
    
    void melompat(){
        energi--;
        if (energi > 25) {
            System.out.println("Singa melompat");
            
        }
        
        else{
            System.out.println("Singa tidak ada tenaga untuk lompat");
        }
        kecepatan--;
        
        
    }
    
}
