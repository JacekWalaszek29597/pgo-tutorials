import java.math.BigDecimal;
import java.util.List;
public class Adder {
    public int add(int a, int b) {
        return a+b;
    }
    public BigDecimal add(List<BigDecimal> liczby){
        BigDecimal suma = BigDecimal.ZERO;
        for(BigDecimal number: liczby){
            suma = suma.add(number);
        }
        return suma;
    }
}