/*
Nama		: FADHILAH RIFQI 
Stambuk	: 13020180091
Kelas	: B2

no. 2 tugas 8
Buatlah program variabel static
*/

class VarStatic{
	
	static int Nilai = 100;
	
	public void min(){
		Nilai--;
	}

	public static void main(String[] args){
		VarStatic nilai = new VarStatic();
		VarStatic nilai1 = new VarStatic();
		VarStatic nilai2 = new VarStatic();
		
		nilai.min();
		nilai1.min();
		nilai2.min();
		
		System.out.println("Nilai 1 : "+nilai.Nilai);
		System.out.println("Nilai 2 : "+nilai1.Nilai);
		System.out.println("Nilai 3 : "+nilai2.Nilai);
	}
}

/*
output:
Nilai 1 : 97
Nilai 2 : 97
Nilai 3 : 97

Penjelasan:
Variabel static adalah variabel yang di-share oleh semua 
objek dalam suatu class. 
jadi pada program di atas Nilai merupakan variabel static yang 
bertipe data int dan diberi nilai 100. ada method min yang berisi 
proses pengurangan nilai dengan angka satu.
pada fungsi main nya di buatkan instance objek nilai, nilai1, dan nilai2.
ketika satu instans objek nilai memanggil methode min maka proses yang 
dilakukan adalah pengurangan variabel static Nilai dari 100 menjadi 99.
kemudian satu instans objek nilai1 memanggil methode min maka proses yang 
dilakukan adalah pengurangan variabel static Nilai dari 99 menjadi 98.
dan ketika satu instans objek nilai2 memanggil methode min maka proses yang 
dilakukan adalah pengurangan variabel static Nilai dari 98 menjadi 97.
jadinya variabel static sekarang bernilai 97. dan ketika pemanggilan
maka variabel static ini akan di pakai oleh semua objek dalam satu kelas.
sehingga output yang keluar adalah 97 97 97 untuk semua pemanggilan objek yang berbeda.
*/