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
public class datasettotalpembayaran {
    
    private ArrayList<String> id;
    private ArrayList<String> nama;
    private ArrayList<String> jumlahpembayaran;
    
    public datasettotalpembayaran(){
        id = new ArrayList<>();
        nama = new ArrayList<>();
        jumlahpembayaran = new ArrayList<>();
    }
    
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataId(){
        return this.id;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
        public void addJumlahpembayaran(String value){
        this.jumlahpembayaran.add(value);
    }
    
    public ArrayList<String> getDataJumlahpembayaran(){
        return this.jumlahpembayaran;
    }
    public void TambahBarang(String Id,String Nama,String Jumlahpembayaran){
        addId(Id);
        addNama(Nama);
        addJumlahpembayaran(Jumlahpembayaran);
    }
}
