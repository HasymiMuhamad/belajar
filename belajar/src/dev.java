public class dev {
    int data = 10;

    public float hasilData (){
        dev a1 = new dev();
        float hasil = a1.data;
        return hasil;
    }

    public static void main (String args []){
        dev a2 = new dev();
        a2.hasilData();
        System.out.println(a2.hasilData());
    }
}