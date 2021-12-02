package com.company;

//construct link list whith head element
public class LinkList<T> {
    class Node {
        Node next = null;
        T data;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
        public Node() {
            this.data = null;
            this.next = null;
        }
    }
    // define private element including head node and size
    private Node head;
    private int size;

    // print link list
    public void PrintLinkList() {
        Node find = this.head;
        while(find.next != null){
            find = find.next;
            System.out.print(find.data);
            System.out.print(' ');
        }
        System.out.println();
    }

    // construction function
    public LinkList() {
        this.head = new Node();
        this.size=0;
    }

    //return the length of link list
    public int Length() {
        return size;
    }

    //judge whether it is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // insert into front
    private void InsertFont(T data) {
        //exclude invalid data
        Node nodef = new Node(data);
        nodef.next = this.head.next;
        this.head.next = nodef;
        this.size++;
    }

    // insert into tail
    private void InsertTail(T data) {
        Node nodet = new Node(data);
        Node find = this.head;
        while(find.next != null){
            find = find.next;
        }
        find.next = nodet;
        this.size++;
    }

    // insert into link list
    public boolean InsertList(T data, int index){
        if(index == this.size+1){
            InsertTail(data);
            return true;
        }
        else if(index == 1){
            InsertFont(data);
            return true;
        }
        else if(index > this.size || index < 0){
            return false;
        }
        else {
            Node node = new Node(data);
            Node find = this.head;
            while(index > 1){
                find = find.next;
                index--;
            }
            Node tmp = find.next;
            find.next = node;
            node.next = tmp;
            this.size++;
            return true;
        }
    }
    // delete element by value
    public boolean remove(T data){
        if(this.size == 0){
            return false;
        }
        boolean flag = false;
        Node find = this.head;
        while(find.next != null){
            if(find.next.data == data){
                flag = true;
                break;
            }
            find = find.next;

        }
        if(flag){
            Node tmp = find.next;
            find.next = find.next.next;
            tmp.next = null;
            return true;
        }
        else {
            return false;
        }

    }

}
