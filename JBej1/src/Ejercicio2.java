public class Ejercicio2 {
    public static void main(String[] args) {
        char c = (int) 'z';
        int i =  250;
        long iL = i;//casteo implicito.
        iL = (short) iL;//casteo explicito
        double d = 301.067;
        d = (long) 301.067;
        i = 100;

        float iF = (i + 5000.66F);
        System.out.println(iF);

        i =(byte) 737*100;
        System.out.println(i);
        d =(long) 298.638 / 25;
        System.out.println(d);
    }
}
