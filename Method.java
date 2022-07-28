class Counter{
    static int  count;

   public synchronized void increment(int index){
       count = count + index;
   }

   public int show(){
       return count;
   }
}

class  Sum1 extends Counter implements Runnable  {
   
   public   void run(){
       for(int i =1; i<=5; i++){
           increment(i);
       }
   }
}
class Sum2 extends Counter implements Runnable {
 
   public  void run(){
       for(int i =6; i<=10; i++){
          increment(i);
       }
   }

}

public class Method{
   public static void main(String[] args)throws Exception {
       Counter c = new Counter();
     
       Sum1 s1 = new Sum1();
       Sum2 s2 = new Sum2();

       
       Thread t1 = new Thread(s1);
       Thread t2 = new Thread(s2);
        

       t1.start();
       t1.join();

      

       t2.start();
       t2.join();



       System.out.println("Count "+ c.show());
   }
}