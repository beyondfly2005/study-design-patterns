package example04;

//import org.springframework.scheduling.config.Task;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example04.Filter
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:37
 */
public interface Filter {

    /**
     * 用于对各个任务节点进行过滤
     */
    boolean filter(Task task);

}