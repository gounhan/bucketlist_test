package com.IT.bucketlist;

import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> retrieveUserListTx();

    void addUser(Map<String, Object> param, ModelMap model);
}
