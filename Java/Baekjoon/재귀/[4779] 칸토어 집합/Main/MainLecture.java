import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainLecture {

    static char[] lineArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input;

        while ((input = br.readLine()) != null){
            int n = Integer.parseInt(input);
            sb = new StringBuilder();

            int len = (int) Math.pow(3, n);

            lineArr = new char[len];
            Arrays.fill(lineArr, '-');

            divide(0, len); //메소드 호출

            for(int i = 0; i < lineArr.length; i++){
                sb.append(lineArr[i]);
            }
            System.out.println(sb);
        }
        br.close();
    }

    //3등분해서 가운데는 공백으로 두는 로직 (파라미터 : 구역 시작점, 해당 구역의 길이)
    static void divide(int start, int length) {
        //길이가 3보다 작으면 3등분할 수 X => 종료
        if(length <= 1){
            return;
        }

        //3등분으로 쪼개기 위한 변수 값
        int newlength = length/3;

        //가운데 공백(두번째 구역)으로 바꾸기
        for(int i = start+newlength; i < start+newlength*2; i++){
            lineArr[i] = ' ';
        }

        //첫번째 구역 쪼개기
        divide(start, newlength);

        //세번째 구역 쪼개기
        divide(start+newlength*2, newlength);
    }

}
