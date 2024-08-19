 //Object Class
public class Karyawan{
    int id;
    String nama;
    String unit;
    String alamat;

    // Constructor
    // nama harus sama dgn Class
    public Karyawan() {
        id = 0;
        nama = "kosong";
        unit = "kosong";
        alamat = "kosong";
    }
    //Constructor Parameter
    public Karyawan(int id, String nama, double ipk) {
        //variabel = Parameter
        this.id=id;
        this.nama= nama;
        this.unit = unit;
        this.alamat = alamat;
     }

    // method print
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Unit : " + unit);
        System.out.println("alamat : " + alamat);
    }
}

