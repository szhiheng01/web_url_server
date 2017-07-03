package com.creditease.lianbiao;

/**
 * Created by songzhiheng on 2017/7/2.
 */
public class LinkList {

    protected Node first;
    protected int pos = 0;

    public LinkList() {
        this.first = null;
    }

    public void addFirstNode(int date) {
        Node node = new Node(date);
        node.next = first;
        first = node;
    }

    public Node delectNode() {
        Node tempNode = first;
        first = tempNode.next;
        return tempNode;
    }

    public void delectNode2() {

        first = first.next;


    }


    public void addAnyNode(int index, int date) {

        //创建被插入的节点
        Node node = new Node(date);
        //被插入节点的上一个节点
        Node head = first;
        //被插入节点的下一个节点
        Node tile;

        int count = 0;
        while(count != index){

            head = head.next;
            count ++;

        }
        tile = head.next;

        head.next = node;
        node.next = tile;

    }










































}
