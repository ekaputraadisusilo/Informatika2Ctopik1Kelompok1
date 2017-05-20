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
                
                Enkap isian = new Enkap();
                isian.setNik(NIK);
                isian.setNama(NAMA);
                isian.setTempatl(TANGGAL);
                isian.setAlamat(ALAMAT);
                isian.setAgama(AGAMA);
                isian.setJenis(JENIS);
                isian.setStatus(STATUS);
                isian.setPekerjaan(PEKERJAAN);
                isian.setWarganegara(WARGA);
                
                
                Scanner lr = new Scanner (System.in);
                System.out.println("Pilih Kelurahan Anda");
                System.out.println("1. Landungsari");
                System.out.println("2. Sukun");
                System.out.println("Masukkan Kelurahan :");
                ip = lr.nextInt();
                if(ip == 1){
                    System.out.println("1. RT 1");
                    System.out.println("2. RT 3");
                    System.out.println("3. RT 3");
                    System.out.println("4. RT 4");
                    System.out.println("Masukkan RT :");
                    r1= lr.nextInt();
                    
                    if(r1 == 1){
                        isian.setDesa("Landungsari");
                        isian.setRt("RT 1");
                        rt1kl1.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                   
                    }
                    else if(r1 == 2){
                        isian.setDesa("Landungsari");
                        isian.setRt("RT 2");
                        rt2kl1.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else if(r1 == 3){
                        isian.setDesa("Landungsari");
                        isian.setRt("RT 3");
                        rt3kl1.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else if(r1 == 4){
                        isian.setDesa("Landungsari");
                        isian.setRt("RT 4");
                        rt4kl1.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else{
                        System.out.println("Error, Melebihi batas RT");
                    }
            
                }
                else if(ip == 2){
                    System.out.println("1. RT 1");
                    System.out.println("2. RT 3");
                    System.out.println("3. RT 3");
                    System.out.println("4. RT 4");
                    System.out.println("Masukkan RT :");
                    r1= lr.nextInt();
                    if(r1 == 1){
                        isian.setDesa("Sukun");
                        isian.setRt("RT 1");
                        rt1kl2.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else if(r1 == 2){
                        isian.setDesa("Sukun");
                        isian.setRt("RT 2");
                        rt2kl2.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else if(r1 == 3){
                        isian.setDesa("Sukun");
                        isian.setRt("RT 3");
                        rt3kl2.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else if(r1 == 4){
                        isian.setDesa("Sukun");
                        isian.setRt("RT 4");
                        rt4kl2.add(isian);
                        Scanner yolo = new Scanner(System.in);
                        yolo.nextLine();
                    }
                    else{
                        System.out.println("Error, Melebihi batas RT.");
                    }
                }
            }
            else if(pilih == 2){
                int pilihr, pilihk;
                Scanner tampil = new Scanner(System.in);
                System.out.println("Tampil Data");
                System.out.println("Pilih data anda");
                System.out.println("1. Landungsari");
                System.out.println("2. Sukun");
                System.out.println("Pilih (1 / 2) :");
                pilihk = tampil.nextInt();
                if (pilihk == 1){
                    System.out.println("Anda Memilih kelurahan Landungsari");
                    System.out.println("Pilih RT Anda :");
                    System.out.println("1. RT 1");
                    System.out.println("2. RT 2");
                    System.out.println("3. RT 3");
                    System.out.println("4. RT 4");
                    System.out.println("Pilih (1 / 2 / 3 / 4) :");
                    pilihr = tampil.nextInt();
                    if (pilihr == 1){
                        for(Enkap is : rt1kl1){
                            System.out.println("RT 1");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }else if(pilihr == 2){
                        for(Enkap is : rt2kl1){
                            System.out.println("RT 2");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }
                    else if(pilihr == 3){
                        for(Enkap is : rt3kl1){
                            System.out.println("RT 3");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }else if(pilihr == 4){
                        for(Enkap is : rt4kl1){
                            System.out.println("RT 4");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }else {
                        System.out.println("Error data tidak ditemukan.");
                    }
                }
                else if(pilihk == 2){
                    System.out.println("Anda Memilih kelurahan Sukun");
                    System.out.println("Pilih RT Anda :");
                    System.out.println("1. RT 1");
                    System.out.println("2. RT 2");
                    System.out.println("3. RT 3");
                    System.out.println("4. RT 4");
                    System.out.println("Pilih (1 / 2 / 3 / 4) :");
                    pilihr = tampil.nextInt();
                    if (pilihr == 1){
                        for(Enkap is : rt1kl2){
                            System.out.println("RT 1");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }
                    else if(pilihr == 2){
                        for(Enkap is : rt2kl2){
                            System.out.println("RT 2");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }
                    else if(pilihr == 3){
                        for(Enkap is : rt3kl2){
                            System.out.println("RT 3");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }
                    else if(pilihr == 4){
                        for(Enkap is : rt4kl2){
                            System.out.println("RT 4");
                            System.out.println("NIK                  :"+is.getNik());
                            System.out.println("Nama                 :"+is.getNama());
                            System.out.println("Tempat Tanggal Lahir :"+is.getTempatl());
                            System.out.println("Alamat               :"+is.getAlamat());
                            System.out.println("Agama                :"+is.getAgama());
                            System.out.println("Jenis Kelamin        :"+is.getJenis());
                            System.out.println("Status               :"+is.getStatus());
                            System.out.println("Pekerjaan            :"+is.getPekerjaan());
                            System.out.println("Warganegara          :"+is.getWarganegara());
                        }
                    }
                    else{
                        System.out.println("Error, data tidak ditemukan.");
                    }
}
