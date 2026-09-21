package linkedlist;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Insert at head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //Insert at tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    //Insert at position
    public void insertAtPosition(int position, int data){
        if(position < 1 || position> size+1){
            System.out.println("Invalid Position");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size){
            insertAtTail(data);
            return;
        }
        Node temp = head;
        for(int i = 1; i < position-1; i++){
            temp = temp.next;
        }
        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);

        prevNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;
        currNode.prev = prevNode;
        size++;
    }

    //traversal forward
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    //traverse backward
    public void printBackward(){
        Node temp = tail;
        while(temp != null){
            System.out.print("<-" + temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }    

    //search target
    public boolean searchTarget(int target){
        if(head == null){
            System.out.println("List is empty");
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Update in LinkedList
    public void updateValue(int oldValue, int newValue){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldValue){
                temp.data = newValue;
            }
            temp = temp.next;
        }
        return ;
    }

    //delete at head
    public void deleteAtHead(){
        if(head == null){
            System.out.println("No need to delete");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
        }

        head = head.next;
        head.prev= null;
        size--;
    }

    //delete at tail
    public void deleteAtTail(){
        if(tail == null){
            System.out.println("No need to delete");
            return;
        }
        if(head == null){
            head = null;
            tail = null;
            size = 0;
        }
        Node currNode = tail;
        Node prevNode = tail.prev;
        prevNode.next = null;
        currNode.prev = null;
        tail = prevNode;
        size--;
    }

    //deleteAtPosition
    public void deleteAtPosition(int position){
        if(position < 1 || position > size+1){
            System.out.println("Invalid Position");
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
        Node forward = currNode.next;

        prevNode.next = forward;
        forward.prev = currNode.prev;
        currNode.next = null;
        currNode.prev = null;
        size--;
    }

    public static void main(String[] args) {
        DoublyLinkedList mylist = new DoublyLinkedList();
        mylist.insertAtHead(10);
        mylist.printList();
        mylist.insertAtHead(20);
        mylist.printList();
        mylist.insertAtHead(30);
        mylist.printList();
        mylist.insertAtHead(40);
        mylist.printList();
        mylist.insertAtTail(10);
        mylist.printList();
        mylist.insertAtPosition(3,10);
        mylist.printList();
        mylist.printBackward();
        System.out.println("Target found" + mylist.searchTarget(20));
        mylist.updateValue(10,100 );
        mylist.printList();
        mylist.deleteAtHead();
        mylist.printList();
        mylist.deleteAtTail();
        mylist.printList();
        mylist.deleteAtPosition(3);
        mylist.printList();
    }
    
}
