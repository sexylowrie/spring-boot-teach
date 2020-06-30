package xin.sunce.validation.web;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xin.sunce.validation.model.User;
import xin.sunce.validation.validation.IsCardConstraintValidator;

import javax.validation.Valid;
import javax.validation.groups.Default;

/**
 * 测试Controller
 *
 * @author lowrie
 * @date 2020-02-11
 */
@RestController
public class UserController {


    @PostMapping("/user")
    public User save(@Validated({IsCardConstraintValidator.Card.class,IsCardConstraintValidator.No.class, Default.class}) @RequestBody User user) {
        return user;
    }
}
