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
        System.out.println("Hasil nya ="+ t1.num + "dan" + t2.num);
    }
}
