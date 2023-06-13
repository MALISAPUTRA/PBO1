/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mhmmdalisaputra2110010502;

/**
 *
 * @author ACER NITRO
 */
public class DETAIL_PEMESANAN {
    private String idpesanan,jumlahpesanan,harga,total,status;
    
    public DETAIL_PEMESANAN(){}
    
    public void setIDPESANAN(String idpesanan){
        this.idpesanan=idpesanan;
    }
    public String getIDPESANAN (){
        return this.idpesanan;
    }
    public void setJUMLAHPESANAN(String jumlahpesanan){
        this.jumlahpesanan=jumlahpesanan;
    }
    public String getJUMLAHPESANAN (){
        return this.jumlahpesanan;
    }
    public void setHARGA(String harga){
        this.harga=harga;
    }
    public String getHARGA (){
        return this.harga;
    }
    public void setTOTAL(String total){
        this.total=total;
    }
    public String getTOTAL (){
        return this.total;
    }
    public void setSTATUS(String status){
        this.status=status;
    }
    public String getSTATUS (){
        return this.status;
    }
    
}
