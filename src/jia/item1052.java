package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/8/7.
 * Dating (20) 这是一道英语阅读题我觉得更像是
 */
public class item1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        StringBuilder a = new StringBuilder(sc.nextLine());
        StringBuilder b = new StringBuilder(sc.nextLine());
        StringBuilder c = new StringBuilder(sc.nextLine());
        StringBuilder d = new StringBuilder(sc.nextLine());
        int firLength = a.length() > b.length() ? b.length() : a.length();
        int secLength = c.length() > d.length() ? d.length() : c.length();
        int times = 0;
        for (int i = 0; i < firLength; i++) {
            if (times == 0 && a.charAt(i) == b.charAt(i) && 'A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
                System.out.print(week[a.charAt(i) - 'A'] + " ");
                times++;
            } else if (times == 1 && a.charAt(i) == b.charAt(i) && (('A' <= a.charAt(i) && a.charAt(i) <= 'Z') || ('0' <= a.charAt(i) && a.charAt(i) <= '9'))) {
                if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
                    System.out.print((a.charAt(i) - 'A') + 10);
                } else {
                    System.out.print("0" + (a.charAt(i) - '0'));
                }
                break;
            }
        }
        System.out.print(":");
        for (int i = 0; i < secLength; i++) {
            if (c.charAt(i) == d.charAt(i) && (('A' <= c.charAt(i) && c.charAt(i) <= 'Z') || ('a' <= c.charAt(i) && c.charAt(i) <= 'z'))) {
                if (i < 10)
                    System.out.print(0);
                System.out.print(i);
                break;
            }
        }
    }
}
