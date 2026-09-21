package linkedlist;

public class SinglyLinkedList {

    private static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //insert at beginning / head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //insert at end/tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //position is 1 based indexing
    public void insertAtPosition(int position, int data){
        if(position < 1 || position > size + 1){
            System.out.println("Invalid position");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size + 1){
            insertAtTail(data);
            return;
        }
        //main logic
        Node newNode = new Node(data);
        Node current = head;
        for(int i = 1; i < position-1; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    //Traversal
    public  void traverse(){
        Node current  = head;
        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println();
    }

    //Utility Functions
    public int getSize(){
        return size;
    }

    //isEmpty
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    //get head
    public int getHead(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }
        return head.data;
    }

    //get tail
    public int getTail(){
        if(tail == null){
            System.out.println("list is empty");
            return -1;
        }
        return tail.data;
    }

    //clear list
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    //return true if a value exists in the list
    public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //return position if value exists in the list
    public int searchPosition(int target){
        Node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == target){
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
    }

    //update value at a specific position
    public void updateAtPosition(int position, int newNode){
        if(position < 1 || position > size){
            System.out.println("Invalid position");
            return ;
        }
        if(position == 1){
            head.data = newNode;
            return;
        }
        if(position == size){
            tail.data = newNode;
            return;
        }
        Node current = head;
        for(int i = 1; i < position; i++){
            current = current.next;
        }
        current.data = newNode;
    }

    //Update first occurrence of a value
    public void updateValue(int oldvalue, int newValue){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldvalue){
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
        return ;
    }

    //delete at head
    public void deleteAtHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
    }

    //delete at tail
    public void deleteAtTail(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    //delete at position
    public void deleteAtPosition(int position){
        if(position < 1 || position > size){
            System.out.println("Invalid position");
            return;
        }
        if(position == 1){
            deleteAtHead();
            return;
        }
        if(position == size){
            deleteAtTail();
            return;
        }
        Node prevNode = head;
        for(int i = 1; i < position - 1; i++){
            prevNode = prevNode.next;
        }
        Node currNode = prevNode.next;
        Node forwNode = currNode.next;
        prevNode.next = forwNode;
        currNode.next = null;
        size--;
    }

    //delete first occurrence of a value
    public boolean deleteValue(int target){
        if(head == null){
            System.out.println("List is empty");
            return false;
        }
        if(head.data == target){
            deleteAtHead();
            return true;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            if(currNode.data == target){
                Node forwNode = currNode.next;
                prevNode.next = forwNode;
                currNode.next = null;
                size--;
                return true;
            }       
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
        return false;
    }

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.traverse();
        list.insertAtTail(40);
        list.traverse();
        list.insertAtPosition(3, 50);
        list.traverse();
        System.out.println("Size: " + list.getSize());
        System.out.println("Is Empty: " + list.isEmpty());
        System.out.println("Head: " + list.getHead());
        System.out.println("Tail: " + list.getTail()); 
        // list.clear();
        // list.traverse();
        System.out.println("Search 50: " + list.search(50));
        System.out.println("Search Position of 50: " + list.searchPosition(50));
        list.updateAtPosition(2,100 );
        list.traverse();
        list.updateValue(50, 200);
        list.traverse();
        list.deleteAtHead();
        list.deleteAtTail();
        list.traverse();
        list.deleteAtPosition(2);
        list.traverse();
        list.deleteValue(100);
        list.traverse();
    }


    
}
