package yi.training;
import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/17.
 * 规律找到了 直接跑居然还是超限 看别的JAVA代码 为什么能过？
 * 不懂 应该是题目本身的原因
 * 内存消耗:32769 超限
 */
public class item1002New {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(new BufferedInputStream(System.in));
        int index;
        while (keyBoard.hasNext()) {
            index = keyBoard.nextInt();
            if (index % 4 ==2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }


}
