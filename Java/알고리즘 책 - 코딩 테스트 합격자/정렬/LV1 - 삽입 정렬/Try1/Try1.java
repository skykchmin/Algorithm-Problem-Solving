public class Try1 {
    public static void main(String[] args) {
        Try1 try1 = new Try1();

        int[] arr = { 7, 3, 2, 8, 9, 4, 6, 1, 5};

        try1.solution(arr);


    }

    private void solution(int[] arr) {

        for(int i = 1; i < arr.length; i++){

            int target = arr[i];

            int j = i - 1;

            while( j >= 0 && target < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }
    }
}
