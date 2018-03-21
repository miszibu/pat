package JAVA编程思想.并发;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zibu on 2018/3/20.
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i=0;i<5;i++){
            results.add(exec.submit(new TaskWithResult()));
        }
        for (Future<String> fs:results){
            try {
                System.out.println(fs.get());
            }catch (InterruptedException e){
                System.err.println(e);
            }catch (ExecutionException e){
                System.err.println(e);
            }finally {
                exec.shutdown();
            }
        }
    }
}
