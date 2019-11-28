public class MaximumNumber {
    public Integer findMaxNumber(Integer i, Integer i1, Integer i2) {
        return i.compareTo(i1)>0?i:i1.compareTo(i2)>0?i1:i2;
    }
}