package org.example.Behavioral.Command;

import java.util.HashMap;

public class Menu {
    private HashMap<String, MenuItem> menuItemHashMap = new HashMap<>();
    public void addMenuItem(MenuItem item, String key){
        menuItemHashMap.put(key, item);
    }
    public void selectMenuItem(String key){
        MenuItem item = menuItemHashMap.get(key);
        if(item != null)
            item.invoke();
        else
            System.out.println("Menu item not found");
    }
}
