package loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" X "+i+" = "+j*i+"     ");
            }
            System.out.println();
        }
    }
}
