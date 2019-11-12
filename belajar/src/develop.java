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
        a3.whileLoop();
        a3.forLoop();

    }

    public void whileLoop (){
        while (a < 50){
            System.out.println("nilai a =" + a);
            a++;
        }
    }

    public void forLoop (){
        develop a5 = new develop();
        float data1 = a5.b;
        float data2;
        int angka [] = {1,2,3,4,5};

        for (int bilangan : angka){
            if (bilangan  == 4){
                break;
            }

            System.out.println("ini nilai bilangan = "+bilangan);
        }

        for (data2 = 1 ; data2 < 40 ; data2++){
            System.out.println("nilai data2 =" + data2);
        }

        while (data1 < 40){
            System.out.println("nilai b = "+ data1);
            data1++;
        }

        do {
            System.out.println("nilai A = " + data1);
            data1++;
        } while ( data1 < 50);


    }
}
