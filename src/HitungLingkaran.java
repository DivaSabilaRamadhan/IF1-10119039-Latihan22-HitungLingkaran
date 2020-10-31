/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan perhitungan Lingkaran 
 */

import java.util.Scanner; // import kelas Scanner\

public class HitungLingkaran {

    
    public static void main(String[] args) {
        final double PHI = 3.14;
        double k,L,r,rad;
        
        Scanner sc = new Scanner(System.in);
        rad = 0;
        
        System.out.println("========Perhitungan Lingkaran========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        try {
            rad = sc.nextInt();
            r = rad / 2;
            k = 2 * PHI * r;
            L = PHI * r * r;
            System.out.println();
            System.out.println("=====Hasil Perhitungan Lingkaran=====");
            System.out.println("Jari-jari Lingkaran = " + String.format("%.2f",r) + " cm");
            System.out.println("Luas Lingkaran      = " + String.format("%.2f",L) + " cm");
            System.out.println("Keliling Lingkaran  = " + String.format("%.2f",k) + " cm");
        } catch (Exception e) {
            System.out.println("Nilai Diameter Tidak Sesuai!");
            sc.nextLine();
        }
                       
    }
    
}
