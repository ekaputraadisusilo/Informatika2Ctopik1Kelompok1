/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektp;

/**
 *
 * @author MY ASUS
 */
public class Enkap {
    private String Nik;
    private String Nama;
    private String Tempatl;
    private String Alamat;
    private String Agama;
    private String Jenis;
    private String Status;
    private String Pekerjaan;
    private String Warganegara;
    private String Rt;
    private String Desa;
    
    public String getRt() {
        return Rt;
    }

    public void setRt(String rt) {
        this.Rt = rt;
    }
    public String getDesa() {
        return Desa;
    }

    public void setDesa(String desa) {
        this.Desa = desa;
    }
    
    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    public void setNik(String nik){
        Nik = nik;
    }
    public void setNama(String nama){
        Nama = nama;
    }
}
