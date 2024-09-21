import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    class Point implements Comparable<Point>{

        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            // y 값이 같은 경우, x 값을 오름차순으로 정렬
            if (this.y == o.y) {
                return this.x - o.x;  // x 오름차순 정렬
            } else {
                return this.y - o.y;  // y 오름차순 정렬
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            int[] temp = new int[2];

            String[] strings = sc.nextLine().split(" ");
            temp[0] = Integer.parseInt(strings[0]);
            temp[1] = Integer.parseInt(strings[1]);

            arr[i] = temp;
        }
        
        T.solution(arr);
    }

    private void solution(int[][] arr) {

        // 좌표 생성하기
        List<Point> pointList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            Point point = new Point(arr[i][0], arr[i][1]);
            pointList.add(point);
        }

        // 스왑
//        Collections.sort(pointList, Point::compareTo);
        // compareTo가 자동 호출되어 정렬
        Collections.sort(pointList);


        for(Point point : pointList){
            System.out.println(point.x + " " + point.y);
        }
    }
}
