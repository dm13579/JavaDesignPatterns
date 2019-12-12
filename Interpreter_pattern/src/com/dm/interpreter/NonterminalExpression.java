package com.dm.interpreter;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:NonterminalExpression
 * @Description:非终结符表达式
 * @date 2019/12/12
 */
public class NonterminalExpression implements AbstractExpression{

    private AbstractExpression expression1;

    private AbstractExpression expression2;

    @Override
    public Object interpret(String info) {
        //对非终结符表达式的处理
        return null;
    }
}
