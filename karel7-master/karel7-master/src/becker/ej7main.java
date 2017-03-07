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
public class ej7main {
    public static void main(String[] args){
        City london = new City(12,12);
        escenario e = new escenario(london);
        r7 luis = new r7(london);
        luis.ordenar();
    }
    
    
}
