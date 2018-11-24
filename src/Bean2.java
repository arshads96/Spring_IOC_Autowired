/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arshad
 */
public class Bean2 {
    
    private BeanToBeInjected beanInjected;

    public void setBeanInjected(BeanToBeInjected beanInjected) {
        this.beanInjected = beanInjected;
    }
    
    public void show(){
        System.out.println("Inside Bean2 : AutoWired byType");
        beanInjected.print();
    }
    
}
