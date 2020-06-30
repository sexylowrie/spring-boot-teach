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

    private String[] expects;

    Class[] groups;

    public interface Card {
    }

    public interface No {
    }

    @Override
    public boolean isValid(String cardNo, ConstraintValidatorContext constraintValidatorContext) {
        for (String expect : expects) {
            if (expect.equals(cardNo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void initialize(IsCard constraintAnnotation) {
        this.expects = constraintAnnotation.expect();
        this.groups = constraintAnnotation.groups();
        System.out.println(constraintAnnotation);
    }
}
