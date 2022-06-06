import java.util.Scanner;

public class A1Com {
    public static void main(String args[]) {
        complex first = new complex();
        complex second = new complex();
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first number : ");
        a = sc.nextInt();
        System.out.print("Enter imag part of first number : ");
        b = sc.nextInt();
        first.getdata(a, b);
        System.out.print("Enter real part of second number : ");
        a = sc.nextInt();
        System.out.print("Enter imag part of second number : ");
        b = sc.nextInt();
        second.getdata(a, b);

        complex.add(first, second);
        complex.sub(first, second);
        complex.multiply(first, second);
        complex.division(first, second);

    }

}

class complex {
    int real, imag;

    public void getdata(int a, int b) {
        real = a;
        imag = b;
    }

    static void print(complex a) {
        System.out.println(a.real + "+" + a.imag + "i");
    }

    static void add(complex a, complex b) {
        complex c = new complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        System.out.print("Addition : ");
        print(c);
    }

    static void sub(complex a, complex b) {
        complex c = new complex();
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        System.out.print("Subtraction : ");
        print(c);
    }

    static void multiply(complex a, complex b) {
        complex c = new complex();
        c.real = a.real * b.real - a.imag * b.imag;
        c.imag = a.real * b.imag + b.real * a.imag;
        System.out.print("Multiplication : ");
        print(c);
    }

    static void division(complex a, complex b) {
        int div;
        complex c = new complex();
        div = (b.real * b.real + b.imag * b.imag);
        c.real = (a.real * b.real + a.imag * b.imag) / div;
        c.imag = (b.real * a.imag - a.real * b.imag) / div;
        System.out.print("Division : ");
        print(c);
    }
}
