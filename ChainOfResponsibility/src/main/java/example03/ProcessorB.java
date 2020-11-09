package example03;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example03.ProcessorB
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:14
 */
public class ProcessorB extends Processor {

    @Override
    public Object process(Object request) {
        if(request.equals("fuhang")){
            System.out.println("ProcessorB request process");
        }else{
            System.out.println("ProcessorB request can not process");
            if(processor != null){
                processor.process(request);
            }
        }
        return null;
    }
}