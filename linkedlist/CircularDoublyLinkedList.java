package linkedlist;

public class CircularDoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    CircularDoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //insert at head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
        }else{
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head = newNode;
            tail.next = newNode;
        }
        size++;
    }

    //Insert at tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
        }else{
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        size++;
    }

    //insert at position
    public void insertAtPosition(int position , int data){
        if(position < 1 || position > size+1){
            System.out.println("Invalid position");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size+1){
            insertAtTail(data);
            return;
        }
        Node prevNode = head;
        for(int i = 1; i < position-1; i++){
            prevNode = prevNode.next;
        }
        Node currNode = new Node(data);
        Node nextNode = prevNode.next;

        currNode.next = nextNode;
        currNode.prev = prevNode;
        prevNode.next = currNode;
        nextNode.prev = currNode;
        size++;
    }

    //Traverse
    public void printList(){
        if(head == null){
            System.out.println("Circular doubly linkedlist is empty");
        }
        Node temp = head;
        do{
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }while(temp != head);
        System.out.println("back to head");
    }

    //search
    public boolean search(int target){
        if(head == null){
            System.out.println("Circular doubly linkedlist is empty");
            return false;
        }
        Node temp = head;
        do{
            if(temp.data ==  target){
                return true;
            }
            temp = temp.next;
        }while(temp != head);
        return false;
    }

    //delete at head
    public void deleteAtHead(){
        if(head == null){
            System.out.println("Circular linkedlist is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = tail;
        tail.next = head;
        temp.next = null;
        temp.prev = null;
        size--;
    }
    
    //delete at tail
    public void deleteAtTail(){
        if(head == null){
            System.out.println("Circular linkedlist is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        temp.next = null;
        temp.prev = null;
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
        for(int i = 1; i < position-1; i++){
            prevNode = prevNode.next;
        }
        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        currNode.prev = null;
        currNode.next = null;
        size--;
    }

    public static void main(String[] args){
        CircularDoublyLinkedList mylist = new CircularDoublyLinkedList();
        mylist.insertAtHead(10);
        mylist.printList();
        mylist.insertAtTail(20);
        mylist.printList();
        mylist.insertAtPosition(2,30);
        mylist.printList();
        System.out.println("10 is present : " + mylist.search(10));
        mylist.deleteAtHead();
        mylist.deleteAtTail();
        mylist.printList();

    }

    
    
}
