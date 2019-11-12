public class learnConstructor {
    int num;
    learnConstructor(){
        num = 200;
    }


}

class learnClass {
    public static void main (String args []){
        learnConstructor t1 = new learnConstructor();
        learnConstructor t2 = new learnConstructor();
        String latihan = "panjang data masa depan";
        System.out.println(latihan.length());
        if (latihan.length() < 13 ){
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
        System.out.println("Hasil nya ="+ t1.num + "dan" + t2.num);
    }
}
