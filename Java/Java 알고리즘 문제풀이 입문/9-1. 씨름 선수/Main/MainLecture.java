import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int h, w;

    Body(int h, int w){
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o){
        return o.h - this.h; // h에서 내림차순 된다
    }
}

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Body> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            
            arr.add(new Body(h, w));
        }

        System.out.println(T.solution(arr, n));
    }

    private int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);

        int max = Integer.MIN_VALUE;
        for(Body ob : arr){
            if(ob.w > max){
                max = ob.w; // 여기서는 몸무게로 비교한다
                cnt++;
            }
        }

        return cnt;
    }

}
