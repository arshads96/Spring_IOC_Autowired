/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arshad
 */
public class Bean1 {
    
    private BeanToBeInjected id4;

    public void setId4(BeanToBeInjected id4) {
        this.id4 = id4;
    }
    
    public void show(){
        System.out.println("Inside Bean1 : AutoWired byName");
        id4.print();
    }
    
    
}
