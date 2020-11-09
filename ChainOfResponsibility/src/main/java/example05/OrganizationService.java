package example05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.ApplicationService
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:44
 */
@Service("organizationService")
public class OrganizationService {

    @Autowired
    private List<OrganizationDeleteCheck> organizationDelCheckHandle;

    public ResultVO handleOrganizationDel(Long organizationId) {
        // 这里task一般是通过数据库查询得到的
        for (OrganizationDeleteCheck handleProcess : organizationDelCheckHandle) {
            ResultVO result = handleProcess.handle(organizationId);
            if (!result.isSuccess()) {
                return result;
            }
        }
        //验证成功后 执行业务处理程序
        //organizationService.deleteOrganization(organizationId);
        return new ResultVO(true,"刪除成功");
    }
}