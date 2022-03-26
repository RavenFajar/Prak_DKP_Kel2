package Gojek;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tugas Modul 4");
        System.out.println("==============");
        System.out.println("Aplikasi Ojek Online");
        System.out.println("====================");

        float ht, hp, h, jarak;
        String nama, tujuan;
        int pilihan;

        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.println("Baik " + nama + ", dimana kah tujuan anda ?");
        System.out.print("Tujuan : ");
        tujuan = input.nextLine();
        do {

            System.out.println("Pilih kendaraan yang anda inginkan");
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
            int kend = input.nextInt();
            if (kend == 1){
                System.out.println("Berapa kah jarak anda ke tujuan ?");
                System.out.print("Jarak: ");
                jarak = input.nextFloat();
                if(jarak<10){
                    hp = 5000;
                    ht = hitung(jarak);
                    h = hp + ht;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else if(jarak>=10 && jarak<20){
                    hp = 15000;
                    ht= hitung(jarak);
                    h = ht+hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else if(jarak>=20 && jarak<30){
                    hp = 15000;
                    ht = hitung(jarak);
                    h = ht+hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else{
                    System.out.println("jarak terlalu jauh");
                }
            }
            else if(kend == 2){
                System.out.println("Berapa kah jarak anda ke tujuan ?");
                System.out.print("Jarak: ");
                jarak = input.nextFloat();
                if(jarak<10){
                    hp = 6000;
                    ht = hitung(jarak);
                    h = hp + ht;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else if(jarak>=10 && jarak<25){
                    hp = 18000;
                    ht= hitung(jarak);
                    h = ht+hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else if(jarak>=25 && jarak<40){
                    hp = 22000;
                    ht = hitung(jarak);
                    h = ht+hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else if(jarak>=40 && jarak<50){
                    hp = 27000;
                    ht = hitung(jarak);
                    h = ht+hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                }
                else{
                    System.out.println("jarak terlalu jauh");
                }
            }
            else{
                System.out.println("Pilihan Tidak Tersedia");
            }



            System.out.println("Apakah anda ingin melakukan perjalanan lainnya ?");
            pilihan = input.nextInt();

        }while (pilihan == 1);


    }
    private static float hitung (float input){
        float hasil;
        hasil = (input%10)*2000;
        return hasil;
    }
}

