package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 说反话 tell opposite sentence
 */
public class item1041 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        for (int i = words.length - 1; i > 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println(words[0]);
    }
}
