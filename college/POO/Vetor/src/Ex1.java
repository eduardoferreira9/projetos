public class Ex1 {
    public static void main(String[] args){
        int [] v = new int[50];

        for (int i = 0; i < 50; i++) {
            v[i] = (i + 5 * i) % (i + 1);
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(v[i]);
        }
    }
}
