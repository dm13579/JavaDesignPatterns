package com.dm.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:ConcreteCompany
 * @Description:TODO
 * @date 2019/12/9
 */
public class ConcreteCompany extends Company{

    private List<Company> children= new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {

        for(int i=0;i<depth;i++){
            System.out.print('-');
        }
        System.out.println(name);

        for (Company company:children){
           company.display(depth+2);
        }
    }

    @Override
    public void lineofDuty() {
        for (Company company:children){
            company.lineofDuty();
        }
    }
}
