package com.dm.composite.example;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:FinanceDepartment
 * @Description:TODO
 * @date 2019/12/9
 */
public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {

        for(int i=0;i<depth;i++){
            System.out.print('-');
        }
        System.out.println(name);
    }

    @Override
    public void lineofDuty() {
        System.out.println(name+"财务收支");
    }
}
