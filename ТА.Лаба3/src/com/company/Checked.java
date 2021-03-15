package com.company;

public class Checked {
    static void InsertionChecked() throws NullPointerException{
        long time=System.currentTimeMillis();
        MyBilaterallyLinkedList<Integer> array =new MyBilaterallyLinkedList<Integer>();
        MyUnilaterallyLinkedList<Integer> array1= new MyUnilaterallyLinkedList<>();
        System.out.println("Двохзв'язний список");
        try {
            for (int i=0;i<1000;i++)
                array.insertAtStart((int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Front insertion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array.insertAtPosition(999,(int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("a.g.n. insertion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array.insertAtEnd((int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("End insertion time : ");
        System.out.println(System.currentTimeMillis()-time);

        System.out.println("Однозв'язний список");
        try {
            for (int i=0;i<1000;i++)
                array1.insertAtStart((int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Front insertion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array1.insertAtPosition(999,(int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("a.g.n. insertion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array1.insertAtEnd((int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("End insertion time : ");
        System.out.println(System.currentTimeMillis()-time);




    }

    static void DeletionChecked() throws NullPointerException{
        MyBilaterallyLinkedList<Integer> array =new MyBilaterallyLinkedList<Integer>();
        MyUnilaterallyLinkedList<Integer> array1= new MyUnilaterallyLinkedList<>();
        try {
            for (int i=0;i<3004;i++){
                array.insertAtEnd((int) (Math.random() * 2000));
               array1.insertAtEnd((int) (Math.random() * 2000));}

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Двохзв'язний список");
        long time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array.deleteAtPosition(1);

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Front Deletion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array.deleteAtPosition(999);

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("a.g.n. Deletion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array.deleteAtPosition(array.size);

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("End Deletion time : ");
        System.out.println(System.currentTimeMillis()-time);
        System.out.println("Однозв'язний список");
         time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array1.deleteAtPosition(1);

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Front Deletion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array1.deleteAtPosition(999);

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("a.g.n. Deletion time : ");
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        try {
            for (int i=0;i<1000;i++)
                array1.deleteAtPosition(array.size);

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("End Deletion time : ");
        System.out.println(System.currentTimeMillis()-time);

    }

    static void IndexingChecked() throws NullPointerException{

        MyBilaterallyLinkedList<Integer> array =new MyBilaterallyLinkedList<Integer>();
        MyUnilaterallyLinkedList<Integer> array1= new MyUnilaterallyLinkedList<>();
        try {
            for (int i=0;i<3004;i++)
                array.insertAtEnd((int) (Math.random() * 2000));
               array1.insertAtEnd((int) (Math.random() * 2000));

        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Двохзв'язний список");
        long time=System.currentTimeMillis();
        try {
            array.searchElementIteratively(3000);
        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println(" Indexing time : ");
        System.out.println(System.currentTimeMillis()-time);
        System.out.println("Однозв'язний список");
        time=System.currentTimeMillis();
        try {
            array1.searchElementIteratively(3000);
        }catch (Exception e){
            System.err.println(e.fillInStackTrace());
        }
        System.out.println("Indexing time : ");
        System.out.println(System.currentTimeMillis()-time);



    }
}
