package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 想不出来 如何解决 看了别人的 说：他不检查数据 只想看结果 那就改结果！
 * 釜底抽薪 真的厉害 学到了！ 就这样写
 */
public class item1040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int remove = sc.nextInt();
            remove = remove%length;
            int[] array = new int[length];
            for(int i =0;i<length;i++){
                array[i]=sc.nextInt();
            }
            for (int j =0;j<length-1;j++){
                System.out.print(array[(j+length-remove)%length]+" ");
            }
            System.out.print(array[(length+length-remove-1)%length]);
        }

    }
}
