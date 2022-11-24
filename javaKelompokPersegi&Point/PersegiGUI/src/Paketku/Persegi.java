/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paketku;

/**
 *
 * @author Windows 10
 */
public class Persegi {
    private float panjang;
    private float lebar;
 // constructor 1
public Persegi(){
    panjang=0;
    lebar=0;
}
// constructor 2
public Persegi(float panjang, float lebar){
    this.panjang=panjang;
    this.lebar=lebar;
}
// method Input
 public void setPersegiClass(float pjg, float lbr) {
    panjang=pjg;
    lebar=lbr;
 }
 public void setPanjang(float pjg){
    panjang=pjg;
 }
 public void setLebar(float lbr){
    lebar=lbr;
 }
//Method Output
public float getPanjang(){
    return panjang;
}
public float getLebar(){
    return lebar;
}
// Method PROSES ------------------------------------------------
 public float hitungLuas(){
    return (panjang*lebar);
 }

    
}
