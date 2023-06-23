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
public class datasetPemesanan {
  
    private ArrayList<String> idpemesanan;
    private ArrayList<String> jumlahpemesanan;
    private ArrayList<String> totalpemesanan;
    private ArrayList<String> tanggalpemesanan;
    private ArrayList<String> waktupemesanan;
    private ArrayList<String> status;
    
    public datasetPemesanan(){
        idpemesanan = new ArrayList<>();
        jumlahpemesanan = new ArrayList<>();
        totalpemesanan = new ArrayList<>();
        tanggalpemesanan = new ArrayList<>();
        waktupemesanan = new ArrayList<>();
        status = new ArrayList<>();
    }
    
    public void addIdpemesanan(String value){
        this.idpemesanan.add(value);
    }
    
    public ArrayList<String> getDataIdpemesanan(){
        return this.idpemesanan;
    }
    
    public void addJumlahpemesanan(String value){
        this.jumlahpemesanan.add(value);
    }
    
    public ArrayList<String> getDataJumlahpemesanan(){
        return this.jumlahpemesanan;
    }
    
    public void addTotalpemesanan(String value){
        this.totalpemesanan.add(value);
    }
    
    public ArrayList<String> getDataTotalpemesanan(){
        return this.totalpemesanan;
    }
    
    public void addTanggalpemesanan(String value){
        this.tanggalpemesanan.add(value);
    }
    
    public ArrayList<String> getDataTanggalpemesanan(){
        return this.tanggalpemesanan;
    }
    
    public void addWaktupemesanan(String value){
        this.waktupemesanan.add(value);
    }
    
    public ArrayList<String> getDataWaktupemesanan(){
        return this.waktupemesanan;
    }
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void TambahBarang(String Idpemesanan, String Jumlahpemesanan, String Totalpemesanan,
            String Tanggalpemesanan, String Waktupemesanan, String Status){
        addIdpemesanan(Idpemesanan);
        addJumlahpemesanan(Jumlahpemesanan);
        addTotalpemesanan(Totalpemesanan);
        addTanggalpemesanan(Tanggalpemesanan);
        addWaktupemesanan(Waktupemesanan);
        addStatus(Status);
    }
}
