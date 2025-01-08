import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            String[] sizes = br.readLine().trim().split(" ");
            int a = Integer.parseInt(sizes[0]);
            int b = Integer.parseInt(sizes[1]);

            int[] arrA = readArray(br.readLine().trim().split(" "), a);
            int[] arrB = readArray(br.readLine().trim().split(" "), b);

            solution(arrA, arrB);
        }

        for (int answer : list) {
            System.out.println(answer);
        }
    }

    private static int[] readArray(String[] input, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    private static void solution(int[] arrA, int[] arrB) {
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int count = 0;
        for (int i = arrB.length - 1; i >= 0; i--) {
            for (int j = arrA.length - 1; j >= 0; j--) {
                if (arrA[j] > arrB[i]) {
                    count++;
                } else {
                    break;
                }
            }
        }

        list.add(count);
    }
}