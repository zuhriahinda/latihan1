/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_smt4;

/**
 *
 * @author ASUS
 * @param <M>
 * @param <I>
 */
public class Konsumsi <M, I> {
    private M m;
    private I i;
    
    public M getM(){
        return m;
    }
    public I getI(){
       return i;
    }
    
    public void setKonsumsi (M makanan, I minuman){
        // TODO code application logic here
        this.m = makanan;
        this.i = minuman;
    }
}
