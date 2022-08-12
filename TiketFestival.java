package com.belajar;

import java.util.Scanner;

public class TiketFestival {

    public static void main(String[] args) {
        double
                VIP = 2500000.00,
                I = 1500000.00,
                II = 1000000.00,
                III = 500000.00;

        double totalPembelian, totalPPN, setelahPPN;
        int kelasVIP, kelasI, kelasII, kelasIII;
        boolean isNext = true;
        // Program menampilkan list tiket yang ada
        kelasVIP = 0;
        kelasI = 35;
        kelasII = 70;
        kelasIII = 150;

        //opening user menginput jumlah orang, dan nama pemesan.

        while (isNext) {

            System.out.println("Selamat Datang di Pembelian Tiket Festival Musik Internasional");


            System.out.print("Pesanan tiket atas nama          : ");


            Scanner input = new Scanner(System.in);

            String namaPemesan = input.nextLine();

            System.out.println(" ");




            System.out.println("              Tiket Tersedia ");
            System.out.println("==============================================");
            System.out.println("   1. Kelas VIP       @ Rp.   " + String.format("%.2f", VIP) + " Sisa : " + kelasVIP);
            System.out.println("   2. Kelas I         @ Rp.  " + String.format("%.2f", I) + "    Sisa : " + kelasI);
            System.out.println("   3. Kelas II        @ Rp.  " + String.format("%.2f", II) + "   Sisa : " + kelasII);
            System.out.println("   4. Kelas III       @ Rp.  " + String.format("%.2f", III) + "  Sisa : " + kelasIII);


            // menginput jumlah pesanan dari masing - masing menu yang ada.

            System.out.println("Pesanan anda (Max Batas pesanan  VIP adalah 3 tiket)");
            System.out.println("Pesanan anda (Max Batas pesanan  I adalah 5 tiket)");
            System.out.println("Pesanan anda (Max Batas pesanan  II adalah 7 tiket)");
            System.out.println("Pesanan anda (Max Batas pesanan  III adalah 10 tiket)");

            int maxPesanVIP, maxPesanI, maxPesanII, maxPesanIII, pesan1, pesan2, pesan3, pesan4;

            maxPesanVIP = 3;
            maxPesanI = 5;
            maxPesanII = 7;
            maxPesanIII = 10;

            //Proses Pesanan KELAS VIP
            boolean pesan = true;
            do {

                System.out.print("   1. Kelas VIP       =  ");

                pesan1 = input.nextInt();

                //Output

                if (pesan1 > maxPesanVIP) {

                    System.out.println("Maaf pesanan anda terlalu banyak maximal 3");
                    pesan = true;
                }
                else if (pesan1 > kelasVIP) {
                    System.out.println("Maaf tiket habis");
                    pesan1= 0;
                    pesan = false;
                } else {
                    System.out.println("Berhasil dipesan");
                    pesan = false;
                }

            } while (pesan);

            kelasVIP = kelasVIP-pesan1;


            //Proses Pesanan KELAS I

            do {

                System.out.print("   2. Kelas I       =  ");

                pesan2 = input.nextInt();

                //Output

                if (pesan2 > maxPesanI) {

                    System.out.println("Maaf pesanan anda terlalu banyak maximal 5");
                    pesan = true;
                }
                else if (pesan2 > kelasI) {
                    System.out.println("Maaf tiket habis");
                    pesan2= 0;
                    pesan = false;
                } else {
                    System.out.println("Berhasil dipesan");
                    pesan = false;
                }

            } while (pesan);
            kelasI = kelasI-pesan2;
            //Proses Pesanan KELAS II

            do {

                System.out.print("   3. KELAS II     =  ");

                pesan3 = input.nextInt();

                //Output

                if (pesan3 > maxPesanII) {

                    System.out.println("Maaf pesanan anda terlalu banyak maximal 7");
                    pesan = true;
                }
                else if (pesan3 > kelasII) {
                    System.out.println("Maaf tiket habis");
                    pesan3= 0;
                    pesan = false;
                } else {
                    System.out.println("Berhasil dipesan");
                    pesan = false;
                }


            } while (pesan);
            kelasII = kelasII -pesan3;
            //Proses Pesanan 4

            do {

                System.out.print("   4. KELAS III     =  ");

                pesan4 = input.nextInt();
                kelasIII = kelasIII-pesan4;
                //Output

                if (pesan4 > maxPesanIII) {

                    System.out.println("Maaf pesanan anda terlalu banyak maximal 10");
                    pesan = true;
                }
                else if (pesan4 > kelasIII) {
                    System.out.println("Maaf tiket habis");
                    pesan4= 0;
                    pesan = false;
                } else {
                    System.out.println("Berhasil dipesan");
                    pesan = false;
                }
            } while (pesan);


            //proses perhitungan harga = pesanan dikali harga menu

            double harga1 = pesan1 * VIP;
            double harga2 = pesan2 * I;
            double harga3 = pesan3 * II;
            double harga4 = pesan4 * III;
            int jumlahTiket = pesan1 + pesan2 + pesan3 + pesan4;
            System.out.println("\n\nSelamat mengikuti Festival Musik Internasional");


            // Harga pembelian dari masing-masing menu yang dipesan dengan menggunakan rumus:
            //Harga pembelian = jumlah pesanan masing-masing menu * harga masing-masing menu

            System.out.println("Pembelian : \n");
            System.out.println("1. Kelas VIP      " + pesan1 + " tiket * Rp.   " + String.format("%.2f", VIP) +
                    " =  Rp.  " + String.format("%.2f", harga1));
            System.out.println("2. Kelas I      " + pesan2 + " tiket * Rp.  " + String.format("%.2f", I) +
                    " =  Rp.  " + String.format("%.2f", harga2));
            System.out.println("3. Kelas II    " + pesan3 + " tiket * Rp.  " + String.format("%.2f", II) +
                    " =  Rp.  " + String.format("%.2f", harga3));
            System.out.println("4. Kelas III    " + pesan4 + " tiket * Rp.  " + String.format("%.2f", III) +
                    " =  Rp.  " + String.format("%.2f", harga4));
            System.out.println("=====================================================================");

            // total pembelian yang didapat dari hasil penjumlahan Harga pembelian.

            totalPembelian = harga1 + harga2 + harga3 + harga4;
            System.out.println("Total pembelian                                     =  Rp. " + String.format("%.2f", totalPembelian));

            // Harga diskon = total pembelian * 10%
            totalPPN = totalPembelian * 0.1;
            System.out.println("Pajak 10% (PPN)                             =  Rp. " + String.format("%.2f", totalPPN) + "    +");
            System.out.println("=====================================================================");

            //Hitung dan tampilkan Total pembelian setelah pajak, dengan rumus :
            //Total pembelian setelah pajak = total pembelian + Pajak

            setelahPPN = totalPembelian + totalPPN;
            System.out.println("Total " + jumlahTiket + " tiket                                               =  Rp. " + String.format("%.2f", setelahPPN));

            System.out.println("\n           Terima kasih atas pemesanan tiket anda bapak/ ibu : , " + namaPemesan + "!");

            isNext = getYesorNo("Apakah anda ingin mememesan lagi ?");

        }


    }

    private static boolean getYesorNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

}