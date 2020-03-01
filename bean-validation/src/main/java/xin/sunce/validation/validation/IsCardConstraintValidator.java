package xin.sunce.validation.validation;

import xin.sunce.validation.validation.constraints.IsCard;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 卡片验证器
 * <p>
 * 规则以62开头
 *
 * @author lowrie
 * @date 2020-02-11
 */
public class IsCardConstraintValidator implements ConstraintValidator<IsCard, String> {

    @Override
    public boolean isValid(String cardNo, ConstraintValidatorContext constraintValidatorContext) {
        return cardNo.startsWith("62");
    }

    @Override
    public void initialize(IsCard constraintAnnotation) {

    }
}
