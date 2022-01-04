/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.Activity1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import serviceAndre.serviceProccess;

/**
 *
 * @author ASUS
 */
@Controller
@ResponseBody
public class projectController {
    
    logicalProccess hitung = new logicalProccess(); 
    
    @RequestMapping("/konversiusdtoidr") 
    public String tampilusdtoidr(){ 
        
        double idr = hitung.getUSDIDR(5); 
        
        String view = "Hasil konversi 5 USD ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
        
    @RequestMapping("/konversiksatoidr") 
    public String tampilksatoidr(){ 
        
        double idr = hitung.getKSAIDR(5); 
        
        String view = "Hasil konversi 5 KSA ke IDR = " + idr + " Rupiah."; 
        
        return view;
    }
    
    @RequestMapping("/konversiusdtomyr") 
    public String tampilusdtomyr(){ 
        
        double myr = hitung.getUSDMYR(5); 
        
        String view = "Hasil konversi 5 USD ke MYR = " + myr + " Ringgit."; 
        
        return view; 
    }
    
    @RequestMapping("/konversisgdtoidr") 
    public String tampilsgdtoidr(){ 
        
        double sgd = hitung.getSGDIDR(5); 
        
        String view = "Hasil konversi 5 SGD ke IDR = " + sgd + " Rupiah."; 
        
        return view; 
    }
    @RequestMapping("/konversisemuakurs") 
    public String konversisemuakurs(){ 
        String tampilkan;
        tampilkan = hitung.tampilsemuakonversi();
        
        return tampilkan;
    }
    
    serviceProccess andre = new serviceProccess(); 
    
    @RequestMapping("/tampiluser")
    public String viewUser(){
        String nama, nim, angkatan, validasi, jenisangka, tampilkan;
        
        nama = andre.tampilNama();
        nim = andre.tampilNIM();
        angkatan = andre.tampilAngkatan();
        validasi = andre.cekNama();
        
        jenisangka = andre.cekAngka(20);
        
        
        tampilkan = nama + " " + nim + " " + angkatan + ", " + validasi + jenisangka;
        
        return tampilkan;
    }
    
    @RequestMapping("/tampilusersimpel")
    public String viewUserSimpel(){
        String tampilkan;
        tampilkan = andre.viewUserSedikit();
        
        return tampilkan;
    }
}

