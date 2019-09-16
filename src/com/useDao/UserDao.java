package com.useDao;

import com.model.Login;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();
        User u1 = new User();

        u1.setAccount("NhiLangThan");
        u1.setAge(2000);
        u1.setEmail("DuongTien@gmail.com");
        u1.setName("DuongTien");
        u1.setPassword("1234");
        users.add(u1);

        User u2 = new User();

        u2.setAccount("TamThaiTu");
        u2.setAge(1800);
        u2.setEmail("TamThaiTu@gmail.com");
        u2.setName("NaTra");
        u2.setPassword("12345");
        users.add(u2);

        User u3 = new User();

        u3.setAccount("DaiThanh");
        u3.setAge(1800);
        u3.setEmail("DaiThanh@gmail.com");
        u3.setName("TonNgoKhong");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u:users){
            if ( u.getAccount().equals(login.getAccount())
            && u.getPassword().equals(login.getPassword()) ){
                return u;
            }
        }
        return null;
    }
}
