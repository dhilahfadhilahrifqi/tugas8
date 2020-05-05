/* 
Nama		: FADHILAH RIFQI 
Stambuk	: 13020180091
Kelas	: B2

no 5. tugas 8.
Buatlah dua class, class pertama berisi atribut: nidn(nomor induk dosen), nama dosen, jurusan, fakultas, email beserta getter setter.
(masing-masing tipe data bersifat private), class kedua beisi program utama yang akan mengakses calss pertama, gunakan getter dan setter
untuk seluruh variabel pada class petama. penamaan class bebas.
*/

class X{
	
	private String nidn;
	private String nmDosen;
	private String jurusan;
	private String fakultas;
	private String email;

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNmDosen() {
        return nmDosen;
    }

    public void setNmDosen(String nmDosen) {
        this.nmDosen = nmDosen;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Y {
    
    public static void main(String[] args){
    X data = new X();
    
    data.setNidn("12345678");
	data.setNmDosen("Bambang Purito");
	data.setJurusan("Teknik Informatika");
	data.setFakultas("Ilmu Komputer");
	data.setEmail("bambangpuri@gmail.com");
	
	System.out.println("Nidn		: " +data.getNidn());
	System.out.println("Nama Dosen	: " +data.getNmDosen());
	System.out.println("Jurusan		: " +data.getJurusan());
	System.out.println("Fakultas	: " +data.getFakultas());
	System.out.println("Email		: " +data.getEmail());

    }
}

/*
output;
Nidn            : 12345678
Nama Dosen      : Bambang Purito
Jurusan         : Teknik Informatika
Fakultas        : Ilmu Komputer
Email           : bambangpuri@gmail.com

PENJELASAN:
methode setter hanya untuk mengisi data dalam atribut dan methode getter
untuk mengambil nilai atribut.
jadi setNidn, setNmDosen, setJurusan, setFakultas, dan setEmail untuk
mengisi nilai di variabel Nidn, NmDosen, Jurusan, Fakultas, dan Email.
sedangkan getNidn, getNmDosen, getJurusan, getFakultas, dan getEmail untuk
mengambil nilai di variabel atau menampilkan nilai dari variabel
Nidn, NmDosen, Jurusan, Fakultas, dan Email.
*/