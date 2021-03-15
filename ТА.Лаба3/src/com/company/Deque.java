package com.company;

@SuppressWarnings("ALL")
public class Deque<T> {

    NodeForMyBilaterallyLinkedList start = null;
    NodeForMyBilaterallyLinkedList end = null;
    int size = 0;
    public Deque()  {
        start = null;
        end = null;
        size = 0;
    }
     public void  PushBack(T data) throws NullPointerException  {
         NodeForMyBilaterallyLinkedList nptr = new NodeForMyBilaterallyLinkedList(data, null,null);
         if (start == null) {
             start = nptr;
             end = nptr;
         } else {
             end.setNextLink(nptr);
             nptr.setPreviousLink(end);
             end = nptr;
         }
         size++;
     }
     public void  PushFront(T data) throws NullPointerException {
         NodeForMyBilaterallyLinkedList  nptr = new NodeForMyBilaterallyLinkedList(data, null,null);
         if (start == null) {
             start = nptr;
             end = start;
         } else {

             start.setPreviousLink(nptr);
             nptr.setNextLink(start);
             start = nptr;
         }
         size++;
     }
     public void PopBack () throws NullPointerException  {
             if (start == null) {
        System.err.println("Empty!!! ");
        return;
    }
        NodeForMyBilaterallyLinkedList startPtr = start;
        NodeForMyBilaterallyLinkedList endPtr = start;
        while (startPtr != end) {
            endPtr = startPtr;
            startPtr = startPtr.getNextLink();
        }
        endPtr.setNextLink(null);
        end.setPreviousLink(null);
        end = endPtr;
        size--;

        return ;
    }
    void PopFront ()throws IllegalArgumentException{
        if (start == null) {
            System.err.println("Empty!!! ");
            return;}


                start=start.getNextLink();
                start.setPreviousLink(null);
                size--;
                return;
            }

    public boolean isEmpty() {
        return start == null;
    }
    void Clear(){
        start.setNextLink(null);
        end.setPreviousLink(null);
    }

    public void  Print ( ){
        NodeForMyBilaterallyLinkedList  k = start;
        while (k!=null){
            System.out.println(k.getData());
            k = k.getNextLink();
        }
    }
    public  T GetBack(){
        return (T) end.getData();
    }
    public  T GetFront(){
        return (T) start.getData();
    }

}
