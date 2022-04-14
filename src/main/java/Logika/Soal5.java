/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Zacky
 */
public class Soal5 {
public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);
 // Creating arraylist
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// Adding object in arraylist
                System.out.println("Berapa angka yang ingin di inputkan : ");
                int angka = myObj.nextInt();
                System.out.println("Masukkan angka yang diinginkan : ");
for(int i=0;i<angka;i++){
    int angkanya = myObj.nextInt();
    arr.add(angkanya);
    
}
		// Storing the size of the ArrayList in variable n
		int n = arr.size();
		int i;

		System.out.println("Elements of the ArrayList : ");

		for (i = 0; i < n; i++) {
			System.out.print(arr.get(i) + " ");
		}

		System.out.println();

		// The ArrayList will be sorted using predefined
		// function
		Collections.sort(arr);

		System.out.println("ArrayList after sorting : ");

		for (i = 0; i < n; i++) {
			System.out.print(arr.get(i) + " ");
		}

		System.out.println();

		// First and last element of the ArrayList gets stored
		// into min and max variable
		int min = arr.get(0);
		int max = arr.get(n - 1);

		System.out.println("Maximum is : " + max);
		System.out.println("Minimum is : " + min);
	}
}

