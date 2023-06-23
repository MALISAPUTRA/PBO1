/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author ACER NITRO
 */
public class datasetdetailpemesanan {

    private ArrayList<String> idpesanan;
    private ArrayList<String> jumlahpesanan;
    private ArrayList<String> harga;
    private ArrayList<String> total;
    private ArrayList<String> status;
    
    public datasetdetailpemesanan(){
        idpesanan = new ArrayList<>();
        jumlahpesanan = new ArrayList<>();
        harga = new ArrayList<>();
        total = new ArrayList<>();
        status = new ArrayList<>();
    }
    
    public void addIdpesanan(String value){
        this.idpesanan.add(value);
    }
    
    public ArrayList<String> getDataIdpesanan(){
        return this.idpesanan;
    }
    
    public void addJumlahpesanan(String value){
        this.jumlahpesanan.add(value);
    }
    
    public ArrayList<String> getDataJumlahpesanan(){
        return this.jumlahpesanan;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
    
    public void addTotal(String value){
        this.total.add(value);
    }
    
    public ArrayList<String> getDataTotal(){
        return this.total;
    }
    
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void TambahBarang(String Idpesanan, String Jumlahpesanan, String Harga,
            String Total,String Status){
        addIdpesanan(Idpesanan);
        addJumlahpesanan(Jumlahpesanan);
        addHarga(Harga);
        addTotal(Total);
        addStatus(Status);
    }
}
