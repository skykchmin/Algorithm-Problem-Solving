import java.util.Scanner;

public class Main2 {

    static int[] arr;

    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        arr = new int[n + 1];

        String[] strings = sc.nextLine().split(" ");
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(strings[i - 1]);
        }

        int studentNum = sc.nextInt();
        sc.nextLine();

        int[][] student = new int[studentNum][2];
        for(int i = 0; i < studentNum; i++){
            student[i][0] = sc.nextInt();
            student[i][1] = sc.nextInt();
        }

        T.solution(studentNum, student);

        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(i % 20 == 0){
                System.out.println();
            }
        }
    }

    private void solution(int studentNum, int[][] student) {

        //
        for(int i = 0; i < studentNum; i++){
            // 남자일 경우
            if(student[i][0] == 1){
                int mul = student[i][1];
                for(int j = 1; j * mul <= arr.length; j++){
                    if(j * mul > arr.length - 1){
                        continue;
                    }

                    if(arr[j * mul] == 1){
                        arr[j * mul] = 0;
                    } else {
                        arr[j * mul] = 1;
                    }
                }
            } else { // 여자일 경우
                int line = student[i][1];
                int n = 0;

                while (line - n > 0 && line + n <= arr.length - 1){
                    if(arr[line - n] == arr[line + n]){
                        if(arr[line - n] == 1 && arr[line + n] == 1){
                            arr[line - n] = 0;
                            arr[line + n] = 0;
                        } else if(arr[line - n] == 0 && arr[line + n] == 0){
                            arr[line - n] = 1;
                            arr[line + n] = 1;
                        }
                    } else {
                        break;
                    }
                    n++;
                }
            }
        }
    }
}
