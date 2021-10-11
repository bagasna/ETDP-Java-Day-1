package org.example;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> Data = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilihan Makanan : ");
        String namaMakanan = sc.next();
        Data.add(namaMakanan);
        System.out.print("Pilihan Minuman : ");
        String namaMinuman = sc.next();
        Data.add(namaMinuman);
        System.out.print("Pilihan Buah : ");
        String namaBuah = sc.next();
        Data.add(namaBuah);

        System.out.print("Orderan Kamu : ");
        System.out.print(Data);

        System.out.println("");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Ubah Menu ");
        System.out.println("2. Hapus Menu ");
        System.out.println("3. Keluar ");
        System.out.println("Silahkan Pilih Menu Diatas : ");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.print("Pilihan Menu yg mau diganti : ");
            String old = sc.next();
            System.out.print("Menu yang diganti : ");
            String newMenu = sc.next();

            for (int i = 0; i < Data.size(); i++) {
                if (Data.get(i).equals(old)){
                    Data.set(i,newMenu);
                }
            }
            System.out.print("Orderan Kamu : ");
            System.out.print(Data);

            System.out.print("Orderan Kamu : ");
            System.out.println("TERIMA KASIH TELAH MEMESAN :)");

        } else if (menu == 2){

            System.out.println("Menu yg mau dihapus :");
            String hapus = sc.next();
            for (int i = 0; i < Data.size(); i++) {
                if (Data.get(i).equals(hapus)){
                    Data.remove(hapus);
                }
            }
            System.out.print("Orderan Kamu : ");
            System.out.print(Data);

            System.out.println("TERIMA KASIH TELAH MEMESAN :)");
    }else{
            System.out.println("TERIMA KASIH TELAH MEMESAN :)");
        }









//        System.out.println( "Hello World!" );
    }
}
