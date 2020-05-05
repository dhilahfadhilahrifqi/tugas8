/* 
Nama		: FADHILAH RIFQI 
Stambuk	: 13020180091
Kelas	: B2

no 1. tugas 8.
Buatlah program sederhana yang mana di dalam konstructor dan method menggunakan kata kunci this
*/

class X{

	int p,q;
	
	X(int x, int y){
		this.p=x;
		this.q=y;
	}
	
	void cetak(){
		this.p=5;
		this.q=4;
	}
	
	public static void main(String[] args){
		
		X tampil = new X(3,2);
		tampil.p=1; tampil.q=2;
		System.out.println("x : "+tampil.p +" dan y : "+tampil.q);
		tampil.cetak();
		System.out.println("P : "+tampil.p);
		System.out.println("Q : "+tampil.q);
	}
}

/*
output:
x : 1 dan y : 2
P : 5
Q : 4

penjelasan:
Kata kunci this dipergunakan pada pembuatan kelas dan digunakan 
untuk menyatakan objek sekarang. Untuk menghindari variabel 
yang sama antara variabel class dengan variabel property.

Pada kontructor X terdapat kunci this yang mana mengacu pada nilai
p dan q yang diberikan nilai oleh x dan y pada parameternya.
this pada method cetak() variabel p diberi nilai 5
dan variabel q di beri nilai 4.
kemudia di panggil melalui instance objek tampil.
*/