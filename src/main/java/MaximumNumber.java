import java.util.Arrays;

public class MaximumNumber<X extends Comparable>  {
    X[] arr;

    public MaximumNumber(X... value) {
        X[] arrayObject =(X[]) new Comparable[value.length];
        int i=0;
        for (X val : value) {
            arrayObject[i++] = val;
        }
        this.arr = arrayObject;
    }

    public X findMaximum() {
        Arrays.sort(arr);
        X max;
        max = arr[arr.length-1];
        printMax(max);
        return max;
    }

    private static <E extends  Comparable> void printMax(E max) {
        System.out.println(max);
    }

}