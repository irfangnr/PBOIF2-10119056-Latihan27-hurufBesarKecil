/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Huruf besar kecil
 */
public class PBOIF210119056Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        
        String kalimat,hBesar,hKecil;
        
        Scanner masukan=new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        kalimat=masukan.next();
        System.out.println();
        hBesar = kalimat.toUpperCase();
        hKecil= kalimat.toLowerCase();

        System.out.println("====Hasil Formating====" );
        System.out.println("Huruf Besar : " + hBesar);
        System.out.println("Huruf Kecil : " + hKecil);
    }
    
}
