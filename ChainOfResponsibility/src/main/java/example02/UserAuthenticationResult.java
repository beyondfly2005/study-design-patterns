package example02;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.TT
 * @Description: 存储身份验证响应的POJO
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 15:19
 */
public class UserAuthenticationResult {

    private String token;
    private String username;
    private boolean authenticated;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nToken: " + token + "\nIsAuthenticated: " + authenticated;
    }
}