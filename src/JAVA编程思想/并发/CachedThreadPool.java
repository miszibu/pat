package JAVA编程思想.并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zibu on 2018/3/20.
 */
public class CachedThreadPool {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++){
            exec.execute(new runnableDemo());
        }
        exec.shutdown();
    }
}
