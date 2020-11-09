package example04;

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
public class TimesFilter implements Filter {

    @Override
    public boolean filter(Task task) {
        System.out.println("次数限制检验");
        return true;
    }
}