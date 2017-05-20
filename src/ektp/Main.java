/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektp;
import java.util.ArrayList;
import ektp.Enkap;
import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;
/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Enkap> rt1kl1 = new ArrayList<>();
        ArrayList<Enkap> rt2kl1 = new ArrayList<>();
        ArrayList<Enkap> rt3kl1 = new ArrayList<>();
        ArrayList<Enkap> rt4kl1 = new ArrayList<>();
        ArrayList<Enkap> rt1kl2 = new ArrayList<>();
        ArrayList<Enkap> rt2kl2 = new ArrayList<>();
        ArrayList<Enkap> rt3kl2 = new ArrayList<>();
        ArrayList<Enkap> rt4kl2 = new ArrayList<>();
        
        do{
            int ip, r1, pilih;
            Scanner menu = new Scanner(System.in);
            System.out.println("Form E-Ktp");
            System.out.println("");
            System.out.println("1. Isi Form anda");
            System.out.println("2. Tampil data anda");
            System.out.println("pilih 1 / 2");
            pilih = menu.nextInt();
            
            if (pilih == 1){
                String NIK, NAMA, TANGGAL, ALAMAT, AGAMA, JENIS, STATUS, PEKERJAAN, WARGA;
                Scanner isi = new Scanner(System.in);
                System.out.println("Isi Form anda di bawah ini :");
                System.out.println("Nomor Induk Keluarga :");
                NIK = isi.nextLine();
                System.out.println("Nama :");
                NAMA = isi.nextLine();
                System.out.println("Tempat Tanggal Lahir :");
                TANGGAL = isi.nextLine();
                System.out.println("Alamat :");
                ALAMAT = isi.nextLine();
                System.out.println("Agama :");
                AGAMA = isi.nextLine();
                System.out.println("Jenis Kelamin (Laki-laki / Perempuan) :");
                JENIS = isi.nextLine();
                System.out.println("Status (Kawin / Belum kawin / Bercerai):");
                STATUS = isi.nextLine();
                System.out.println("Pekerjaan :");
                PEKERJAAN = isi.nextLine();
                System.out.println("Warganegara (WNI / WNA) :");
                WARGA = isi.nextLine();
}
