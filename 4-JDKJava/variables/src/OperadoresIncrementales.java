public class OperadoresIncrementales {
    public static void main(String[] args) {
        //pre incremento: primero aumenta y después asigna
            int i = 1;
            int j = ++i; //j = i+1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento: primero asigna y después aumenta
            i =2 ;
            j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Decremento
        int k = 1;
        int l = --i; //j = i+1
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
    }
}
