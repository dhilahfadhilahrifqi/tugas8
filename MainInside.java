/* 
Nama		: FADHILAH RIFQI 
Stambuk	: 13020180091
Kelas	: B2

no 3. tugas 8.
Apa output dari program berikut dan jelaskan mengapa demikian
*/

class Test{
	public static int counter=0;
	public Test(){
		counter+=1;
	}
	public int getCounter(){
		return counter;
	}
	public int addCounter(){
		return counter+=1;
	}
}

public class MainInside{
	public static void main(String[] args){
		Test obj1 = new Test();
		Test obj2 = new Test();
		Test obj3 = new Test();
		obj1.addCounter();
		
		System.out.println("Counter milik obj1 = "+obj1.getCounter());
		System.out.println("Counter milik obj2 = "+obj2.getCounter());
		System.out.println("Counter milik obj3 = "+obj3.getCounter());
	}
}

/*

output:
Counter milik obj1 = 4
Counter milik obj2 = 4
Counter milik obj3 = 4

penjelasan:
Bila suatu class memiliki static variable, maka variable tersebut akan dipakai bersama-sama oleh object dari class tersebut. Setiap objek dari class tersebut 
akan mengakses variable yang sama. Sehingga obj1, obj2, obj3 menggunakan variable 
yang sama (shared variable).
 
ketika satu instans objek obj1 memanggil methode test maka proses yang 
dilakukan adalah penambahan variabel static Counter dari 0 menjadi 1.
kemudian satu instans objek obj2 memanggil methode test maka proses yang 
dilakukan adalah penambahan variabel static Counter dari 1 menjadi 2.
dan ketika satu instans objek obj3 memanggil methode test maka proses yang 
dilakukan adalah penambahan variabel static Counter dari 2 menjadi 3.
dan terakhir intans objek obj1 memanggul methode addCounter maka proses
di dalamnya yang akan di jalankan yaitu nilai counter 3 tadi di tambahkan
lagi dengan 1 maka hasil akhirnya untuk variabel counter adalah 4.
jadi karena counter merupakan static variabel yang mana nilai di dalamnya
akan di pakai bersama-sama dalam objek yang berbeda dalam satu kelas
sehingga output yang tampil adalah 4 untuk obj1, 4 untuk obj2, dan 4 
untuk obj3.
*/