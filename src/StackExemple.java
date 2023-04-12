import java.sql.SQLOutput;
import java.util.*;

public class StackExemple {
    public static void main(String[] args) {
       // stackMethod();
       // queueMethod();
        // priorityQueue();
        //linkedListMethod();
        DynamicArray dynamicArray = new DynamicArray(10);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0, "X");
        System.out.println("Empty: "+ dynamicArray.isEmpty());
        System.out.println("Size: "+ dynamicArray.size);
        dynamicArray.delete("A");
        System.out.println("Position: " + dynamicArray.search("C"));
        System.out.println(dynamicArray);
    }
    public static void stackMethod(){
        // A Stack is a LIFO data structure Last-IN First-Out
        System.out.println("Hello World");
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Game");
        stack.push("Cold");
        stack.push("TUT");

        System.out.println(" Print "+ stack.search("Minecraft"));
        System.out.println(stack);

    }
    public static void queueMethod(){
        //dequeue(remove), or pool()
        //add is equal to enqueue , offer()
        Queue<String> queue = new LinkedList<>() ;
        System.out.println(queue.isEmpty());
        queue.offer("Karem");
        queue.offer("Mutunda");
        queue.offer("Howard");
        System.out.println(queue);
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    /*
        1. keyword buffer letter  should appear on the screen in the order they are pressed
        2. Queue is FIFO data structure which means first in first out
        3. A collection designed for holding elements prior to processing Linear data structure
        4. enqueue = offer() = add
        5. dequeue = poll() = remove
     */
    }
    //Priority queue
    public static void priorityQueue(){
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("C");
        queue.offer("F");
        queue.offer("A");
        queue.offer("I");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
    public static void linkedListMethod(){
        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.push("K");
//        linkedList.push("A");
//        linkedList.push("T");
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("E");
//
//        System.out.println(linkedList);
        // The linkedList can
        linkedList.offer("K");
        linkedList.offer("A");
        linkedList.offer("T");
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("E");
        System.out.println(linkedList);
        linkedList.addFirst("Lady");
        System.out.println(linkedList);
        /*
        LinkedList = stores Nodes in parts (data + address)
                     Nodes are in non-consecutive memory locations
                     Elements are linked using pointers
                     Singly Linked List
                  Node                Node                Node
            •[data | address] -> [data | address] -> [data | address]
                     Doubly Linked List
                        Node            |            Node
            [address | data | address] ‹-> [address | data | address]
            Advantages?
            1. Dynamic Data Structure (allocates needed memory while running)
            2. Insertion and Deletion of Nodes is easy. 0(1)
            3. No/Low memory waste
            Disadvantages
            1. Greater memory usage (additional pointer)
            2. No random access of elements (no index [i])
            3. Accessing/searching elements is more time-consuming. O(n)
            Uses
            1. Implements Stacks/Queues
            2. GPS navigation
            3. Music playlist
         */
    }

    public static void dynamicArray(){

    }

}
