/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;

public class Main7 {
    public static void main(String[]args){
        City area7= new City(13,13);
        Escenario7 s= new Escenario7(area7);
        Ejercicio7 maqui= new Ejercicio7(area7);
        maqui.recorrer(area7);
        
    }
}
