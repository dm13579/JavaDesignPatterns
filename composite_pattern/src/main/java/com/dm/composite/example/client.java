package com.dm.composite.example;

import java.io.Console;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:client
 * @Description: 举个栗子（公司管理部门）透明方式
 * @date 2019/12/9
 */
public class client {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        comp.add(comp2);


        System.out.println("结构图：");

        root.display(1);

        System.out.println("职责");

        root.lineofDuty();
    }
}
