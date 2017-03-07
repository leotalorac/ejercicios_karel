/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        int[] usuario = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Digito #"+(i+1)+": ");
            usuario[i] = Leer.nextInt();
        }
        Cuartos gotham = new Cuartos(usuario[0], usuario[1], usuario[2]); 
        
          int[] x = new int[3];
        for(int i=0;i<3;i++){
            gotham.In();
            x [i]=Bool.toInt(gotham.movimiento());
            gotham.getOut();
            if(i!=2)
                gotham.Next();
        }
            
        System.out.println("El numero es "+x[0]+x[1]+x[2]);
    }
}
