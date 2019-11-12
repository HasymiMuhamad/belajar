public class number {

    Integer a = 8;
    public  static void  main (String args []){
        number a1 = new number();
        Integer angka = a1.a;
        Integer x = 7;
        System.out.println(x.floatValue());

        System.out.println(x.byteValue());

        System.out.println(x.doubleValue());

        System.out.println(angka.compareTo(3));
        System.out.println(angka.compareTo(8));
        System.out.println(angka.compareTo(9));

    }
}
