package yi.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main implements Comparable<Main>{
    double n,m;
    double average;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = (int) s.nextLong();
        double c = 0;
        ArrayList<Main> main = new ArrayList<Main>();
        for(int i = 0; i < a; i ++){
            Main o = new Main(s.nextDouble());
            main.add(o);
        }
        for(int i = 0; i < a; i ++){
            main.get(i).setM(s.nextDouble());;
        }
        Collections.sort(main);
        while(b != 0){
            if(b > main.get(0).n ){
                c += main.get(0).m;
                b -= main.get(0).n;
            }
            else {
                c += main.get(0).average * b;
                b = 0;
            }
            main.remove(0);
        }
        System.out.println(String.format("%1$.2f",c));
    }
    Main(double n){
        this.n = n;

    }
    void setM(double m){
        this.m = m;
        average = m /n;
    }
    @Override
    public int compareTo(Main o) {
        // TODO Auto-generated method stub
        if(average - o.average >0)
            return -1;
        else if(average == o.average)
            return 0;
        else
            return 1;
    }
    public String toString(){
        return n + " " + m + " " +average;
    }
}