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
public class datasetMember {
    public class datasetBarang {
    private ArrayList<String> id;
    private ArrayList<String> nama;
    private ArrayList<String> namatoko;
    private ArrayList<String> alamat;
    private ArrayList<String> email;
    private ArrayList<String> password; 
    private ArrayList<String> saldo;
    private ArrayList<String> jenis; 
    private ArrayList<String> notlp; 
    private ArrayList<String> status;
    
    public datasetBarang(){
        id = new ArrayList<>();
        nama = new ArrayList<>();
        namatoko = new ArrayList<>();
        alamat = new ArrayList<>();
        email = new ArrayList<>();
        password = new ArrayList<>();
        saldo = new ArrayList<>();
        jenis = new ArrayList<>();
        notlp = new ArrayList<>();
        status = new ArrayList<>();
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
    
    public void addNamaToko(String value){
        this.namatoko.add(value);
    }
    
    public ArrayList<String> getDataNamaToko(){
        return this.namatoko;
    }
    
    public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getDataEmail(){
        return this.email;
    }
    
    public void addPassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getDataPassword(){
        return this.password;
    }
    
    public void addSaldo(String value){
        this.saldo.add(value);
    }
    
    public ArrayList<String> getDataSaldo(){
        return this.saldo;
    }
    
    public void addJenis(String value){
        this.jenis.add(value);
    }
    
    public ArrayList<String> getDataJenis(){
        return this.jenis;
    }
    
    public void addNoTlp(String value){
        this.notlp.add(value);
    }
    
    public ArrayList<String> getDataNoTlp(){
        return this.notlp;
    }
    
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void TambahBarang(String Id, String Nama, String NamaToko,
            String Alamat, String Email, String Password, String Saldo, String Jenis, String NoTlp, String Status){
        addId(Id);
        addNama(Nama);
        addNamaToko(NamaToko);
        addAlamat(Alamat);
        addEmail(Email);
        addPassword(Password);
        addSaldo(Saldo);
        addJenis(Jenis);
        addNoTlp(NoTlp);
        addStatus(Status);
    }
}
}
