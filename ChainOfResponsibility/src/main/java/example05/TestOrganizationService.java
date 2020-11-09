package example05;

import org.springframework.beans.factory.annotation.Autowired;

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
public class TestOrganizationService {

    @Autowired
    //@Qualifier("organizationService")  //合格者：指定多个实现中的一个
    private OrganizationService organizationService;

    @Test
    public void test(){
        ResultVO resultVO = organizationService.handleOrganizationDel(100L);
        System.out.println(resultVO.isSuccess()+":"+resultVO.getMassage());
    }

}