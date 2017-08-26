package hello.annotation;

import hello.validator.StockValidator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StockValidator.class)
public @interface CheckStock {

    String message() default "{hello.annotation.CheckStock.message}";
    Class[] groups() default {};
    Class[] payload() default {};
}
