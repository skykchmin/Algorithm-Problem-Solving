class Try1 {
    public static void main(String[] args) {
        Try1 T = new Try1();

        int[] arr = {5, 3, 8, 9, 2, 4, 7};

        T.solution(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }

    private void solution(int[] arr) {
        left_pivot_sort(arr, 0, arr.length - 1);
    }

    public void left_pivot_sort(int[] arr, int lt, int rt){

        if(lt >= rt){
            return;
        }

        int pivot = partition(arr, lt, rt);

        left_pivot_sort(arr, lt, pivot - 1);
        left_pivot_sort(arr, pivot + 1, rt);

    }

    public int partition(int[] arr, int lt, int rt){

        int left = lt;

        int pivot = arr[lt];

        while (lt < rt) {
            while (lt < rt && arr[rt] >= pivot) {
                rt--;
            }
            while (lt < rt && arr[lt] <= pivot) {
                lt++;
            }
            if (lt < rt) {
                swap(arr, lt, rt); // 교환
            }
        }
        swap(arr, left, lt); // 피벗을 정확한 위치로 이동
        return lt; // 피벗의 최종 위치 반환
    }

    public void swap(int[] arr, int lt, int rt){
        int temp = arr[rt];
        arr[rt] = arr[lt];
        arr[lt] = temp;
    }

}