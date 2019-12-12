package com.dm.interpreter;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Context
 * @Description:环境
 * @date 2019/12/12
 */
public class Context implements AbstractExpression{

    private AbstractExpression expression;

    public Context() {
        //数据初始化
    }

    @Override
    public Object interpret(String info) {
        //调用相关表达式类的解释方法
        return null;
    }
}
