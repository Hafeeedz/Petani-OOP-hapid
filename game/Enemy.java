/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;


public class Enemy {
  String name ;
 int speed , healtPoin , damage , armor ;
 
 void run(){
     System.out.println(name+" is defending");
     System.out.println("speed "+ speed);
     System.out.println("damage "+ damage);
     System.out.println("armor "+ armor);
 }
 
 boolean isDead(){
     if (healtPoin<=0) return true;
     return false;
 }  
}
