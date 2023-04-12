import java.sql.SQLOutput;
import java.util.*;

public class StackExemple {
    public static void main(String[] args) {

    }

    private static int factorial(int number, int num) {
        if (num <1) return 1;
        return number * factorial(number, num -1);
    }
    public static void mergeSort(){
        int array [] = {2,6,7,8,1,30,8,23,0,12,7,99};
        sortingByMerge(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ " ");
        }

    }
    private static void sortingByMerge(int [] array){
        int length = array.length;
        if (length <=1)return;
        int middle = length/2;
        int [] leftArray= new int[middle];
        int []rightArray = new int[length - middle];
                int i=0;//left array
                int j=0;//right array

        for (; i<length ; i++) {
            if (i < middle) {
               leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }

        }
        sortingByMerge(leftArray);
        sortingByMerge(rightArray);
        merge(leftArray,rightArray, array);

    }
    private static void merge(int []leftArray, int [] rightArray, int array[]){
        int leftSize = array.length / 2;
        int rightSize = array.length- leftSize;
        int i=0, l=0,r=0;
        while (l <leftSize && r<rightSize){
            if (leftArray[l]< rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l<leftSize){
            array[i]= leftArray[l];
            i++;
            l++;
        }
        while (r<rightSize){
            array[i]= rightArray[r];
            i++;
            r++;
        }
    }

    //
    public static void bubbleSort(){
        /*
                bubble sort = pairs of adjacent elements are compared, and the elements
                              swapped if they are not in order
                              Quadratic time 0(n^2)
                              small data set = okay-ish
                              large data set = BAD (plz don't )
         */
        int array [] = {2,6,7,8,1,30,8,23,0,12,7,99};
        sortBubble(array);
        for (int i: array ) {
            System.out.println(i);
        }
    }
    private static void sortBubble(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1; j++) {
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }

    }
   public static void linearSearch(){
        /*
            Linear search = Iterate through a collection one element at the time
            runtime complexity: O(n)
            1. Advantages:
                - Fast for searches of small to media data sets
                - Does not need to be sorted
                - Useful for data structures that do not have random access (Linked List)
            2. Disadvantages:
                -  Slow for large data sets
         */
       int [] array ={3,7,9,1,9,0,5, 1};
       int index = searchLinear(array,  1);
       if (index !=-1){
           System.out.println("Element found at index: "+ index);
       }else{
           System.out.println("Element not found in the array");
       }
   }
    private static int searchLinear(int [] array, int value){
        for (int i=0; i<array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
       return -1;
    }

    public static void interpolationSearch(){
        /*
            interpolation search = improvement over binary search best for "uniformly" distributed data
                                    "guesses" where a value might be based on calculated probe results
                                    if the probe is incorrect, search is narrowed, and a new probe is calculated

                                    average case: O(log(log(n)))
                                    worst case: O(n) [values increase exponentially]
         */
        int []array = {1,2,89,4,66,78,0,12,7,8,9};
        int index = interpolation(array, 4);
        if (index != -1){
            System.out.println("Target found at: " + index);
        }else{
            System.out.println("Target not found  ");
        }

    }

    private static int interpolation(int[] array, int value) {
        int high = array.length -1;
        int low =0;
        while (value >= array[low] && value <= array[high] && low <=high){
            int probe =low +  (high -low )*
                        (value -array[low])/
                        (array[high]- array[low]);
            System.out.println("Probe: "+probe);
            if (array[probe]== value){
                return probe;
            }
            else if(array[probe]<value){
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }
        }
        return -1;
    }

    public static void binarySearch(){
        /*
                binary search = Search algorithm that finds the position of a target
                value within a sorted array.
                Half of the array is eliminated during each "step"
         */
        int [] array = new int[1000000];
        int target = 789900;
        for (int i=0; i<array.length; i++){
            array[i] = i;
        }
        int index = binarySearch(array, target);
        if (index != -1){
            System.out.println("Target found at: " + index);
        }else{
            System.out.println("Target not found  ");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low =0;
        int high = array.length -1;
        while (low <=high){
            int middle = low +(high - low)/2;
            int value = array[middle];
            System.out.println("Middle: "+ value);
            if (value <target) low = middle +1;
            else if(value > target) high = middle +1;
            else return middle;

        }
        return -1;
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
    public static  void differenceArrayAndLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        for (int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        //*************** LinkedList *************
        startTime = System.nanoTime();//GET THE START TIME
        linkedList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("LinkedList: \t" + elapsedTime +"ns");


        //*************** ArrayList *************
        startTime = System.nanoTime();//GET THE START TIME
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("ArrayList: \t" + elapsedTime +"ns");
    }
    public static void callMethod(){
        /* stackMethod();
        queueMethod();
         priorityQueue();
        linkedListMethod();

         */
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

}
