package com.IT.bucketlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("userlist")
    public String retrieveUserList(@RequestParam Map<String, Object> param, ModelMap model) {
        List<User> userList = (List<User>) userService.retrieveUserListTx();
        model.put( "userList", userList );

        return "userList";
    }

    @RequestMapping("newuser")
    public String addUser(@RequestParam Map<String, Object> param, ModelMap model) {
        userService.addUser( param, model );

        return "redirect:/user/userlist";
    }
}
