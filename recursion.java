public class recursion {
    // public static int multiple(int k){
    //     if(k==1){
    //         return 1;
    //     }else{
    //         return k*multiple(k-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     int k=5;
    //     int result=multiple(k);
    //     System.out.println(result);
    // }
    // static void printNum(int n){
    //     if(n==0){
    //         return;
    //     }

    //     System.out.println(n);
    //     printNum(n-1);
    // }
    // public static void main(String[] args) {
    //     int num=5;
    //     printNum(num);
    // }

    public static int fibonacci(int k){
        if(k<=1){//if(k==0||k==1)
            return k;
        }else{
            return fibonacci(k-1)+fibonacci(k-2);
        }
    }
    public static void main(String[] args) {
        int k=10;

        for(int i=0;i<k;i++){
             System.out.println(fibonacci(i)+"");
        }
    }
}
//Application of recursion
//TOH

