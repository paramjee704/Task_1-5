class Complex
{
    double real;
    static double imag;
    public Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    public static void main(String[] args)
    {
        Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0),
                total, diff;
        total = add(n1, n2);
        diff = sub(n1,n2);
        System.out.printf("Sum = %.1f + %.1fi", total.real, total.imag);
        System.out.printf("Diff = %.1f - %.1fi", diff.real, diff.imag);

    }
    public static Complex add(Complex n1, Complex n2)
    {
        Complex total = new Complex(0.0, 0.0);
        total.real = n1.real + n2.real;
        total.imag = n1.imag + n2.imag;
        return(total);
    }

    public static Complex sub(Complex n1, Complex n2) {

        {
            Complex diff = new Complex(0.0, 0.0);
            diff.real = n1.real - n2.real;
            diff.imag = n1.imag - n2.imag;
            return (diff);
        }


    }

}
