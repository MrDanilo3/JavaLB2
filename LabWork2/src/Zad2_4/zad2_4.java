package Zad2_4;

public class zad2_4 {

    private static final double Epsilon = 0.0000001;


    public static void main(String[] args) {

        System.out.println("Нахождение корней уравнения x^3 - 4.5x^2 + 6.5x - 3 = 0");

        System.out.println("Newton's method:");
        System.out.println(CalculateRootUsingNewtonMethod(0, Epsilon));
        System.out.println(CalculateRootUsingNewtonMethod(2.2, Epsilon));
        System.out.println(CalculateRootUsingNewtonMethod(10, Epsilon));

        System.out.println("The method of dividing the segment in half:");
        System.out.println(CalculateRootUsingDividingLineSegmentInHalfMethod(-10, 0, Epsilon));
        System.out.println(CalculateRootUsingDividingLineSegmentInHalfMethod(0, 2.26, Epsilon));
        System.out.println(CalculateRootUsingDividingLineSegmentInHalfMethod(2.2, 10, Epsilon));
    }

    public static double Function(double x) {
        return x * x * x - 4.5 * x * x + 6.5 * x -3;
    }

    public static double FunctionDerivative(double x) {
        return 3 * x * x - 9 * x + (13/2);
    }

    //Calculating the root of an equation by Newton's method using a recursive function
    public static double CalculateRootUsingNewtonMethod(double x, double e) {
        double xn = x - Function(x) / FunctionDerivative(x);

        if (Math.abs(xn - x) < e) {
            return xn;
        }
        return CalculateRootUsingNewtonMethod(xn, e);
    }

    //Calculating the root of an equation by bisecting a segment using a recursive function
    public static double CalculateRootUsingDividingLineSegmentInHalfMethod(double a, double b, double e) {
        double c = (a + b) / 2;
        if (b - a <= e) return c;

        if (Function(a) * Function(c) < 0) return CalculateRootUsingDividingLineSegmentInHalfMethod(a, c, e);
        else if (Function(a) * Function(c) > 0) return CalculateRootUsingDividingLineSegmentInHalfMethod(c, b, e);
        else return c;
    }
}
