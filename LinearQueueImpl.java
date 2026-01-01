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



    
    public static void dequeue(){
        //Check if the queue isEmpty
        if(isEmpty()){
            System.out.println("Overflow:Queue isEmpty");
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

}

//display code
