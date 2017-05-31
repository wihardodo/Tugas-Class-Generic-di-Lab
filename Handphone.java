/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgeneric;

/**
 *
 * @author Dodoedoo
 */
public class Handphone <T> {
    private T noImei;
    public Handphone (T noImei){
        this.noImei=noImei;
    }
    public void setnoImei(T noImei){
        this.noImei=noImei;
    }
    public T getnoImei(){
        return noImei;
    }
    public void getType(){
        system.out.println("Tipe Awalnya"+noImei.getClass().getName());
    }
}
public class Handphone Asus<T> {
    private T menyala;
    public Handphone Asus (T menyala){
        this.menyala=menyala;
    }
    public void setmenyala(T menyala){
        this.menyala=menyala;
    }
    public T getmenyala(){
        return menyala;
    }
    public void getType(){
        system.out.println("Tipe Awalnya"+menyala.getClass().getName());
    }
}
public class Handphone Xiaomi<T> {
    private T menelfon;
    public Handphone Xiaomi (T menelefon){
        this.menelfon=menelfon;
    }
    public void setmenelfon(T meneflon){
        this.menelfon=menelfon;
    }
    public T getmenelfon(){
        return menelfon;
    }
    public void getType(){
        system.out.println("Tipe Awalnya"+menelfon.getClass().getName());
    }
}


