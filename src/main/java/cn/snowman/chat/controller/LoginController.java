package cn.snowman.chat.controller;

import cn.snowman.chat.entity.ResultEntity;
import cn.snowman.chat.entity.User;
import cn.snowman.chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public ResultEntity login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        ResultEntity rst = new ResultEntity();
        if (user != null) {
            rst.setSuccess(true);
        } else {
            rst.setSuccess(false);
        }
        rst.setBody(user);
        return rst;
    }

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultEntity register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
        return new ResultEntity();
    }
}
