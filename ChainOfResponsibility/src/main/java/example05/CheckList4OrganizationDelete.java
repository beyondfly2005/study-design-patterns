package example05;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.RiskFilter
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:43
 */
@Component
@Order(1)
public class CheckList4OrganizationDelete implements OrganizationDeleteCheck {

    @Override
    public ResultVO handle(Long organizationId) {
        System.out.println("执行了清单检查程序");
        //int num checkListService.getUserCountByDeptId(task.getOrganizationId(organizationIdk));
        int num = 0;
        if (num>0) {
            //System.out.println("删除失败,该部门下还有未删除的清单，无法删除");
            return new ResultVO(false,"删除失败,该部门下还有未删除的清单，无法删除");
        } else {
            return new ResultVO(true,"刪除成功");
        }
    }
}
