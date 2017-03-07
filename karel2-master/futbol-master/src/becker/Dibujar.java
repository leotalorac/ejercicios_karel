/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

/**
 *
 * @author JAVIER
 */
public class Dibujar {
    private final int Menu;
    private final int Cuarto; 
    private final int n;
    
    public Dibujar(int v, int c){
        Menu = v;
        Cuarto = c;
        n = (3*Cuarto)-2;
    }
    
    public boolean NumberWrite(int i, int j){
        switch(Menu){
            case 0:
                if((j==n+1)&&(i>1&&i<5))
                    return true;
                break;
            case 1:
                if(j!=n+2)
                    return true;
                break;
            case 2:
                if(((j==n||j==n+1)&&i==2)||((j==n+1||j==n+2)&&i==4))
                    return true;
                break;
            case 3:
                if((j==n||j==n+1)&&(i==2||i==4))
                    return true;
                break;
            case 4:
                if((j==n+1&&i<3)||((j==n||j==n+1)&&(i==4||i==5)))
                    return true;
                break;
            case 5:
                if(((j==n+1||j==n+2)&&i==2)||((j==n||j==n+1)&&i==4))
                    return true;
                break;
            case 6:
                if((j==n+1&&i==4)||((j==n+1||j==n+2)&&i==2))
                    return true;
                break;
            case 7:
                if(j!=n+2&&i>1)
                    return true;
                break;
            case 8:
                if(j==n+1&&(i==2||i==4))
                    return true;
                break;
            case 9:
                if((j==n+1&&i==2)||((j==n||j==n+1)&&i==4))
                    return true;
                break;                   
        }
        return false;
    }
}
