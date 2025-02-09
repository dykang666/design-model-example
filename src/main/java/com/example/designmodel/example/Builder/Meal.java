package com.example.designmodel.example.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 餐
 * @date 2024/5/24 21:26
 */
public class Meal   {
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
