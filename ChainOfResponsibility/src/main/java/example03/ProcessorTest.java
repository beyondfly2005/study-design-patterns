package example03;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example03.ProcessorTest
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 18:16
 */
public class ProcessorTest {

    Processor processor;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public static void main(String[] args) {
        // 模拟业务类
        ProcessorTest processorTest = new ProcessorTest();

        // 手动创建责任链
        ProcessorA processorA = new ProcessorA();
        ProcessorB processorB = new ProcessorB();
        processorA.setProcessor(processorB);
        processorTest.setProcessor(processorA);

        // 测试
        processorTest.getProcessor().process("fuhang");
        processorTest.getProcessor().process("zhangsan");
    }

}
// 输出
//ProcessorA request process
//ProcessorA request can not process
//ProcessorB request can not process
