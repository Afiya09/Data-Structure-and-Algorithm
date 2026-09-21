package linkedlist;

public class CircularSinglyLinkedList{
    static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    //Insert at head
    public void insertHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    //Insert at Tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        size++;
    }

    //Insert using 1 based indexing
    public void insertAtPosition(int position, int data){
        if(position < 1 || position > size+1){
            System.out.println("Invalid Position ");
            return;
        }
        if(position == 1){
            insertHead(data);
            return ;
        }
        if(position == size+1){
            insertAtTail(data);
            return;
        }
        Node prevNode = head;
        for(int i=1; i < position-1; i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        Node nextNode = prevNode.next;

        prevNode.next = newNode;
        newNode.next = nextNode;
        size++;
    }

    //Traverse
    public void printList(){
        if(head == null){
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node temp = head;
        do{ 
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println("Back to the head");
    }

    //search
    public boolean search(int target){
        if(head == null){
            System.out.println("Circular LinkedList is empty.");
            return false;
        }
        Node temp = head;
        do{
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }while(temp != head);
        return false;
    }

    //delete at head
    public void deleteAtHead(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
        }
        Node temp = head;
        head = head.next;
        tail.next = head;
        temp.next = null;
        size--;
    }

    //delete at tail
    public void deleteAtTail(){
        if(tail == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
        }
        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        current.next = head;
        tail.next = null;
        tail=current;
        size--;
    }

    //delete at position
    public void deleteAtPosition(int position){
        if(position <1 || position>size){
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
        for(int i = 1; i<position-1; i++){
            prevNode = prevNode.next;
        }
        Node currNode = prevNode.next;
        Node nextNode = currNode.next;
        prevNode.next = nextNode;
        currNode.next = null;
        size--;
    }

    public static void main(String[] args){
        CircularSinglyLinkedList list = new  CircularSinglyLinkedList();
        list.insertHead(10);
        list.insertHead(20);
        list.printList();
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.printList();
        list.insertAtPosition(3,50);
        list.printList();
        System.out.println(" 10 is present: " + list.search(10));
        System.out.println(" 100 is present: " + list.search(100));
        list.deleteAtHead();
        list.printList();
        list.deleteAtTail();
        list.printList();
        list.deleteAtPosition(3);
        list.printList();
    }

    
}