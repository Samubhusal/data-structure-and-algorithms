// import java.util.Collections;
// import java.util.PriorityQueue;

// public class PriorityQueueExample{
//     public static void main(String[] args) {
//         //Default:Min-Priority queue
//         // PriorityQueue<Integer> pq=new PriorityQueue<>();

//         //Max Priority
//          PriorityQueue<Integer> pq=new PriorityQueue<>
//         (Collections.reverseOrder());

//         pq.add(10);
//         pq.add(5);
//         pq.add(20);

//         //Peek:see the top element

//         System.out.println("Top element:"+pq.peek()); //output:5

//         //pool:Remove and return the top element
//         while(!pq.isEmpty()){
//             System.out.println("Processing:"+pq.poll());
//         }
//     }
// }

class PriorityQueueExample {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        int element = 25;
        int position = 3;

        int[] newArr = new int[n + 1];

        // Copy elements before position
        for (int i = 0; i < position - 1; i++) {
            newArr[i] = arr[i];
        }

        // Insert element
        newArr[position - 1] = element;

        // Copy remaining elements
        for (int i = position - 1; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}



