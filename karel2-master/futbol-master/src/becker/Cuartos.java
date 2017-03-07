/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Cuartos {
     private City Gotham;
    private Robot Bats;
    private Thing[] seg;
    private Wall[] Paredes;
    private Dibujar Num1;
    private Dibujar Num2;
    private Dibujar Num3;
    
    public Cuartos(int n1, int n2, int n3){
        Gotham = new City(10, 12);
        Bats = new Robot(Gotham, 6, 2, Direction.NORTH);
        Num1 = new Dibujar(n1, 1);
        Num2 = new Dibujar(n2, 2);
        Num3 = new Dibujar(n3, 3);
        seg = new Thing[39];
        Paredes = new Wall[35];
        int x = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(j<4)
                    if(Num1.NumberWrite(i, j))
                        continue;
                if(j>=4&&j<7)
                    if(Num2.NumberWrite(i, j))
                        continue;
                if(j>=7)
                    if(Num3.NumberWrite(i, j))
                        continue;
                seg[x]=new Thing(Gotham, i, j);
                x++;
            }
        }
        int y = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(i==1){
                    Paredes[y]=new Wall(Gotham, i, j, Direction.NORTH);
                    y++;
                }
                if(j==1||j==4||j==7){
                    Paredes[y]=new Wall(Gotham, i, j, Direction.WEST);
                    y++;
                }
                if(i==5&&j!=2&&j!=5&&j!=8){
                    Paredes[y]=new Wall(Gotham, i, j, Direction.SOUTH);
                    y++;
                }
                if(j==9){
                    Paredes[y]=new Wall(Gotham, i, j, Direction.EAST);
                    y++;
                }
            }
        }
    }
    
    public void In(){
        for(int i=0;i<3;i++)
            Bats.move();
        Bats.turnLeft();
    }
    
    public boolean[] movimiento(){
        boolean[] x = new boolean[7];
        x[6]=Bats.canPickThing();
        Bats.move();
        for(int i=0;i<3;i++)
            Bats.turnLeft();
        Bats.move();
        x[5]=Bats.canPickThing();
        Bats.turnLeft();
        Bats.turnLeft();
        Bats.move();
        Bats.move();
        for(int i=4;i>0;i--){
            x[i]=Bats.canPickThing();
            Bats.move();
            if(i!=2)
                Bats.turnLeft();
            Bats.move();
        }
        x[0]=Bats.canPickThing();
        return x;
    }
    
    public void getOut(){
        Bats.turnLeft();
        for(int i=0;i<5;i++)
            Bats.move();
    }
    
    public void Next(){
        Bats.turnLeft();
        for(int i=0;i<3;i++)
            Bats.move();
        Bats.turnLeft();
    }
}
