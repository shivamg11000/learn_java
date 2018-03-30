/*
    javac -d . *
    java thread.Main

*/

package thread;


public class Main{

    // running 2 threads at the same time or multithreading
    public static void main(String[] args) {
        
        Thread timeThread = new timeThread();
        timeThread.start();

        Thread helloThread = new helloThread();
        helloThread.start();

    }

}