public class MaximumNumber {
    public Integer findMaxNumber(Integer i, Integer i1, Integer i2) {
        return i.compareTo(i1)>0?i:i1.compareTo(i2)>0?i1:i2;
    }

    public Double findMaxDoubleNumber(Double v, Double v1, Double v2) {
        return v.compareTo(v1)>0?v:v1.compareTo(v2)>0?v1:v2;
    }
}