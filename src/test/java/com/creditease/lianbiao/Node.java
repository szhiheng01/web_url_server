package com.creditease.lianbiao;

/**
 * Created by songzhiheng on 2017/7/2.
 */
public class Node {

    protected Node next;
    protected int date;

    public Node(int date) {
        this.date = date;
    }

    public void disPaly(){
        System.out.println(date + "");
    }
}
