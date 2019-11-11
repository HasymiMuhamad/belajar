public class belajar {

    public int tambah (int a, int b){
        return a+b;
    }

    public int kurang (int a, int b){
        return a-b;
    }

    public  static void main (String args[]){
        belajar terus = new belajar();
        int hasil = terus.tambah(12, 45);
        int hasilKurang = terus.kurang(34, 44);

        System.out.println("Hasil Belajar = "+hasil);
        System.out.println("Hasil kurang "+ hasilKurang);
    }

}
