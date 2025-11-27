public class stackOperation{
    static final int Max =100;//maximum  size of  the stack
    static int[] stack=new int [Max];
    static int top=-1;

//check if the stack is empty
    static boolean isEmpty(){
        return top<0;
    }
//check if the stack is full
    static boolean isFull(){
        return top>=MAX-1;
    }
    //check the size of the stack
    static int stackSize(){
        return top+1;
    }
    //



}