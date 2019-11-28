public class MaximumNumber<X,Y,Z extends Comparable>  {
    X intNumber;
    Y doubleNumber;
    Z stringValue;

    public MaximumNumber(X intNumber, Y doubleNumber, Z stringValue) {
        this.intNumber = intNumber;
        this.doubleNumber = doubleNumber;
        this.stringValue = stringValue;
    }

    public static <E extends  Comparable> E findMaximum(E i, E i1, E i2) {
        E max;
        max = (i.compareTo(i1)>0?i:i1.compareTo(i2)>0?i1:i2);
        printMax(max);
        return max;
    }

    private static <E extends  Comparable> void printMax(E max) {
        System.out.println(max);
    }

}