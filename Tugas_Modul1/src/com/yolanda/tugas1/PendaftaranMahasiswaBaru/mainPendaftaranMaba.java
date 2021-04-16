//Yolanda Al Hidayah Pasaribu - 19104057 - SE 03 B
package com.yolanda.tugas1.PendaftaranMahasiswaBaru;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mainPendaftaranMaba {
    public static void main(String[] args) throws IOException {
        //deklarasi
        int Angka,No_Hp, Nilai;
        String Kata,Nama, Ttl, Alamat, Asal_skl, Prodi, Jkel, Agama;

        Mahasiswa pendaftaran = new Mahasiswa();
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //input data
        System.out.println("=================================================");
        System.out.println(" PENDAFTARAN MAHASISWA BARU IT TELKOM PURWOKETO ");
        System.out.println("=================================================");

        System.out.print("Nama Lengkap\t\t\t\t:");
        Nama = input.nextLine();
        pendaftaran.setNama(Nama);

        System.out.print("Tempat, tanggal lahir\t\t: ");
        Ttl = input.nextLine();
        pendaftaran.setTgl_lahir(Ttl);

        System.out.print("Jenis Kelamin\t\t\t\t: ");
        Jkel = input.nextLine();
        pendaftaran.setJkel(Jkel);

        System.out.print("Agama\t\t\t\t\t\t:");
        Agama = input.nextLine();
        pendaftaran.setAgama(Agama);

        System.out.print("Alamat\t\t\t\t\t\t: ");
        Alamat = input.nextLine();
        pendaftaran.setAlamat(Alamat);

        System.out.print("No Hp\t\t\t\t\t\t: ");
        No_Hp = Integer.parseInt(br.readLine());
        pendaftaran.setNohp(No_Hp);

        System.out.print("Asal Sekolah\t\t\t\t: ");
        Asal_skl= input.nextLine();
        pendaftaran.setAsal_skl(Asal_skl);

        System.out.print("Nilai Ujian\t\t\t\t\t: ");
        Nilai = Integer.parseInt(br.readLine());
        pendaftaran.setNilai(Nilai);

        System.out.print("Program Studi yang dipilih\t:");
        Prodi = input.nextLine();
        pendaftaran.setProdi(Prodi);
        System.out.println("=================================================");

       //cetak
        System.out.println("=================== DATA DIRI ====================");
        System.out.println("Nama Lengkap\t\t\t\t:" + pendaftaran.getNama());
        System.out.println("Tempat, tanggal lahir\t\t:" + pendaftaran.getTgl_lahir());
        System.out.println("Jenis Kelamin\t\t\t\t:"+pendaftaran.getJkel());
        System.out.println("Agama\t\t\t\t\t\t:"+pendaftaran.getAgama());
        System.out.println("Alamat\t\t\t\t\t\t: "+pendaftaran.getAlamat());
        System.out.println("No Hp\t\t\t\t\t\t: "+pendaftaran.getNohp());
        System.out.println("Asal Sekolah\t\t\t\t: "+pendaftaran.getAsal_skl());
        System.out.println("Nilai Ujian\t\t\t\t\t: "+pendaftaran.getNilai());
        System.out.println("Program Studi yang dipilih\t:"+pendaftaran.getProdi());
        System.out.println();
        System.out.println("Terimakasih telah melakukan pendaftaran.");






    }

}
