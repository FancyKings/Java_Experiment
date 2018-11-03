/*
* http://192.168.119.233/problem?id=153&contestid=169
* */
import java.io.*;

public class Main {

    private static int calLen(int key){
        int ans = 0;
        while(key > 0){
            key /= 10;
            ++ans;
        }
        return ans;
    }

    private static boolean isPal(Integer key){
        String t = key.toString();
        for(int i = 0;i < t.length() / 2; ++i){
            if(t.charAt(i) != t.charAt(t.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer cin = new StreamTokenizer(
            new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while(cin.nextToken() != StreamTokenizer.TT_EOF){
            int in = (int) cin.nval;
            out.println(calLen(in));
            out.flush();
            if(isPal((Integer)(in))){
                out.println("Y");
            }
            else{
                out.println("N");
            }
            out.flush();
        }
    }
}
