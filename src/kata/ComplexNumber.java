package kata;

import java.util.HashSet;
import java.util.Set;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {

    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final ComplexNumber other = (ComplexNumber) obj;

        if(Double.compare(this.re, other.re) != 0) {
            return false;
        }

        if(Double.compare(this.im, other.im) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;

        long lre = Double.doubleToLongBits(re);
        long lim = Double.doubleToLongBits(im);

        hash = hash * 79 + (int)(lre ^ (lre >>> 32));
        hash = hash * 79 + (int)(lim ^ (lim >>> 32));

        return hash;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        // a.equals(b) must return true
        // a.hashCode() must be equal to b.hashCode()
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(a));
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        Set<ComplexNumber> numbersSet = new HashSet<>();
        numbersSet.add(a);
        numbersSet.add(b);

        System.out.println("Hash a: " + a.hashCode());
        System.out.println("Hash b: " + b.hashCode());
        System.out.println("Размер множества: " + numbersSet.size());
        System.out.println("Set содержит 1: " + numbersSet.contains(new ComplexNumber(1, 1)));

    }

}
