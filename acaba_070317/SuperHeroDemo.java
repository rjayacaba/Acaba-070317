/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acaba_070317;

/**
 *
 * 
 * 
 */
public class SuperHeroDemo {
    public static void main(String[] args){
    FlyingSuperHero kakz = new FlyingSuperHero();
    //kakz.displayPower();
    Spiderman r = new Spiderman();
    //r.displayPower();
    kakz.setSuperPower("New Power", 2);
    kakz.printSuperPowers();
    }
}