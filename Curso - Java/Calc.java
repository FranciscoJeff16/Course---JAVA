public class Calc {
    static double somar(double n1, double n2) {
        return n1 + n2;
    }

    static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    static double dividir(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args){
        System.out.println(somar(2.6, 4.7));
        System.out.println(subtrair(2.6, 4.7));
        System.out.println(multiplicar(2.6, 4.7));
        System.out.println(dividir(2.6, 4.7));
    }
    
}
