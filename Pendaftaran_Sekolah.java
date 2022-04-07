/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran_sekolah;

/**
 *
 * @author ASUS
 */
public class Pendaftaran_Sekolah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pembukaan1 obj = new pembukaan1();
        obj.awal();
        obj.keterangan();
        System.out.println("=========================");
        obj.keterangandiri1("AVIFTA YULYA RISMAWA", "AVIF");
        obj.keterangandiri2(5847783, 6272838);
        obj.keterangansekolahasal("SMPN 1 NGANJUK", "JL. Pramuka No 2 Nganjuk");
        obj.pilihanJurusan();
        obj.keterangandiri("RPL", "Ingin Belajar IT", "Suka Ngoding");
        System.out.println("=========================");
    }
    
}
