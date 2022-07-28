package MultiThreading;
public class num1{
    public static void main(String[] args) {
        Mythread obj = new Mythread("SUBHASIS");
        boolean life_status = obj.isAlive();

        obj.start();
        System.out.println("The name of the thread is : "+obj.getName());
        System.out.println("The ID of the thread is : "+obj.getId());

        if (life_status == true) {
            System.out.println("Life status of Thread: Alive");
        
        }
        else  {
            System.out.println("Life status of Thread: Dead");
        
        }
        

       

        
    }
}

class Mythread extends Thread{
    public Mythread(String str){
        super(str);

    }

    public void run(){
        System.out.println("HELLO!");
    }


    }
