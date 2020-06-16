package com.dm.composite.example;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Company
 * @Description:抽象公司或接口
 * @date 2019/12/9
 */
public abstract class Company {

    protected String name = null;

    public Company(String name) {
        this.name = name;
    }

    // 新增
    public abstract void add(Company company);

    // 移除
    public abstract void remove(Company company);

    // 显示
    public abstract void display(int depth);

    // 职责
    public abstract void lineofDuty();

}
