package com.IT.bucketlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> retrieveUserListTx() {
        List<User> users = (List<User>) repository.findAll();

        return users;
    }

    @Override
    public void addUser(Map<String, Object> param, ModelMap model) {
        User u = new User();

        u.setUser_id( param.get( "user_id" ) + "" );
        u.setBirth_year( param.get( "birth_year" ) + "" );
        u.setCity( param.get( "city" ) + "" );
        u.setCountry( param.get( "country" ) + "" );
        u.setGender( param.get( "gender" ) + "" );
        u.setNickname( param.get( "nickname" ) + "" );
        u.setPassword( param.get( "password" ) + "" );

        repository.save(u);
    }
}
