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
    
    private ArrayList<String> id;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> email;
    private ArrayList<String> password;  
    private ArrayList<String> notlp; 
    private ArrayList<String> status;
    
    public datasetMember(){
        id = new ArrayList<>();
        nama = new ArrayList<>();
        alamat = new ArrayList<>();
        email = new ArrayList<>();
        password = new ArrayList<>();
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
    public void TambahBarang(String Id, String Nama,
        String Alamat, String Email, String Password,String NoTlp, String Status){
        addId(Id);
        addNama(Nama);
        addAlamat(Alamat);
        addEmail(Email);
        addPassword(Password);
        addNoTlp(NoTlp);
        addStatus(Status);
    }
}
