/* 
Nama		: FADHILAH RIFQI 
Stambuk	: 13020180091
Kelas	: B2

no 4. tugas 8.
Buatlah program sederhana yang mana berisi method static
*/

class Test
{
   static void Tambah(int x, int y)
   {
		int tambah=x+y;
		int kurang=x-y;
		int kali=x*y;
		int bagi=x/y;
		System.out.println("Hasil tambah "+x +" dan "+y +" : " +tambah);
		System.out.println("Hasil kurang "+x +" dan "+y +" : " +kurang);
		System.out.println("Hasil kali "+x +" dan "+y +" : " +kali);
		System.out.println("Hasil bagi "+x +" dan "+y +" : " +bagi);
   }
}

public class MethodStatic
{
   public static void main(String[] args)
   {
      Test.Tambah(10,5);
   }
}

/*
output:
Hasil tambah 10 dan 5 : 15
Hasil kurang 10 dan 5 : 5
Hasil kali 10 dan 5 : 50
Hasil bagi 10 dan 5 : 2

Karena FUNGSI TAMBAH merupakan sebuah static method, maka kita dapat langsung 
mengaksesnya tanpa harus membuat sebuah object dari class Test. Perlu diingat 
juga bahwa suatu static method tidak bisa mengakses suatu non-static method 
dan instance variable.
*/
