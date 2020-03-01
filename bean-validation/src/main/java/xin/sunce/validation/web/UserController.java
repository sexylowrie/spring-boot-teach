package xin.sunce.validation.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xin.sunce.validation.model.User;

import javax.validation.Valid;

/**
 * 测试Controller
 *
 * @author lowrie
 * @date 2020-02-11
 */
@RestController
public class UserController {


    @PostMapping("/user")
    public User save(@Valid @RequestBody User user) {
        return user;
    }
}
