/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arshad
 */
public class Bean4 {
    
    private BeanToBeInjected toBeInjected;

    public void setToBeInjected(BeanToBeInjected toBeInjected) {
        System.out.println("Used Setter");
        this.toBeInjected = toBeInjected;
    }

    public Bean4(BeanToBeInjected toBeInjected) {
        System.out.println("Used Constructor");
        this.toBeInjected = toBeInjected;
    }
    
    public void show(){
        System.out.println("Inside Bean4 : AutoWired autoDetect");
        toBeInjected.print();
    }
    
}
