package com.dm.interpreter;

/**
 * @author Administrator
 * @version V1.0
 * @InterfaceName:AbstractExpression
 * @Description:抽象表达式
 * @date 2019/12/12
 */
public interface AbstractExpression {

    public Object interpret(String info);
}
