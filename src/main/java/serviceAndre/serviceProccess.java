/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceAndre;

/**
 *
 * @author ASUS
 */
public class serviceProccess {
    public String tampilNama(){
        return "Andre";
    }
    public String tampilNIM(){
        return "20200140075";
    }
    public String tampilAngkatan(){
        return "2020";
    }
    public String cekNama(){
        String nama = tampilNama();
        String validasi = "";
        
        if (nama.equals("Andre")){
            validasi = "Ini laptop saya.";
        }else{
            validasi = "Kamu siapa?";
        }
        return validasi;
    }
    public String cekAngka(int number){
        String jenis = "";
        
        if (number%2==0){
            jenis = " Genap";
        }else{
            jenis = " Ganjil";
        }
        return jenis;
    }
    public String viewUserSedikit(){        
        String nama = tampilNama(); //nama = "Alam"
        String nim = tampilNIM();
        String angkatan = tampilAngkatan();
        String validasi = cekNama();
        String jenisangka = cekAngka(15);
        
        //String tampilkan = nama + " " + nim + " " + angkatan + ", " + validasi + jenisangka;
        String tampilkan
                = "Nama: " + nama + "<br>"
                + "NIM: " + nim + "<br>"
                + "Angkatan: " + angkatan + "<br>"
                + "Hasil validasi: " + validasi + "<br>"
                + "Jenis angka 15: " + jenisangka;
        
        return tampilkan;
    }
}
