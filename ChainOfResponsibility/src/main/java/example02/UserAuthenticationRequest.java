package example02;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.example01
 * @Description: 存储身份验证请求的POJO
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:11
 */
public class UserAuthenticationRequest {

    private String username;
    private String password;

    public UserAuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
