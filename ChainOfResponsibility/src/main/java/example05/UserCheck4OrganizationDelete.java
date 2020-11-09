package example05;

//import org.springframework.scheduling.config.Task;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.TimesFilter
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:43
 */
@Component
@Order(3)
public class UserCheck4OrganizationDelete implements OrganizationDeleteCheck {

    @Override
    public ResultVO handle(Long organizationIdk) {
        System.out.println("执行了用户检查程序");
        //int num userService.getUserCountByDeptId(task.getOrganizationId(organizationIdk));
        int num = 0;
        if(num>0) {
            return new ResultVO(false,"删除失败,该部门下还有未删除的用户，无法删除");
        } else {
            return new ResultVO(true,null);
        }
    }
}