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
public class FlyingSuperHero extends SuperHero {
    /**
     * This method will display power
     * @param
     * This method does not have a parameter
     * @return
     * This method does not have a return
     */
    
    @Override
    void displayPower() {
        System.out.println("Fly...");
    }
    void setsP(String superPowers[]) {
        super.setSuperPowers(superPowers);
    }
}

