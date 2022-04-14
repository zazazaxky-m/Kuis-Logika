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
public class Soal2 {
        public static void main(String[] args){
        //membuat scanner
        Scanner keyboard = new Scanner(System.in);
        //membuat variabel
        int angka;
        
        System.out.print("Masukkan angka : ");
        angka = keyboard.nextInt();
        
        //logika
        if(angka%2==0){
            System.out.println("Angka " +angka + "termasuk bilangan genap");
        }else{
            System.out.println("Angka " +angka + "termasuk bilangan ganjil");
        }   
    }
}
