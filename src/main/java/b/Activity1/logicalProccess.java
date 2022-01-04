/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.Activity1;

/**
 *
 * @author ASUS
 */
public class logicalProccess {

    public double getUSDIDR(double usd){ //Memanggil method input
        
        double idr = usd*14225; //Mengonversikan mata uang
        
        return idr; //Mengembalikan nilai konversi
    }
    
    public double getKSAIDR(double ksa){ //Memanggil method input
        
        double idr = ksa*3816.45; //Mengonversikan mata uang
        
        return idr; //Mengembalikan nilai konversi
    }
    
    public double getUSDMYR(double usd){ //Memanggil method input
        
        double myr = usd*4.15; //Mengonversikan mata uang
        
        return myr; //Mengembalikan nilai konversi
    }
    
    public double getSGDIDR(double sgd){ //Memanggil method input
        
        double idr = sgd*10569.57; //Mengonversikan mata uang
        
        return idr; //Mengembalikan nilai konversi
    }
    public String tampilsemuakonversi(){ //Memanggil method input
        double usdidr = getUSDIDR(8);
        double myridr = getKSAIDR(8);
        double usdmyr = getUSDMYR(8);
        double sgdidr = getSGDIDR(8);
        
        double tampilkanusdidr = usdidr;
        String tampilusdidr = Double.toString(tampilkanusdidr);
        double tampilkanmyridr = myridr;
        String tampilmyridr = Double.toString(tampilkanmyridr);
        double tampilkanusdmyr = usdmyr;
        String tampilusdmyr = Double.toString(tampilkanusdmyr);
        double tampilkansgdidr = sgdidr;
        String tampilsgdidr = Double.toString(tampilkansgdidr);
        
        String tampil;
        tampil = "Hasil konversi dari Dollar Amerika ke Rupiah = Rp" + tampilusdidr + "<br>"
                + "Hasil konversi dari Ringgit ke Rupiah = Rp" + tampilmyridr + "<br>"
                + "Hasil konversi dari Dollar Amerika ke Ringgit = Rm" + tampilusdmyr + "<br>"
                + "Hasil konversi dari Dollar Singapura ke Rupiah = Rp" + tampilsgdidr;
        return tampil;
    }
}

