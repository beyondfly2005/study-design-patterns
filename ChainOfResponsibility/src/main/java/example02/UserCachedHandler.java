package example02;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.UserCachedHandler
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 15:27
 */

public class UserCachedHandler extends UserAuthenticationHandler {
    private Map<String, String> usernameToken;

    public UserCachedHandler(UserAuthenticationHandler next) {
        super(next);
        //usernameToken = Map.of("cachedUser", "cachedUserToken", "jakehell4", "token5");
        usernameToken = new HashMap<>();
        usernameToken.put("cachedUser","cachedUser");
        usernameToken.put("cachedUserToken","cachedUserToken");
        usernameToken.put("jakehell4", "jakehell4");
        usernameToken.put("token5", "token5");
    }

    @Override
    public UserAuthenticationResult handleUserCredentials(UserAuthenticationRequest request) {
        String username = request.getUsername();
        if (usernameToken.containsKey(username)) {
            return getSuccessfulUserAuthenticationResult(username);
        }
        return super.handleUserCredentials(request);
    }

    public UserAuthenticationResult getSuccessfulUserAuthenticationResult(String username) {
        UserAuthenticationResult result = new UserAuthenticationResult();
        result.setUsername(username);
        result.setToken(usernameToken.get(username));
        result.setAuthenticated(true);
        return result;
    }
}
