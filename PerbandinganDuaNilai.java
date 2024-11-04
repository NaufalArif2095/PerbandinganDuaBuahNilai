/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/*
 * @author
 * NAMA    : Naufal Arif Maulana
 * KELAS   : PBO12
 * NIM     : 23176026
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * Perbandingan dua buah nilai
 */

import java.util.Scanner;

public class PerbandinganDuaNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = scanner.nextInt();
            
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = scanner.nextInt();
            
            System.out.print("Hasil : ");
            if (nilaiPertama > nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println(nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = scanner.next();
            
        } while (ulangi.equalsIgnoreCase("Ya"));
        
        scanner.close();
    }
}

