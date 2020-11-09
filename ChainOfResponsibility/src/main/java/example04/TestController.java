package example04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.TestController
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 19:25
 */
@Controller

public class TestController {

    @Autowired
    private ApplicationService service;

    @RequestMapping("/")
    public String test(){
        service.mockedClient();
        return "true";
    }
}
