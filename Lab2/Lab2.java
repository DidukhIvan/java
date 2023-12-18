public class Lab2 {
    public static void main(String[] args) throws Exception
    {
        System.out.print("10 = " + T10(1.27, 10.99, 2.73, 25.32));
        System.out.print("\n11 = " + T11(0.478, -1.26, 2.68, 18.24));
        System.out.print("\n12 = " + T12(1.478, 9.26, 0.68, 2.24));
    }
    public static double T10(double a,double b,double c,double d) throws Exception
    {
        return (Math.pow(a, b)/Math.sinh(Math.abs(b))) + 4*(Math.log(c)/Math.pow(d, 1/4));
    }
    public static double T11(double a,double b,double c,double d) throws Exception
    {
        return 9*(Math.asin(a)/Math.cos(Math.sqrt(Math.abs(b)))) + Math.pow(2.43, d) + Math.log(c);
    }
    public static double T12(double a,double b,double c,double d) throws Exception
    {
        return 6*Math.pow((Math.sin(Math.abs(2*a))), Math.tan(b)) + Math.sqrt(c*(Math.cosh(-d)));
    }
}