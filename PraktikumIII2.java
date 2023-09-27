/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumiii;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PraktikumIII2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Indeks Berat Bawaan Tasku======");
        double laptop, buku, kotak, hp, total;
        char index = 5;
        double beratlaptop, beratbuku, beratkotak, berathp;
        System.out.print("Banyak laptop       : ");
        laptop = input.nextDouble();
        System.out.print("Banyak Buku Tulis   : ");
        buku = input.nextDouble();
        System.out.print("Banyak Kotak Pensil : ");
        kotak = input.nextDouble();
        System.out.print("Banyak Smartphone   : ");
        hp = input.nextDouble();
        System.out.println("====================================");
        beratlaptop = laptop * 850.56;
        beratbuku = buku * 250.11;
        beratkotak = kotak * 25.31;
        berathp = hp * 200;
        total = beratlaptop + beratbuku + beratkotak + berathp;
        if (laptop < 0|| buku < 0 || kotak < 0 || hp < 0) {
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        }else {
            if (total == 0) {
            index = 0;
            System.out.println("barang bawaan tidak melebihi batas");
        } else if (total > 0 && total < 500) {
            index = 1;
            System.out.println("barang bawaan tidak melebihi batas");
        } else if (total > 500 && total < 1000) {
            index = 2;
            System.out.println("barang bawaan tidak melebihi batas");
        } else if (total > 1000 && total < 1500) {
            index = 3;
            System.out.println("barang bawaan tidak melebihi batas");
        } else if (total > 1500 && total < 2000) {
            index = 4;
            System.out.println("barang bawaan tidak melebihi batas");
        } else if (total >= 2000) {
            index = 5;
            System.out.println("barang bawaan melebihi batas");
        }
        }
    }
}