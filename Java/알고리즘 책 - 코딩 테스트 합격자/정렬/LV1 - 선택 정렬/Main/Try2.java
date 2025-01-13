public class Try2 {
    public static void main(String[] args) {
        Try2 try2 = new Try2();

        int[] arr = { 7, 3, 2, 8, 9, 4, 6, 1, 5};

        try2.solution(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void solution(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            int index = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }

            swap(arr, i, index);
        }


    }

    public void swap(int[] arr, int left, int right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
