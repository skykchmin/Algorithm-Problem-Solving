public class Try4 {
    public static void main(String[] args) {

        Try4 try4 = new Try4();

        int[] arr = {5, 3, 8, 9, 2, 4, 7};

        try4.solution(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void solution(int[] arr) {

        leftPivot(arr, 0, arr.length - 1);
    }

    private void leftPivot(int[] arr, int lt, int rt) {

        if(lt >= rt){
            return;
        }

        int pivot = parition(arr, lt, rt);

        leftPivot(arr, lt, pivot - 1);
        leftPivot(arr, pivot + 1, rt);
    }

    public int parition(int[] arr, int lt, int rt){
        int left = lt;
        int right = rt;

        int pivot = arr[lt];

        while(lt < rt){
            while(lt < rt && arr[rt] >= pivot){
                rt--;
            }

            while(lt < rt && arr[lt] < pivot){
                lt++;
            }

            swap(arr, lt, rt);
        }

        swap(arr, left, lt);

        return lt;
    }

    public void swap(int[] arr, int lt, int rt){
        int temp = arr[lt];
        arr[lt] = arr[rt];
        arr[rt] = temp;
    }

}
