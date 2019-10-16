package latihan.minmax;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Kelas kelas = new Kelas();
		Scanner reader = new Scanner(System.in);
		System.out.println("===Program Nilai Terbesar dan Terkecil Nilai Mahasiswa===");
		System.out.print("Masukan Nama Petugas : ");
		kelas.petugas = reader.next();
		System.out.print("Masukan Banyaknya Mahasiswa : ");
		kelas.jumlahMhs = reader.nextInt();

		for(int i = 0; i < kelas.jumlahMhs;i++) {
			System.out.print("Masukan Nilai Mahasiswa Ke-"+(i+1)+" =");
			int tmp = reader.nextInt();
			kelas.nilai.add(tmp);
		}
		
		System.out.println("");
		System.out.println("====Hasil Nilai Mahasiswa====");
		
		for(int i = 0; i < kelas.jumlahMhs;i++) {
			System.out.println("Nilai Mahasiswa ke-"+(i+1)+" = "+ kelas.nilai.get(i));
		}
		
		System.out.println("");
		System.out.println("Nilai Tertinggi adalah "+ kelas.findMax(kelas.nilai));
		System.out.println("Nilai Terendah adalah "+ kelas.findMin(kelas.nilai));
		System.out.println("");
		System.out.println("Nama Petugas : "+ kelas.petugas);

		
		reader.close();
	}

}
