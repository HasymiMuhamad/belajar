public class bagian  {

    float angka = 12;
    float angka2 = 23;

    bagian() {
        float angka;
        float angka2;
    }

    public float bagi (float a, float b){
        return a/b;
    }

    public static void main (String args []){
        bagian a2 = new bagian();
        bagian a1 = new bagian();
        float hasil = a1.bagi(12, 23);
        float hasil2 = a2.angka;
        System.out.println(hasil2);
        System.out.println(hasil);
    }
}
