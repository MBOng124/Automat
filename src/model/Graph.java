package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    private ArrayList<Integer> childIndex;
    private ArrayList<Node> traversals;
    private Node head;
    private Node next1, next2, next3, next4, next5, next6;
    private Node next7, next8, next9, next10, next11, next12;
    private Node next13, next14, next15,next16, next17, next18;
    private Node next19, next20;
    private Node tail;

    public Graph(){
//        state = new ArrayList<>();
        childIndex = new ArrayList<>();
        for(int i = 0; i < 22; i++){
            childIndex.add(0);
        }
//        transitionCount = new ArrayList<>();
        initLinkedList();
        traversals = new ArrayList<>();
        traversals.add(head);
    }

    private void initLinkedList(){

        head = new Node(addState(0, 0, 0, 0, 0, 0));

        next1 = new Node(addState(1, 0, 0, 1, 1, 0));

        next2 = new Node(addState(0, 0, 0, 1, 0, 0));

        next3 = new Node(addState(0, 0, 0, 0, 1, 0));

        next4 = new Node(addState(1, 0, 1, 1, 1, 0));

        next5 = new Node(addState(1, 1, 0, 1, 1, 0));

        next6 = new Node(addState(1, 0, 0, 1, 1, 1));

        next7 = new Node(addState(1, 1, 1, 0, 1, 0));

        next8 = new Node(addState(0, 0, 1, 0, 0, 0));

        next9 = new Node(addState(0, 1, 0, 0, 0, 0));

        next10 = new Node(addState(0, 0, 0, 0, 0, 1));

        next11 = new Node(addState(0, 0, 0, 1, 0, 1));

        next12 = new Node(addState(0, 1, 1, 0, 0, 0));

        next13 = new Node( addState(1, 0, 1, 1, 1, 1));

        next14 = new Node(addState(1, 1, 0, 1, 1, 1));

        next15 = new Node(addState(1, 1, 1, 1, 0, 1));

        next16 = new Node(addState(1, 1, 1, 0, 1, 1));

        next17 = new Node(addState(1, 1, 1, 1, 1, 0));

        next18 = new Node( addState(0, 0, 1, 0, 0, 1));

        next19 = new Node(addState(0, 1, 1, 0, 0, 1));

        next20 = new Node(addState(0, 1, 0, 0, 0, 1));

        tail = new Node(addState(1, 1, 1, 1, 1, 1));

        //connect for head
        head.addNext(next1);

        //connect for next1
        next1.addPrev(head);
        next1.addNext(next2);
        next1.addNext(next3);

        //connect for next2
        next2.addPrev(next1);
        next2.addNext(next4);
        next2.addNext(next5);
        next2.addNext(next6);

        //connnect for next3
        next3.addPrev(next1);
        next3.addNext(next4);
        next3.addNext(next5);
        next3.addNext(next6);
        next3.addNext(next7);

        //connnect for next4
        next4.addPrev(next2);
        next4.addNext(next8);

        //connnect for next5
        next5.addPrev(next2);
        next5.addNext(next9);

        //connnect for next6
        next6.addPrev(next2);
        next6.addPrev(next3);
        next6.addNext(next10);
        next6.addNext(next11);

        //connnect for next7
        next7.addPrev(next3);
        next7.addNext(next8);
        next7.addNext(next9);
        next7.addNext(next12);

        //connnect for next8
        next8.addPrev(next4);
        next8.addPrev(next7);

        //connnect for next9
        next9.addPrev(next5);
        next9.addPrev(next7);

        //connnect for next10
        next10.addPrev(next6);

        //connnect for next11
        next11.addPrev(next6);
        next11.addNext(next13);
        next11.addNext(next14);
        next11.addNext(next15);

        //connnect for next12
        next12.addPrev(next7);
        next12.addNext(next15);
        next12.addNext(next16);
        next12.addNext(next17);

        //connnect for next13
        next13.addPrev(next11);
        next13.addNext(next18);

        //connnect for next14
        next14.addPrev(next11);
        next14.addNext(next20);

        //connnect for next15
        next15.addPrev(next11);
        next15.addPrev(next12);
        next15.addNext(next18);
        next15.addNext(next19);
        next15.addNext(next20);

        //connnect for next16
        next16.addPrev(next12);
        next16.addNext(next18);
        next16.addNext(next19);
        next16.addNext(next20);

        //connnect for next17
        next17.addPrev(next12);

        //connnect for next18
        next18.addPrev(next13);
        next18.addPrev(next15);
        next18.addPrev(next16);

        //connnect for next19
        next19.addPrev(next15);
        next19.addPrev(next16);
        next19.addNext(tail);

        //connnect for next20
        next20.addPrev(next14);
        next20.addPrev(next15);
        next20.addPrev(next16);

        //connnect for tail
        tail.addPrev(next19);
    }

    public ArrayList<Integer> addState(int scientist, int human, int human1, int lion, int cow, int grains){
        ArrayList<Integer> state = new ArrayList<>();
        state.add(scientist);
        state.add(human);
        state.add(human1);
        state.add(lion);
        state.add(cow);
        state.add(grains);

        return state;
    }

    public void breadthFirstSearch(){
        Node temp;
        int index = 0, count = 0;
        while (traversals.size() > 0){
            temp = traversals.get(0);
            traversals.remove(0);
            while(index < temp.getNext().size()){
                traversals.add(temp.getNextIndex(index));
                System.out.println(temp.getNextIndex(index).getData()+" "+count);
                index++;
                count++;
            }

            index = 0;
        }
        System.out.println("done");
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.breadthFirstSearch();
    }

}

