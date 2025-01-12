public class Try3 {
    public static void main(String[] args) {
        Try3 try3 = new Try3();

        int[] arr = {5, 3, 8, 9, 2, 4, 7};

        try3.solution(arr);

        for(int num : arr){
            System.out.println(num);
        }
    }

    private void solution(int[] arr) {

        left_pivot_solution(arr, 0, arr.length - 1);
    }

    private void left_pivot_solution(int[] arr, int lt, int rt) {

        if(lt >= rt){
            return;
        }

        int pivot = partition(arr, lt, rt);

        left_pivot_solution(arr, lt, pivot - 1);
        left_pivot_solution(arr, pivot + 1, rt);
    }

    private int partition(int[] arr, int lt, int rt) {

        int left = lt;
        int right = rt;

        int pivot = arr[lt];

        while(lt < rt){
            while(lt < rt && arr[rt] >= pivot){
                rt--;
            }

            while (lt < rt && arr[lt] < pivot){
                lt++;
            }

            swap(arr, lt, rt);
        }

        swap(arr, left, lt);

        return lt;
    }

    public void swap(int[] arr, int lt, int rt){
        int temp = arr[rt];
        arr[rt] = arr[lt];
        arr[lt] = temp;
    }
}
