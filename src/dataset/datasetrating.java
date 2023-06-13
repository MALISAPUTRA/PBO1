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
public class datasetrating {
    private ArrayList<String> idrating;
    private ArrayList<String> rating;
    
    public datasetrating(){
        idrating = new ArrayList<>();
        rating = new ArrayList<>();
    }
    
    public void addIdrating(String value){
        this.idrating.add(value);
    }
    
    public ArrayList<String> getDataIdrating(){
        return this.idrating;
    }
    
    public void addrating(String value){
        this.rating.add(value);
    }
    
    public ArrayList<String> getDatarating(){
        return this.rating;
    }
    
    public void TambahBarang(String Idrating,String rating){
        addIdrating(Idrating);
        addrating(rating);
    }
}
}
} 
    
}
