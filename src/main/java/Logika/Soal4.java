/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zacky
 */
public class Soal4 {
public static void main(String[] args) {
        ArrayList<String> ganjilGenap = new ArrayList<String>();
    Scanner myObj = new Scanner(System.in); 
    
       
    int angka;
    System.out.print("Berapa angka yang ingin di inputkan : ");
    angka = myObj.nextInt();
    int[] a = new int[angka];
    System.out.println("Masukkan angka yang diinginkan: ");
   
    for(int i=0;i<angka;i++) {
        a[i] = myObj.nextInt();
    }
        
    for(int i : a) {
        System.out.print(i+", ");
        if (i % 2 ==0){
            ganjilGenap.add("Genap");
    } else {
        ganjilGenap.add("Ganjil");
        }
    }
    System.out.println("");
    System.out.println("-------------------------");
        for (String i : ganjilGenap){
            System.out.print(i + ", ");
        }
    }
}
