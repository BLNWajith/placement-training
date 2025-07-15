// public class DayNine {
//     int [] a = new int[5];
//     int top = -1;

//     public void push(int x) {
//         if (top == a.length - 1) {
//             System.out.println("DayNine is overflow");
//         } else {
//             a[++top] = x;
//         }
//     }

//     public int pop() {
//         if (top == -1) {
//             System.out.println("DayNine is underflow");
//             return -1;
//         } else {
//             return a[top--];
//         }
//     }

//     // Method to display the DayNine elements
//     public void display() {
//         if (top == -1) {
//             System.out.println("DayNine is empty");
//         } else {
//             System.out.print("DayNine elements: ");
//             for (int i = top; i >= 0; i--) {
//                 System.out.print(a[i] + " ");
//             }
//             System.out.println();
//         }
//     }

// }


class DayNine{
    int data;
    DayNine next;
    
    //constructor 
    DayNine(int data){
    this.data = data;
    this.next = null;
    }
}

class DayNineone{
    
    DayNine top;
    public void push(int data){
        DayNine newNode = new DayNine(data);
        newNode.next = top;
        top = newNode;
    }
    
    
    public boolean isEmpty(){
        return top ==null;
    }
    
    
    public void peek(){
        if(isEmpty()){
            System.out.println("DayNine is underflow");
        }
        else{
            System.out.println("Top of the elements :" + top.data);
        }
    }
    
    // Method to pop the top element from the DayNine
    public void pop(){
        if(isEmpty()){
            System.out.println("DayNine underflow");
            return;
        }
        System.out.println("Popped element: "  + top.data);
        top = top.next;
    }


    public void display(){
        if(isEmpty()){
            System.out.println("DayNine underflow");
        }
        DayNine temp = top;
        while(temp!=null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
    }

}

public class Main{
    public static void main(String[] args){
        DayNineone operations = new DayNineone();
        operations.push(10);
        operations.push(20);
        operations.push(30);
        operations.push(40);
        operations.push(50);
        operations.peek();
        operations.display();
        operations.pop();
    }
}