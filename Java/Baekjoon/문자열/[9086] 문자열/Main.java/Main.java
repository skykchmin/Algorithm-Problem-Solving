import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        List<String> resultList = new ArrayList<>();

        for(int i = 0; i < t; i++){
            String testCase = br.readLine();

            String rs = testCase.charAt(0) + "" + testCase.charAt(testCase.length() - 1);

            resultList.add(rs);
        }

        for (String s : resultList) {
            System.out.println(s);
        }
    }
}
