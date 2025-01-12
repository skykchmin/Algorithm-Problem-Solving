public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        int[] arr = { 7, 3, 2, 8, 9, 4, 6, 1, 5};

        T.solution(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void solution(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){ // 인덱스
            int min_index = i + 1;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            swap(arr, i, min_index);
        }
    }

    public void swap(int[] arr, int left, int right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
