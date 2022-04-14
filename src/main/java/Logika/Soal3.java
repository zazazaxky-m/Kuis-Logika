/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.Scanner;

/**
 *
 * @author Zacky
 */
public class Soal3 {
    public static void main(String[] args) {
        //membuat scanner
        Scanner keyboard = new Scanner(System.in);
        //membuat variabel
        int jumlahBil, hasil = 0;
        System.out.print("Masukkan jumlah bilangan : ");
        jumlahBil = keyboard.nextInt();
        //logika
        System.out.print("Jumlah : ");
        for(int i=1; i<=jumlahBil; i++){
            hasil = hasil+i;
            System.out.print(i);
            
            if(jumlahBil != i){
                tambahan();
           
            }
        }
        System.out.print(" = " + hasil);
        int hsl=hasil;
    }
    static void tambahan(){
        String hasil;
        System.out.print(" + ");
    }
}
