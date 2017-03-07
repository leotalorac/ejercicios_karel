/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;
import becker.robots.*;
import java.util.Scanner;
/**
 *
 * @author Bryan M
 */

    


public class Moves {
    
    
    private Robot rob;
    private City prague;
    private Thing bola;
    
    
    public void  Recorrido(){
        City prague = new City();
        Robot rob = new Robot(prague, 1, 0, Direction.SOUTH);
        Scanner lee= new Scanner(System.in);
        int n[]= new int [20];
        
        System.out.println("Escriba  numero de filas ");
        int lim = lee.nextInt();
        for(int i=0;i<lim;i++){
            System.out.print("Número " + (i+1) +" = ");
            n[i] = lee.nextInt();
         
            for(int k=0;k<n[i];k++){
               Thing bola= new Thing (prague, i+2, 0);
            }
            
        }
        System.out.println("Presione Start");
        rob.move();
        rob.turnLeft();
        
        System.out.println("Ingrese nuevamente los números");
      for(int k=0;k<lim;k++){
            
            n[k] = lee.nextInt();
     
      
        
        for(int i=0;i<n[k]-1;i++){
        rob.pickThing();
        }
    
       
       for(int i=0;i<n[k]-1;i++){
       rob.move();
       rob.putThing();
       }
 
      for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
     
      rob.move();
       for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      for(int i=0;i<n[k]-1;i++){
      rob.move();
      }
      for(int i=0;i<2;i++){
          rob.turnLeft();
      }
      }
     System.out.println(rob.countThingsInBackpack()); 
      
    }
        
    }
    
       

