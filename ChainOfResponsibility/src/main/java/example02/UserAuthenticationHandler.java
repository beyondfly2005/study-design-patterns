package example02;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.UserA
 * @Description: 责任链的实施 需要一个抽象Handler类
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 15:23
 */
public abstract class UserAuthenticationHandler {

    private UserAuthenticationHandler next;

    public UserAuthenticationHandler(UserAuthenticationHandler next) {
        this.next = next;
    }

    public UserAuthenticationResult handleUserCredentials(UserAuthenticationRequest request) {
        return next.handleUserCredentials(request);
    }
}
