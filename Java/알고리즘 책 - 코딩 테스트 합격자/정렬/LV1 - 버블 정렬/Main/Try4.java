public class Try4 {
    public static void main(String[] args) {
        Try4 try4 = new Try4();

        int[] arr = {6, 3, 7, 5, 4, 2};

        try4.solution(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void solution(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[j + 1]){

                }
            }
        }
    }
}
