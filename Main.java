package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkList<Integer> s = new LinkList<Integer>();
        if(s.isEmpty()){
            System.out.println(1);
        }
        for(int i = 0 ; i < 5 ; i++){
            s.InsertList(i+3, i+1);
            //System.out.println(s.Length());
        }
        s.PrintLinkList();
        s.remove(4);
        s.PrintLinkList();
        s.remove(7);
        s.PrintLinkList();
        s.remove(3);
        s.PrintLinkList();
        System.out.println(s.Length());
    }

}
