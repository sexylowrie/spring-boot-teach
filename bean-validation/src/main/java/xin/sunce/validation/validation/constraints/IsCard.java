package xin.sunce.validation.validation.constraints;

import xin.sunce.validation.validation.IsCardConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * bean验证注解
 *
 * @author lowrie
 * @date 2020-02-11
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {IsCardConstraintValidator.class})
public @interface IsCard {
    String message() default "{xin.sunce.teach.validation.constraints.IsCard.message}";

    String[] expect() default {"utf-8","UTF-8"};

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
