package example05;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.DurationFilter
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:38
 */
@Component
@Order(2)
public class CheckRole4OrganizationDelete implements OrganizationDeleteCheck {

    @Override
    public ResultVO handle(Long organizationId) {
        System.out.println("执行了角色检查程序");
        //int num roleService.getUserCountByDeptId(task.getOrganizationId(organizationIdk));
        int num = 0 ;
        if(num>0) {
            //System.out.println("删除失败,该部门下还有未删除的角色，无法删除");
            return new ResultVO(false,"删除失败,该部门下还有未删除的角色，无法删除");
        } else {
            return new ResultVO(true,null);
        }
    }
}
