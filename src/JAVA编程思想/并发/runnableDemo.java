package JAVA编程思想.并发;

/**
 * Created by zibu on 2018/3/19.
 */
public class runnableDemo implements Runnable{
    static int count = 0;
    public int id = 0;
    public void run(){
        id = count++;
        System.out.println(id);
    }
    public String toString(){
        return this+" : id";
    }
}
