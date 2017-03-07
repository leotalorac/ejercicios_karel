/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;

/**
 *
 * @author lotalorafox
 */
public class r5 {
    private Robot r ;
    private int pasos =0;
    
    public r5(City c){
        r = new Robot(c,6,7,Direction.NORTH);
        
    }
    public void recorrer(City c){
        frente();
        girard();
        movermas();
        mover(2);
        movermenos();
        girard();
        coger();
        darvuelta();
        movermas();
        frente();
        girard();
        frente();
        girard();
        mover(2);
        girard();
        movermas();
        coger();
        darvuelta();
        frente();
        girard();
        frente();
        girard();
        movermas();
        frente();
        girard();
        movermas();
        this.r.pickThing();
        this.mover(2);
        darvuelta();
        
        System.out.println("se dieron: "+pasos+" Pasos");
        
        
        
    }
    public void girard(){
        for(int i=0;i<3;i++){
            this.r.turnLeft();
        }
    }
    public void mover(int n){
       for(int i=0;i<n;i++){
            this.r.move();
            pasos++;
        } 
       
    }
    public void darvuelta(){
        for(int i=0;i<2;i++){
            this.r.turnLeft();
        } 
    }
    public void movermas(){
        this.r.move();
        this.r.turnLeft();
        pasos++;
    }
    public void movermenos(){
        this.r.turnLeft();
        this.r.move();
        pasos++;
    }
    public void coger(){
        this.r.move();
        this.r.pickThing();
        pasos++;
    }
    public void frente(){
        this.r.move();
        pasos++;
    }
    
}
