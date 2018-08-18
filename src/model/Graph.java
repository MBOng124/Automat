package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    private ArrayList<Integer> state;
    private Node head;


    public Graph(){
        state = new ArrayList<>();
    }

    private void initLinkedList(){
        addState(0, 0, 0, 0, 0);
        head = new Node(state);
    }

    public void addState(int human, int human1, int lion, int cow, int grains){
        state.clear();
        state.add(human);
        state.add(human1);
        state.add(lion);
        state.add(cow);
        state.add(grains);
    }
}
