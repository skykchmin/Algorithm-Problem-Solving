public class MainLecture {

    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        int[] arrA = {5, 3, 8, 9, 2, 4, 7};

        T.sort(arrA);

        for(int i : arrA){
            System.out.println(i);
        }
    }

    private void sort(int[] arrA) {
        l_pivot_sort(arrA, 0, arrA.length - 1);
    }

    private void l_pivot_sort(int[] arrA, int lt, int rt) {

        if(lt >= rt){
            return;
        }

        int pivot = partition(arrA, lt, rt);

        l_pivot_sort(arrA, lt, pivot - 1);
        l_pivot_sort(arrA, pivot + 1, rt);
    }

    private int partition(int[] arrA, int left, int right) {

        int lt = left;
        int rt = right;
        int pivot = arrA[lt];

        while(lt < rt){
            while(arrA[rt] > pivot && lt < rt){
                rt--;
            }

            while(arrA[lt] <= pivot && lt < rt){
                lt++;
            }

            swap(arrA, lt, rt);
        }

        swap(arrA, left, lt);
        return lt;
    }

    private static void swap(int[] arrA, int i, int j){
        int temp = arrA[i];
        arrA[i] = arrA[j];
        arrA[j] = temp;
    }
}
