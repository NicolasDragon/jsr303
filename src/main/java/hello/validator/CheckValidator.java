package hello.validator;

import hello.Fruits;
import hello.annotation.CheckExistence;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class CheckValidator implements ConstraintValidator<CheckExistence, Object[]> {


    @Override
    public void initialize(CheckExistence constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object[] value, ConstraintValidatorContext context) {
        for (Object a : value) {
            if (!Fruits.isFruitName((String) a)) {
                return false;
            }
        }
        return true;
    }
}
