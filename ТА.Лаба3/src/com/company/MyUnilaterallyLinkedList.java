package com.company;



@SuppressWarnings("ALL")
public class MyUnilaterallyLinkedList<T>  {

    Node start = null;
    Node end=null;

    int size = 0;

    public MyUnilaterallyLinkedList()  {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtStart(T data) throws NullPointerException  {
        Node nptr = new Node(data, null);
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
        size++;
    }

    public void insertAtEnd(T data)  throws NullPointerException {
        Node nptr = new Node(data, null);
        if (start == null) {
            start = nptr;
            end = nptr;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
        size++;
    }

    public void InsertAtPosition(int position, T data)  throws NullPointerException {
        Node nptr = new Node(data, null);
        Node ptr = start;

        for (int i = 1; i < size; i++) {
            if (i == position) {
                Node temp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }
    public void insertAtPosition(int position ,T data) throws NullPointerException  {
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
            Node startPtr = start;
            Node endPtr = start;
            while (startPtr != end) {
                endPtr = startPtr;
                startPtr = startPtr.getLink();
            }
            endPtr.setLink(null);
            end = endPtr;
            size--;

            return;
        }

        if (position==1){

            start=start.getLink();
            size--;
            return;
        }

        Node ptr = start;
        position = position - 1;
        for (int i = 1; i < size-1; i++) {

            if (i == position) {
                Node temp = ptr.getLink();
                temp = temp.getLink();
                ptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
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

    public void searchElementIteratively(T data)  throws NullPointerException {

        if (isEmpty()) {
            System.err.println("Зв'язний список пустий!!!");
            return;
        }

        if (start.getData() == data) {
            System.out.println(data + " знаходиться на  " + 1 + " позиції");
            return;
        }

        if (start.getLink() != null && end.getData() == data) {
            System.out.println(data + " знаходиться на  " +  size  + " позиції");
            return;
        }

        Node startPtr = start;
        int position = 0;
        while (startPtr.getLink() != null) {
            ++position;
            if (startPtr.getData() == data) {
                break;
            }
            startPtr = startPtr.getLink();
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
        Node k = start;
        while (k!=null){
            System.out.println(k.getData());
            k = k.getLink();
        }
    }
}





