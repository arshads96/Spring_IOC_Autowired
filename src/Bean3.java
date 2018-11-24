/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arshad
 */
public class Bean3 {
    
    private BeanToBeInjected beanToBeInjected;

    public Bean3(BeanToBeInjected beanToBeInjected) {
        this.beanToBeInjected = beanToBeInjected;
    }
    
    public void show(){
        System.out.println("Inside Bean3 : AutoWired constructor");
        beanToBeInjected.print();
    }
    
}
