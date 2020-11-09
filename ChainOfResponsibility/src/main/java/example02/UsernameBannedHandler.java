package example02;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.UsernameBannedHandler
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 15:25
 */

public class UsernameBannedHandler extends UserAuthenticationHandler {
    private List<String> bannedUsernames;

    public UsernameBannedHandler(UserAuthenticationHandler next) {
        super(next);
//        Jdk 9的写法
//        bannedUsernames = List.of("jakehell", "bannedUser", "jakehell2");
        bannedUsernames = new ArrayList<>();
        bannedUsernames.add("jakehell");
        bannedUsernames.add("bannedUser");
        bannedUsernames.add("jakehell2");
    }

    @Override
    public UserAuthenticationResult handleUserCredentials(UserAuthenticationRequest request) {
        if (isUsernameBanned(request)) {
            return getAuthenticationFailureResult(request);
        }
        return super.handleUserCredentials(request);
    }

    private boolean isUsernameBanned(UserAuthenticationRequest request) {
        return bannedUsernames.contains(request.getUsername());
    }

    private UserAuthenticationResult getAuthenticationFailureResult(UserAuthenticationRequest request) {
        UserAuthenticationResult result = new UserAuthenticationResult();
        result.setUsername(request.getUsername());
        result.setAuthenticated(false);
        return result;
    }
}