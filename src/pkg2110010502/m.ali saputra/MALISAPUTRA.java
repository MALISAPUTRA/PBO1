/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010502.m.ali.saputra;

/**
 *
 * @author ACER NITRO
 */
public class MALISAPUTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MEMBER obj = new MEMBER ();
        obj.setID("01");
        obj.setNAMA("Ali");
        obj.setNAMATOKO("Toko Amir");
        obj.setALAMAT("Jalan Sudirman no 12");
        obj.setEMAIL("TokoAmir@gmail.com");
        obj.setPASSWORD("TokoAmir123");
        obj.setSALDO("Rp.1.000.000");
        obj.setJENIS("Nama Makanan");
        obj.setNOTLP("082154202971");
        obj.setSTATUS("Sukses");
        System.out.println("id :"+obj.getID()+"\n nama:"+obj.getNAMA()+"\n namatoko:"+obj.getNAMATOKO()+"\n alamat:"+obj.getALAMAT()+"\n email:"+obj.getEMAIL()+"\n password:"+obj.getPASSWORD()+"\n saldo:"+obj.getSALDO()+"\n jenis:"+obj.getSALDO()+"\n no tlp:"+obj.getNOTLP()+"\n status:"+obj.getSTATUS());
    }
    
}
