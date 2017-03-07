/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;

public class Escenario7 {
    City area7;
    Wall bloque[] = new Wall[34];
    
    Thing[] ladrillo = new Thing[60];
    Thing bloques;
    
    
    
    public Escenario7(City c){
        
        area7 = c;
        int i;
        for(i=0; i<4;i++){
            bloque[i]= new Wall(area7,4,i+1,Direction.SOUTH); 
            bloque[i]= new Wall(area7, i+1,5, Direction.WEST);
            bloque[i]= new Wall(area7, 4, i+6, Direction.SOUTH);
            bloque[i]= new Wall(area7, i+1, 6, Direction.WEST);
            bloque[i]= new Wall(area7, 6, i+1, Direction.NORTH);
            bloque[i]= new Wall(area7, i+6,4, Direction.EAST);
            bloque[i]= new Wall(area7, 6,i+6, Direction.NORTH);
            bloque[i]= new Wall(area7, i+6,6, Direction.WEST);
        }
        for(i=0; i<4;i++){
            for(int j=0; j<4;j++){
            ladrillo[j]=new Thing(area7,j+1,i+1);
            ladrillo[j]= new Thing(area7,j+6,i+1);
            ladrillo[j]= new Thing(area7, j+1,i+6);
            ladrillo[j]= new Thing(area7,j+6, i+6);
            
            }
        }
        
        
    }
    
    
    
    
    
}
