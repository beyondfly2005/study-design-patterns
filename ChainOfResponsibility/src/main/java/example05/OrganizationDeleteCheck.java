package example05;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.Filter
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:37
 */
public interface OrganizationDeleteCheck {

    /**
     * 用于对各个任务节点进行过滤
     */
    ResultVO handle(Long organizationId);

}