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
public class escenario {
    private City l;
    private Thing[] cosas = new Thing[100];
    
    public escenario(City c){
        l =c;
        int i =0;
        for(int k=0;k<7;k++){
            for(int j =0;j<3;j++){
                cosas[i] = new Thing(c,k+1,j+1);
                i++;
            }
        }
        for(int k=0;k<6;k++){
                cosas[i] = new Thing(c,k+2,4);
                i++;
        }
        for(int k=0;k<5;k++){
                cosas[i] = new Thing(c,k+3,5);
                i++;
        }
        for(int k=0;k<4;k++){
                cosas[i] = new Thing(c,k+4,6);
                i++;
        }
        for(int k=0;k<3;k++){
                cosas[i] = new Thing(c,k+5,7);
                i++;
        }
        for(int k=0;k<2;k++){
                cosas[i] = new Thing(c,k+6,8);
                i++;
        }
        for(int k=0;k<1;k++){
                cosas[i] = new Thing(c,k+7,9);
                i++;
        }
    }
}
