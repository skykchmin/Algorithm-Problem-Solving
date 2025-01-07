import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainLecture { // 역원소 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());

        long arr[] = new long[n];
        String str = "", temp = "";

        while (n > 0) {
            while (st.hasMoreTokens()) {
                str = st.nextToken();
                temp = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    temp += str.charAt(i);
                }
                arr[--n] = Long.parseLong(temp);
            }
            if(n>0)
                st = new StringTokenizer(bf.readLine());
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
    }
}