/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paketKu;

/**
 *
 * @author Windows 10
 */
public class Koordinat {
// Atribut -----------------------------------------------------
       private float absis;
        private float ordinat;
// Constructor ----------------------------------------------------
    public Koordinat(){
        absis=0;
        ordinat=0;
    }
    
    public Koordinat(float absis, float ordinat){
        this.absis=absis;
        this.ordinat=ordinat;
    }
// Method Input ------------------------------------------------------
    public void setKoordinat(float pAbsis, float pOrdinat){
        absis=pAbsis;
        ordinat=pOrdinat;
    }
    public void setAbsis(float pAbsis){
        absis=pAbsis;
    }
    public void setOrdinat(float pOrdinat){
        ordinat=pOrdinat;
    }
// Method Output --------------------------------------------------------------
    public float getAbsis(){
        return absis;
    }
    public float getOrdinat(){
        return ordinat;
    }

// Method Proses ---------------------------------------------------------------
    public void titikTengah(Koordinat P1, Koordinat P2 ){
        absis=(P1.absis + P2.absis)/2;
        ordinat=(P1.ordinat + P2.ordinat)/2;
    }
    public void cerminX(Koordinat P1){
        absis=P1.absis;
        ordinat=-(P1.ordinat);
    }
    public Koordinat titikTengah2(Koordinat P ){
        Koordinat pHasil=new Koordinat();
        pHasil.absis=(P.absis + absis)/2;
        pHasil.ordinat=(P.ordinat + ordinat)/2;
        return pHasil;
    }
    
}
