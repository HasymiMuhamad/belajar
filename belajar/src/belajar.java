public class belajar {

    public int tambah (int a, int b){
        return a+b;
    }

    public  static void main (String args[]){
        belajar terus = new belajar();
        int hasil = terus.tambah(12, 45);

        System.out.println("Hasil Belajar = "+hasil);
    }

}
