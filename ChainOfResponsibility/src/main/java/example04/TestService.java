package example04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.TestImpl2Test
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestService {

    @Autowired
    //@Qualifier("applicationService")  //合格者：指定多个实现中的一个
    private ApplicationService applicationService;

    @Test
    public void test(){
        applicationService.mockedClient();
    }

}