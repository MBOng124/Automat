package model;

import java.util.ArrayList;

public class Node {
    private ArrayList<Integer> data;
    private Node next;

    public Node(ArrayList<Integer> data){
        this.data = data;
    }

    public Node(ArrayList<Integer> data, Node next){
        this.data = data;
        this.next = next;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
