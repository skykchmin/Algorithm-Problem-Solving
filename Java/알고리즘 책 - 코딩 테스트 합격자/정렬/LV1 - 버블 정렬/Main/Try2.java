public class Try2 {
    public static void main(String[] args) {
        Try2 try2 = new Try2();

        int[] arr = {6, 3, 7, 5, 4, 2};

        try2.solution(arr);

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
