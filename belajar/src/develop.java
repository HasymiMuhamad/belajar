public class develop {

    float a = 12;
    float b = 34;
    float c = 44;
    public float data = 55;

    public float kurang (){
        develop a1 = new develop();
        float hasil = a1.a - a1.b;
        return hasil;
    }

    public float tambah (){
        develop a2 = new develop();
        float hasil2 = a2.a + a2.b;
        return hasil2;
    }

    public float perkalian(){
        develop a4 = new develop();
        float hasilKali = a4.a*a4.b;
        return hasilKali;
    }

    public float pembagian(){
        develop a5 = new develop();
        float hasilBagi = a5.a/a5.b;
        return hasilBagi;
    }

    public void dataPrint (){
        float hitung = a/b;
        System.out.println(data);
        System.out.println(hitung);
    }

    public static void main (String args[]){
        develop a3 = new develop();
        System.out.println(a3.tambah());
        System.out.println(a3.kurang());
        System.out.println(a3.perkalian());
        System.out.println(a3.pembagian());
        a3.dataPrint();

    }
}
