package com.company;



@SuppressWarnings("ALL")
public class MyBilaterallyLinkedList<T>  {

    NodeForMyBilaterallyLinkedList start = null;
    NodeForMyBilaterallyLinkedList end = null;
    int size = 0;

    public MyBilaterallyLinkedList()  {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtStart(T data) throws NullPointerException {
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

    public void insertAtEnd(T data) throws NullPointerException  {
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

    public void InsertAtPosition(int position, T data) throws NullPointerException  {
        NodeForMyBilaterallyLinkedList nptr = new NodeForMyBilaterallyLinkedList(data, null,null);
        NodeForMyBilaterallyLinkedList ptr = start;

        for (int i = 1; i < size; i++) {
            if (i == position) {
                NodeForMyBilaterallyLinkedList temp = ptr.getNextLink();
                ptr.setNextLink(nptr);
                nptr.setPreviousLink(ptr);
                nptr.setNextLink(temp);
                temp.setPreviousLink(nptr);
                break;
            }
            ptr = ptr.getNextLink();
        }
        size++;
    }
    public void insertAtPosition(int position ,T data) throws NullPointerException {
        position = position - 1;
        if (position==0) insertAtStart(data);else
        if (position==size) insertAtEnd(data); else
        if (position>size) System.err.println("Помилка:неможливо вставити "+data+"на позицію"+position);else
            InsertAtPosition(position,data);

    }




    public void deleteAtPosition(int position) throws NullPointerException  {
        if (start == null||position>size) {
            System.err.println("Помилка :неможливо видалити елемент на позиції "+position);
            return;
        }

        if (position == size) {
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

            return;
        }

        if (position==1){

            start=start.getNextLink();
            start.setPreviousLink(null);
            size--;
            return;
        }

        NodeForMyBilaterallyLinkedList ptr = start;
        position = position - 1;
        for (int i = 1; i < size-1; i++) {

            if (i == position) {
                NodeForMyBilaterallyLinkedList temp = ptr.getNextLink();
                temp = temp.getNextLink();
                ptr.setNextLink(temp);
                temp.setPreviousLink(ptr);
                break;
            }
            ptr = ptr.getNextLink();
        }
        size--;
    }






    /*public void searchElementByPosition(int position) {
        if (position == 0) {
            System.out.println("Елемент на  " + position + "  : " + start.getData());
            return;
        }

        if (position == size-1) {
            System.out.println("Елемент на  " + position + "  : " + end.getData());
            return;
        }

        Node ptr = start;
        for (int i = 1; i < size-1; i++) {
            if (i == position) {
                System.out.println("Елемент на  " + position + "  : " + ptr.getData());
                break;
            }
            ptr = ptr.getLink();
        }
    }*/

    public void searchElementIteratively(T data) throws NullPointerException  {

        if (isEmpty()) {
            System.err.println("Зв'язний список пустий!!!");
            return;
        }

        if (start.getData() == data) {
            System.out.println(data + " знаходиться на  " + 1 + " позиції");
            return;
        }

        if (start.getNextLink() != null && end.getData() == data) {
            System.out.println(data + " знаходиться на  " +  size  + " позиції");
            return;
        }

        NodeForMyBilaterallyLinkedList startPtr = start;
        int position = 0;
        while (startPtr.getNextLink() != null) {
            ++position;
            if (startPtr.getData() == data) {
                break;
            }
            startPtr = startPtr.getNextLink();
        }
        if (startPtr.getData() == data) {
            System.out.println(data + " знайдено на  " + position+" позиції");
            return;
        }

        System.out.println(data + " Не знайдено!");
    }



    public boolean isEmpty() {
        return start == null;
    }
    public void  Print ( ){
        NodeForMyBilaterallyLinkedList  k = start;
        while (k!=null){
            System.out.println(k.getData());
            k = k.getNextLink();
        }
    }

}





