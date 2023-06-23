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
public class datasetMenuKuliner {
   
    private ArrayList<String> idmakanan;
    private ArrayList<String> namamakanan;
    private ArrayList<String> harga;
    private ArrayList<String> rating;
    private ArrayList<String> status;
    
    public datasetMenuKuliner(){
        idmakanan = new ArrayList<>();
        namamakanan = new ArrayList<>();
        harga = new ArrayList<>();
        rating = new ArrayList<>();
        status = new ArrayList<>();
    }
    
    public void addIdmakanan(String value){
        this.idmakanan.add(value);
    }
    
    public ArrayList<String> getDataIdmakanan(){
        return this.idmakanan;
    }
    
    public void addNamamakanan(String value){
        this.namamakanan.add(value);
    }
    
    public ArrayList<String> getDataNamamakanan(){
        return this.namamakanan;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
    
    public void addRating(String value){
        this.rating.add(value);
    }
    
    public ArrayList<String> getDataRating(){
        return this.rating;
    }
    
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void TambahBarang(String Idmakanan, String Namamakanan, String Harga,
            String Rating,String Status){
        addIdmakanan(Idmakanan);
        addNamamakanan(Namamakanan);
        addHarga(Harga);
        addRating(Rating);
        addStatus(Status);
    }
}