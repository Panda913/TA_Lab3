package com.company;

@SuppressWarnings("ALL")
public class NodeForMyBilaterallyLinkedList <NodeNodeForMyBilaterallyLinkedList ,NodeForMyBilaterallyLinkedList extends com.company.NodeForMyBilaterallyLinkedList,T> {
    NodeForMyBilaterallyLinkedList nextlink = null;
    NodeForMyBilaterallyLinkedList previouslink =null;
        T data = null;

        public NodeForMyBilaterallyLinkedList() {
            nextlink = null;
            data = null;
            previouslink=null;
        }

        public NodeForMyBilaterallyLinkedList(T data, NodeForMyBilaterallyLinkedList nextlink,NodeForMyBilaterallyLinkedList previouslink) {
            this.data = data;
            this.nextlink = null;
            this.previouslink=null;
        }

        public NodeForMyBilaterallyLinkedList getNextLink() {
            return nextlink;
        }
    public NodeForMyBilaterallyLinkedList getPreviousLink() {
        return previouslink;
    }

        public void setNextLink(NodeForMyBilaterallyLinkedList nextlink) {
            this.nextlink = nextlink;
        }
    public void setPreviousLink(NodeForMyBilaterallyLinkedList previouslink) {
        this.previouslink = previouslink;
    }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }


