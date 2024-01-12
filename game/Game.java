/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

public class Game {

    public static void main(String[] args) {
//        buat objek
        Player hero = new Player();

//memberi nilai atribut
        hero.name = "athak";
        hero.speed = 100;
        hero.healtPoin = 100;
        hero.damage = 77;
        hero.armor = 100;

        hero.run();

        if (hero.isDead()) {
            System.out.println("Matek");
        }

        Enemy Enemy = new Enemy();

        Enemy.name = "Shafiq";
        Enemy.speed = 86;
        Enemy.healtPoin = 200;
        Enemy.damage = 33;
        Enemy.armor = 150;

        Enemy.run();

    Drone anu = new Drone();
    
    anu.energi = 12;
    anu.ketinggian = 0;
    anu.kecepatan = 60;
    anu.merek = "yamaha";
    
    anu.terbang();
    anu.matikanMesin();
    anu.turun();
    anu.belok();
    anu.maju();
    anu.mundur();
    
    
    Singa hewan = new Singa();
    
    hewan.nama = "arema";
    hewan.energi = 0;
    hewan.kecepatan = 123;
    
    hewan.berlari();
    hewan.berjalan();
    hewan.melompat();
    }
    
    

}
