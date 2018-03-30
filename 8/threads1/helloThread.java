package thread;

// thread that prints hello world 
public class helloThread extends Thread{

    public void run() {

        for (int i=0 ; i<2 ; i++){
            try{  Thread.sleep(5000);  }
            catch(InterruptedException e){ }

            System.out.println("Hello");
        }

    }

}