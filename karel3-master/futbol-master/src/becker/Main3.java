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
public class Main3 {
    public static void main(String[] args) {
        City gotham = new City(7, 21);
        Ejercicio3[] Write = {new Ejercicio3(1, 'H', gotham), new Ejercicio3(2, 'E', gotham), new Ejercicio3(3, 'L', gotham), 
                          new Ejercicio3(4, 'L', gotham), new Ejercicio3(5, 'O', gotham)};
        for(int i=0;i<5;i++)
            Write[i].Dibujar();
    }
}
