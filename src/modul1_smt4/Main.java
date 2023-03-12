/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_smt4;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("roti tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("nasi putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air putih");
        lunch.setKonsumsi(nasi, air);

        System.out.println("menu konsumsi");
        for(Konsumsi<Makanan,Minuman> konsumsi: listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        
        }
    }
}
