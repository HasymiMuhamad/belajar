public class number {

    Integer a = 8;
    public  static void  main (String args []){
        number a1 = new number();
        Integer angka = a1.a;
        String nama = "9";
        Integer x = 7;
        System.out.println(x.floatValue());

        System.out.println(x.byteValue());

        System.out.println(x.doubleValue());

        System.out.println(angka.compareTo(3));
        System.out.println(angka.compareTo(8));
        System.out.println(angka.compareTo(9));
        System.out.println(angka.toString());

        int b = Integer.parseInt(nama);
        System.out.println(b);

        int f = -20;

        System.out.println(Math.abs(f));

        double s = -123.675;

        System.out.println(Math.ceil(s));
        System.out.println(Math.floor(s));


    }
}
