package hello.validator;

import hello.Fruits;
import hello.annotation.CheckStock;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashMap;
import java.util.Map;

public class StockValidator implements ConstraintValidator<CheckStock,String> {

    private static Map<Fruits,Integer> stocks=new HashMap<Fruits,Integer>();
    static {
        stocks.put(Fruits.BANANA,0);
        stocks.put(Fruits.STRAWBERRY,1);
        stocks.put(Fruits.APPLE,2);
    }
    @Override
    public void initialize(CheckStock constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(Fruits.isFruitName(value)){
        return stocks.get(Fruits.valueOf(value)) >0;
        }
        return false;
    }
}
