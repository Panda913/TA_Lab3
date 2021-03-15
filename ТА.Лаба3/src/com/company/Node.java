package com.company;

@SuppressWarnings("ALL")
public class Node <Node extends com.company.Node,T> {
    com.company.Node link = null;
     T data = null;

    public Node() {
        link = null;
        data = null;
    }

    public Node(T data, Node link) {
        this.data = data;
        this.link = null;
    }

    public com.company.Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
