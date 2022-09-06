class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;


    public void MyLinkedList() {
        head=null;
        tail=null;
        size=0;

    }

    public int get(int index) {
        if (index>size-1){
            return -1;
        }
        else{
            Node temp= head;
            int counter=0;
            while(counter<index){
                counter++;
                temp=temp.next;
            }
            if (temp== null) return -1;
            return temp.val;
        }

    }

    public void addAtHead(int val) {
        Node newnode= new Node(val);
        if(size == 0){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        size++;

    }

    public void addAtTail(int val) {
        if(head == null) {
            addAtHead(val);
        }
        else{
            Node newnode= new Node(val);
            tail.next=newnode;
            tail=newnode;
        }
        size++;


    }
    public void addAtIndex(int index, int val) {
        if (index>size){
            return;
        }
        else if (index==size){
            addAtTail(val);


        }
        else if(index==0){
            addAtHead( val);

        }
        else{

            Node temp= head;
            int counter=0;
            while(counter<index-1){
                counter++;
                temp=temp.next;
            }
            Node newnode = new Node(val);

            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size)
            return;
        else if(index==size-1){
            Node temp=head;
            int counter=0;
            while(counter<index-1){
                counter++;
                temp=temp.next;
            }
            tail = temp;
            temp.next=null;

        }
        else if(index == 0){
            head=head.next;
        }
        else{
            Node temp= head;
            int counter=0;
            while(counter<index-1){
                counter++;
                temp=temp.next;
            }
            temp.next=temp.next.next;

        }
        size--;
    }
    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */