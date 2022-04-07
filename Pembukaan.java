/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran_sekolah;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public interface Pembukaan {
    void awal();
    void keterangan();
    void keterangandiri1(String Nama_Panjang, String Nama_Panggilan);
    void keterangandiri2(int NIS, int NISN);
    void keterangansekolahasal(String asalsekolah, String Alamatsekolahasal);
    default void pilihanJurusan(){
        System.out.println("Jurusan yang tersedia : ");
        System.out.println("1. Rekayasa Perangkat Lunak (RPL)");
        System.out.println("2. Teknik Komputer Jaringan (TKJ)");
    }
    void keterangandiri(String Jurusan, String Alasan1, String Alasan2);    
}
