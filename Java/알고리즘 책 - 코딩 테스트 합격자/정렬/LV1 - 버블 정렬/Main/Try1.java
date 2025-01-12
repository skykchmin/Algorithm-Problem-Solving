public class Try1 {
    public static void main(String[] args) {
        Try1 T = new Try1();

        int[] arr = {6, 3, 7, 5, 4, 2};

        T.solution(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void solution(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr [j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
