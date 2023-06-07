public class Main {
    static int ing1 = 10;
    static short ing2 = 13;
    static short sg = 1000;
    static double dg = 987.654321;
    public static void main(String[] args) {

        byte b = -10;
        short s = 3021;
        int in= 11;
        int in1= 6;
        int in2= 3;
        long l = 15000;
        float f = 3.45f;
        double d = 9.87654321;
        char ch = 'C';
        boolean t = true;
        String st = "Java";
        int in3 = b+s;
        int in4 = (short) (in*s);


        System.out.println("in - in1 +in2 ="+ (in - in1 + in2));
        System.out.println("s - b ="+(s-b));
        System.out.println("in * b ="+(in * b));
        System.out.println("d - f ="+(d-f));
        System.out.println("l / in ="+(l/in));
        System.out.println("in % b ="+(in%b));

        System.out.println("Casting 2 types");
        System.out.println("b+s="+in3);
        System.out.println("(short) (in*s)="+in4);

        System.out.println("Obvious casting (short) (s + b) ="+(byte) (s+b));
        System.out.println("Not-obvious casting ( s + b) ="+ (s+b));
//        b is negative!
//        System.out.println(s);
//        short y = (short) s;
//        System.out.println(y);
//        return Math.round(x/y);
        System.out.println("Method (byte) (x*y) ="+multiply(ing2,ing1));
        System.out.println("Method Obvious (short) (x - y) ="+minus(dg,sg));
        System.out.println("Method Not-obvious (x - y) ="+minus1(dg,sg));
    }
    public static byte multiply (int x,int y) {
        return (byte) (x*y);
    }
    public static short minus (double x,short y) {
        return (short) (x - y);
    }
    public static double minus1 (double x,short y) {
        return  (x - y);
    }
}