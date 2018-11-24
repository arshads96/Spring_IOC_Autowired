/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arshad
 */
public class BeanToBeInjected {
    
    private String s1;

    public void setS1(String s1) {
        this.s1 = s1;
    }
    
    public void show(){
        System.out.println(s1);
    }

    void print() {
        System.out.println("Inside Bean which was to be injected");
    }
    
}
