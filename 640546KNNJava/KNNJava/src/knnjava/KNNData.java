/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knnjava;

/**
 *
 * @author Mongkol
 */
public class KNNData{
    private int x;
    private int y;
    private int value;
    private double distance; 
    
    
    
    public KNNData(float distance){
    this.distance = distance;
    }
    public KNNData(int x,int y,int value){
    this.x = x ;
    this.y = y;
    this.value  = value;
    }
    public KNNData(int x,int y,int value,float distance){
    this.x = x ;
    this.y = y;
    this.value  = value;
    this.distance = distance;
    }
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public void setvalue(int value){
        this.value = value ;
    }
    public void setdistance(double distance){
        this.distance = distance ;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public int getvalue(){
        return value;
    }
    public double getdistance(){
        return distance;
    }
}
