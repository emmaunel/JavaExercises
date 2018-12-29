package com.company.Exercise_09.Exercise_09_04;

import java.util.ArrayList;

public class MyStack extends ArrayList {
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public Object push(Object o){
        list.add(o);
        return o;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
