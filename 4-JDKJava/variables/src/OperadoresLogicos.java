public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1416e3d;
        
        boolean b1 = k < l && i == j;
        System.out.println("b1 = " + b1);

    }
}
