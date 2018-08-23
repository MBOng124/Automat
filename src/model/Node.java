package model;

import java.util.ArrayList;

public class Node {
    private ArrayList<Integer> data;
    private ArrayList<Node> next;
    private ArrayList<Node> prev;

    public Node(ArrayList<Integer> data){
        this.data = data;
    }

    public Node(){

    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Node> getNext() {
        return next;
    }

    public void setNext(ArrayList<Node> next) {
        this.next = next;
    }

    public void addNext(Node node){
        this.next.add(node);
    }

    public ArrayList<Node> getPrev() {
        return prev;
    }

    public void setPrev(ArrayList<Node> prev) {
        this.prev = prev;
    }

    public void addPrev(Node previous){
        this.prev.add(previous);
    }
}
