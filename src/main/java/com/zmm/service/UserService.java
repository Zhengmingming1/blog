package com.zmm.service;

import com.zmm.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
