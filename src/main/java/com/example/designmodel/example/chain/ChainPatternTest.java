package com.example.designmodel.example.chain;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 责任链模式
 * 解耦：责任链模式可以将请求的发送者与接收者解耦，客户端不需要知道哪个具体的处理者会处理请求。
 * 灵活性：可以动态地改变链的结构，添加或删除处理者，修改处理逻辑。
 * 扩展性：增加新的处理者时，无需修改现有代码，只需添加新的处理者类即可。
 *
 * @date 2024/5/28 15:58
 */
public class ChainPatternTest {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
     //   loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
//        loggerChain.logMessage(AbstractLogger.ERROR,
//                "This is an error information.");


    }
}
