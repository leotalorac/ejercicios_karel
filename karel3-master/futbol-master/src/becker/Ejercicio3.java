/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author JAVIER
 */
public class Ejercicio3 {
    private final Robot Bats;
    private final int ubicacion;
    private final char x;
    
    public Ejercicio3(int p, char l, City c){
        ubicacion = p;
        Bats = new Robot(c, 5, (ubicacion*4)-1, Direction.WEST, 12);
        x = l;
    }
    
    public void Dibujar(){
        switch(x){
            case 'H':
                for(int i=0;i<3;i++)
                    Bats.turnLeft();
                Bats.putThing();
                for(int i=0;i<8;i++){
                    Bats.move();
                    Bats.putThing();
                    if(i==3){
                        Bats.turnLeft();
                        Bats.move();
                        Bats.move();
                        Bats.turnLeft();
                        Bats.putThing();
                    }
                }
                for(int i=0;i<2;i++){
                    Bats.turnLeft();
                    Bats.move();
                }
                Bats.move();
                Bats.putThing();
                Bats.setTransparency(1);
                break;
            case 'E':
                Bats.putThing();
                for(int i=0;i<8;i++){
                    Bats.move();
                    Bats.putThing();
                    if(i==1||i==5)
                        for(int j=0;j<3;j++)
                            Bats.turnLeft();
                }
                for(int i=0;i<3;i++)
                    Bats.turnLeft();
                for(int i=0;i<3;i++){
                    Bats.move();
                    if(i==1||i==2){
                        Bats.putThing();
                        for(int j=0;j<3;j++)
                            Bats.turnLeft();
                    }
                }
                Bats.setTransparency(1);
                break;
            case 'L':
                Bats.putThing();
                for(int i=0;i<6;i++){
                    Bats.move();
                    Bats.putThing();
                    if(i==1)
                        for(int j=0;j<3;j++)
                            Bats.turnLeft();
                }
                Bats.setTransparency(1);
                break;
            case 'O':
                for(int i=0;i<12;i++){
                    Bats.move();
                    Bats.putThing();
                    if(i==1||i==5||i==7)
                        for(int j=0;j<3;j++)
                            Bats.turnLeft();
                }
                Bats.setTransparency(1);
                break;
        }
    }
}
