public class PrintArray <X, Y,Z> {
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
    public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Character[] charArray = {'a','b','c','d'};
        Double[] doubleArray = {1.1,2.2,3.6,5.2};

        toPrint(intArray);
        toPrint(charArray);
        toPrint(doubleArray);
        new PrintArray<Integer,Character,Double>(intArray,charArray,doubleArray).toPrint();
    }

    private void toPrint() {
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private static <E> void toPrint(E[] intArray) {
        for(E inp:intArray)
            System.out.println(inp);
    }
}
