package hello.annotation;

import hello.validator.TestValidator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TestValidator.class)
public @interface CheckExistence {

    String message() default "{hello.annotation.CheckExistence.message}";
    Class[] groups() default {};
    Class[] payload() default {};
}
