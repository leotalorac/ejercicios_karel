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
public class r7 {
    private Robot l;
    private int[] x = new int[300];
    private int[] y = new int[300];
    
    public r7(City c){
        this.l = new Robot(c,11,1,Direction.NORTH);
    }
    
    public void ordenar(){
        recoger();
        poner();
            
    
    }
    
    
    
    
    public void girard(){
        for(int i=0;i<3;i++){
            this.l.turnLeft();
        }
    }
    public void darvuelta(){
        for(int i=0;i<2;i++){
            this.l.turnLeft();
        } 
    }
    public void mover(int n){
        for(int i=0;i<n;i++){
            this.l.move();
        }    
    }
    public void recoger(){
        int n =10;
        int lau = 0;
        for(int i=10;i>0;i--)
        {
            for(int f =0; f<4;f++){
                for(int j=0;j<n;j++){
                    mover(1);

                    if(this.l.canPickThing()){
                        this.l.pickThing(); 
                        x[lau] = this.l.getAvenue();
                        y[lau] = this.l.getStreet();
                        
                        
                        
                    }else{
                        x[lau] = 20;
                        y[lau] = 20;
                    }
                    /*System.out.println(x[lau]);
                    System.out.println(y[lau]);*/
                    lau++;
                    
                    
                }
                girard();
            }
            n--;
            
        }
    }
    
    public void poner(){
        int n=10;
        int h =0;
        int x2,y2;
        for(int i=10;i>0;i--)
        {
            for(int f =0; f<4;f++){
                for(int j=0;j<n;j++){
                    mover(1);
                    x2 = this.l.getAvenue();
                    y2 = this.l.getStreet();
                    
                        if(x2==1){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]-9)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==2){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]-7)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==3){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]-5)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==4){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]-3)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==5){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]-1)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==6){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]+1)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==7){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]+3)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==8){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]+5)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==9){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]+7)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                        else if(x2==10){
                            for(int a=0;a<300;a++){
                                if(x2==(x[a]+9)&& y2==y[a]){
                                    this.l.putThing();
                                }
                            }
                        }
                    
                    
                    
                }
                girard();
            }
            n--;
            
        }
    }
}
