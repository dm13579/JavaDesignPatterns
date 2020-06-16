package com.dm.build;

import com.dm.build.base.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Meal
 * @Description:TODO
 * @date 2019/12/3
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
