package datastructures.linkedlist;

/**
 * Created by ItBNinja on 11/23/16.
 */
public class CCNode<T> {
    CCNode<T> next;
    T data;
    public CCNode(T Data){
        this.data = Data;
    }

    void appendToTail(T t){
        CCNode end = new CCNode(t);
        CCNode n = this;
        while(n.next!=null){
            n= n.next;
        }
         n.next = end;
    }

    CCNode deleteNode(CCNode head,T t){
        CCNode n = head;
        if(n.data==t){
            return head.next;
        }
        while(n.next!=null){
            if(n.next.data==t){
                n.next = n.next.next;
                return head;
            }
            n =n.next;
        }
      return head;
    }



}
