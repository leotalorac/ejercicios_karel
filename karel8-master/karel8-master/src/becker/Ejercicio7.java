/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;

public class Ejercicio7 {
    private Robot r;
    private int pasos=0;
    
    public Ejercicio7(City c){
        r= new Robot(c,10,5,Direction.NORTH);
        
    }
    
    public void recorrer(City c){
        mover(9);
        moviz();
        moviz();
        for(int i=0; i<4;i++){
        recoger();}
        recogerd();
        girard();
        for(int i=0;i<3;i++){
        recoger();
        }
        recogeri();
        r.turnLeft();
        for(int i=0; i<3;i++){
        recoger();
        }
        girard();
        recoger();
        girard();
        for(int i=0;i<3;i++){
        recoger();
        }
        
        //Final del cuadro 1
        
        
        r.turnLeft();
        frente();
        r.turnLeft();
        mover(5);
        r.turnLeft();
        for(int i=0; i<4;i++){
            recoger();
        }
        for(int i=0;i<2;i++){
            recogerd();
        }
        for(int i=0; i<2;i++){
            recoger();
        }
        for(int i=0; i<2;i++){
            recogeri();
        }        
            recoger();
        for(int i=0; i<2;i++){
            recogerd();
        }
        recoger();
        voltear();
        mover(2);
        recoger();
        dermov();
        r.turnLeft();   
        //final del cuadro 2

        mover(2);
        recogeri();
        for(int i=0; i<3;i++){
            recoger();
        }
        recogerd();
        for(int i=0; i<2;i++){
            recoger();
        }
        recogerd();
        recogerd();
        recogeri();
        recogerd();
        recogerd();
        voltear();
        frente();
        recoger();
        moviz();
        mover(3);
        izmov();
        //fin del tercer cuadro
        mover(5);
        recogeri();
        
        for(int i=0; i<3;i++){
            recoger();
        }
        for(int i=0; i<2;i++){
            recogerd();
        }
        for(int i=0; i<2;i++){
            recoger();
        }
        for(int i=0; i<2;i++){
            recogeri();
        }
        for(int i=0; i<2;i++){
            recoger();
        }
        for(int i=0; i<2;i++){
            recogerd();
        }
        for(int i=0; i<2;i++){
            recoger();
        }
        
        
        
        System.out.println("El robot recogió "+r.countThingsInBackpack()+" cosas.");
        System.out.println("Se dieron un total de "+pasos+" pasos.");
    }
    public void girard(){
        for(int i=0; i<3;i++){
            this.r.turnLeft();
            pasos++;
        }
    }
    public void mover(int m){
        for(int i=0; i<m;i++){
            this.r.move();
            pasos++;
        }
    }
    public void voltear(){
        for(int i=0; i<2;i++){
            this.r.turnLeft();
        }
    }
    public void moviz(){
        this.r.move();
        this.r.turnLeft();
        pasos++;
    }
    public void izmov(){
        this.r.turnLeft();
        this.r.move();
        pasos++;
    }
    public void recoger(){
        this.r.move();
        this.r.pickThing();
        pasos++;
    }
    public void frente(){
        this.r.move();
        pasos++;
    }
    public void recogerd(){
        girard();
        recoger();
        pasos++;
    }
    public void recogeri(){
        this.r.turnLeft();
        recoger();
        pasos++;
    }
    public void dermov(){
        girard();
        this.r.move();
    }
    
    
}
