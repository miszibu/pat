package yi.training;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S=bufferedReader.readLine();
        bufferedReader.close();
        int mod=1000000007;
        int t=0;
        int pat=0;
        int at=0;
        for (int i = S.length()-1; i >=0 ; i--) {
            char ch=S.charAt(i);
            if (ch=='T') {
                t++;
            }
            if (ch=='A') {
                at=(at+t)%mod;
            }
            if (ch=='P') {
                pat=(pat+at)%mod;
            }
        }

        System.out.println(pat);
    }


}

