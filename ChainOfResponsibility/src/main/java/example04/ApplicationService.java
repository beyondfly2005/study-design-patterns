package example04;

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
@Service("applicationService")
public class ApplicationService {

    @Autowired
    private List<Filter> filters;

    public void mockedClient() {
        // 这里task一般是通过数据库查询得到的
        Task task = new Task();
        for (Filter filter : filters) {
            if (!filter.filter(task)) {
                return;
            }
        }

        // 过滤完成，后续是执行任务的逻辑
    }
}