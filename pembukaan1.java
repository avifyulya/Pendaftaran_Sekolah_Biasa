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
public class pembukaan1 implements Pembukaan{
    @Override
    public void awal(){
        System.out.println("PENERIMAAN PESERTA DIDIK BARU");
        System.out.println("PENDAFTARAN SMK TELKOM MALANG");
    }
    @Override
    public void keterangan(){
        System.out.println("Alamat: Jl. Danau Ranau, Sawojajar, Kec. Kedungkandang, Kota Malang, Jawa Timur 65139");
    }
    @Override
    public void keterangandiri1(String Nama_Panjang, String Nama_Panggilan){
        System.out.println("Nama Panjang        : "+Nama_Panjang);
        System.out.println("Nama Panggilan      : "+Nama_Panggilan);
    }
    @Override
    public void keterangandiri2(int NIS, int NISN){
        System.out.println("NIS                 : "+NIS);
        System.out.println("NISN                : "+NISN);
    }
    @Override
    public void keterangansekolahasal(String asalsekolah, String Alamatsekolahasal){
        System.out.println("Asal Sekolah        : "+asalsekolah);
        System.out.println("Alamat Sekolah Asal : "+Alamatsekolahasal);
    }
    @Override
    public void keterangandiri(String Jurusan, String Alasan1, String Alasan2){
        System.out.println("Jurusan yang dipilih : "+Jurusan);
        System.out.println("Alasan Memilih SMK telkom : "+Alasan1);
       System.out.println("Alasan Memilih Jurusan "+Jurusan+" : "+Alasan2);
    }
}
