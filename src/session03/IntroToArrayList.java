package session03;

import java.util.ArrayList;

public class IntroToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> daftarMahasiswa = new ArrayList<>();
		
//		C: Create Mahasiswa
		daftarMahasiswa.add("Andrea");
		daftarMahasiswa.add("Angeline");
		daftarMahasiswa.add("Stephanie");
		
		System.out.println(daftarMahasiswa);
		
//		R: Read Mahasiswa
		System.out.println(daftarMahasiswa.get(0));
		
//		U: Update Mahasiswa
		daftarMahasiswa.set(0, "Anderies");
		System.out.println(daftarMahasiswa);
		
//		D: Delete Mahasiswa
		daftarMahasiswa.remove(1);
		System.out.println(daftarMahasiswa);
	}

}
