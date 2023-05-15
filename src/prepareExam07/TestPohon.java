package prepareExam07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPohon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Daun(Health Point), Batang(Defense Point) , Ranting (Attack Point)
//		Cukup Sekali
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Masukkan Daun: ");
//		int daun = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.println("Masukkan Ranting: ");
//		int batang = scan.nextInt();
//		scan.nextLine();
		
//		ini tugas untuk membentuk Object
//		Pohon pohonA = new Pohon(15,10,10);
//		Pohon pohonB = new Pohon(15,5,10);
//		System.out.println("Pohon A mempunyai HP : " + pohonA.getDaun());
//		System.out.println("Pohon A mempunyai DP : " + pohonA.getBatang());
//		Abstraction
		ArrayList<Pohon> pohonArrayList = new ArrayList<>();

		pohonArrayList.add(new Pohon(10,15,10));
		pohonArrayList.add(new Pohon(20,15,10));
		
        ArrayList<Integer> list = new ArrayList<>();
                
		bertarung(pohonArrayList);
		
		
//		Pohon A dan Pohon B mereka ini bertarung. 
//		Pohon A Attack mengurangi Ranting mengurangi HP Pohon B
//		DP - AP
//		System.out.println(pohonA.getBatang() - pohonA.getRanting());
//		10 - 15Ranting
		
	
//		System.out.println("Setelah serangan : Pohon B memiliki HP: " + pohonB.getDaun());
		
	
//		System.out.println("Pohon A mempunyai Attack Point : " + pohonA.getRanting());
//		System.out.println("Pohon diberikan 15 HP Tambahan");
//		pohonA.setDaun(pohonA.getDaun() + 15);
//		
//		System.out.println("Setelah ditambahkan " + pohonA.getDaun());
//		
//		Pohon pohonB = new Pohon(12,15,20);
//		System.out.println("Pohon B mempunyai HP : " + pohonB.getDaun());
		
		
	}
	
	// Function to display the array List
    public static void display(ArrayList<Pohon> list)
    {
        System.out.println(list);
    }
    
	public static void bertarung(ArrayList<Pohon> pohon) {
		for(Pohon el: pohon) {
			System.out.println(el.getDaun());
		}
//		display(pohon);
//		System.out.println(pohon.get(0));
	}

}
