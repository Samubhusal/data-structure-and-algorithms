import java.util.Scanner;
public class LinearQueueImpl {
    static int N=10;//Maximum size or a queue
    static int [] queue=new int[N];
    static int F=-1;
    static int R=-1;

    //Method to check if the queue is FULL

    public static boolean isFull(){
        if(R==N-1){
            return true;
        }else{
            return false;
        }
    }

    //Method to check the queue isEmpty
    public static boolean isEmpty(){
        if(F ==-1 || F>R){
            return true;
        }else{
            return false;
        }
    }

    /**
     * ENQUEUE OPERATION
     * logic:if(ifFull()) write overflow
     */

    public static void enqueue(int ITEM){
        //Check if the queue isFull
        if(isFull()){
            System.out.println("Overflow:Queue isFull");
            return;
        }

        //Check if it is the first element
        if(F==-1){
            F=0;
            R=0;
        }else{
            //Increment rear
            R=R+1;
        }

        queue[R]=ITEM;
        System.out.println(ITEM+"is inserted sucessfullly");
    }

    public static void display(){
        if(isEmpty()){
            System.out.println("queue isEmpty");
            return;
        }
         for(int i=F;i<=R;i++){
         System.out.println(queue[i]+"");
        }
        System.out.println();
    }



    
    public static void dequeue(){
        //Check if the queue isEmpty
        if(isEmpty()){
            System.out.println("Underflow:Queue isEmpty");
            return;
        }

        int ITEM=queue[F];

        //Check if it is the first element
        if(F==R){
            F=-1;
            R=-1;
        }else{
            //Increment front
            F=F+1;
        }

        System.out.println(ITEM+"deleted items from queue");
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=======QUEUE MENU=========");
            System.out.println("1. Is queue empty?");
            System.out.println("2. Is queue full?");
            System.out.println("3. ENQUEUE (Insert)");
            System.out.println("4. DEQUEUE (deleted)");
            System.out.println("5. Display element");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            int element;

            switch (choice) {

                case 1:
                    System.out.println(" Queue is empty?: " + isEmpty());
                    break;

                case 2:
                    System.out.println(" Queue is full?: " + isFull());
                    break;

                case 3:
                    System.out.println("Enter the element to insert:" );
                    element=sc.nextInt();
                    enqueue(element);
                    break;

                case 4:
                    dequeue();
                    break;

                case 5:
                   display();
                    break;

                case 6:
                System.out.println("Exiting....");
                System.exit(0);
                sc.close();
                break;
            
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}

