// class Node{
//     int data;
//     Node next;
    
//     // constructor 
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class DaySixandSeven{
    
    
//     Node head;
    
//     //insertatbegin
    
//     public void insertatbegin(int data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head=newNode;
//     }
    
//     //insertatend
    
//     public void insertatend(int data){
//         Node temp = head;
//         Node newNode = new Node(data);
//         while(temp.next!=null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }
    
//     //insertatspecificposition 
    
//     public void insertatspecificposition(int data, int position){
//         if(position<1){
//             System.out.println("Invalid Position");
//             return;
//         }
//         if(position==1){
//             insertatbegin(data);
//             return;
//         }
//         Node temp = head;
//         Node newNode = new Node(data);
//         for(int i=1; temp!=null && i<position-1; i++){
//             temp =temp.next; 
//         }
//         if(temp==null){
//             System.out.println("Position out of bounds");
//         }
//         else{
//             newNode.next = temp.next;
//             temp.next = newNode;
//         }
//     }

//     //deleteatspecificposition
//     public void deleteatspecificposition(int position)
//     {
//         if(head==null || position<1){return;}

//         if(position==1){ head = head.next;return;}
        
//         Node temp = head;

//         for(int i=1; temp!=null && i<position-1; i++){ temp = temp.next;}

//         if(temp==null || temp.next==null){return;}
//         temp.next = temp.next.next;

//     }
    
//     // deleteatend
//     public void deleteatend()
//     {
        
//         if(head==null){return;}

//         if(head.next==null){head = null;return;}

//         Node temp = head;
        
//         while(temp.next.next!=null){temp = temp.next;}
        
//         temp.next = null;
//     }
    
    
//     //deleteatbeginning 
    
//     public void deleteatbeginning(){
//         if(head==null){
//             return;
//         }
//         head = head.next;
//     }

//     // display 
    
//     public void display(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + " ->");
//             temp = temp.next;
//         }
//         System.out.print("null");
//     }
    
    
//   public static void main(String[] args){
//       DaySixandSeven list = new DaySixandSeven();
//       list.insertatbegin(10);
//       list.insertatbegin(20);
//       list.insertatbegin(30);
//       list.insertatbegin(40);
//       list.insertatbegin(50);
      
//       list.insertatend(100);
//       list.insertatend(150);
//       list.insertatend(200);
      
//       list.insertatspecificposition(75,4);
      
//     //   list.deleteatbeginning();
//     //   list.deleteatbeginning();
//       list.deleteatspecificposition(3);
//       list.deleteatend();
//       list.display();
// }

// }

public class DaySixandSeven {

    // Define the Node class
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    //insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Main method to test
    public static void main(String[] args) {
        DaySixandSeven dll = new DaySixandSeven();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(30);

        System.out.println("Doubly Linked List:");
        dll.display();

        dll.deleteAtBeginning();
        System.out.println("After deletion at beginning:");
        dll.display();
        dll.insertAtEnd(40);
        System.out.println("After inserting at end:");
    }
}


