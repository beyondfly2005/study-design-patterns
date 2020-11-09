package example05;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class RiskCheck4OrganizationDelete  implements OrganizationDeleteCheck{

    @Override
    public ResultVO handle(Long organizationId) {
        System.out.println("执行了隐患检查程序");
        //int num riskService.getUserCountByDeptId(task.getOrganizationId(organizationIdk));
        int num = 10;
        if(num>0) {
            return new ResultVO(false,"删除失败,该部门下还有未删除的隐患数据，无法删除");
        } else {
            return new ResultVO(true,null);
        }
    }
}
