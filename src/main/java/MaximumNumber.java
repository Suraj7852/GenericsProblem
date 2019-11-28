public class MaximumNumber<E extends Comparable>  {
    E intNumber;

    public MaximumNumber(E intNumber) {
        this.intNumber = intNumber;
    }

    public static <E extends  Comparable> E findMaximum(E i, E i1, E i2) {
        return (i.compareTo(i1)>0?i:i1.compareTo(i2)>0?i1:i2);
    }
}