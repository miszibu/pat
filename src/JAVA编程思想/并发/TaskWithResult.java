package JAVA编程思想.并发;

import java.util.concurrent.Callable;

/**
 * Created by zibu on 2018/3/20.
 */
public class TaskWithResult implements Callable<String>{
    static int count=0;
    private int id = 0;
    public String call() throws Exception {
        id = count++;
        return "TaskWithResult"+id;
    }
}
