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
public class Soal1 {
    public static void main(String[] args){
        //membuat scanner
        Scanner keyboard = new Scanner(System.in);
        //membuat variabel
        int angkaPertama, angkaKedua, terbesar;
        
        System.out.print("Masukkan angka pertama : ");
        angkaPertama = keyboard.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        angkaKedua = keyboard.nextInt();
        
        //logika
        if(angkaPertama>angkaKedua){
            System.out.println("Angka paling besar adalah" + angkaPertama);
        }else if(angkaPertama<angkaKedua){
            System.out.println("Angka paling besar adalah" + angkaKedua);
        }else{
            System.out.println("Angka sama");
        }  
    } 
}
