public class Main {

    static int n;
    static int[] ch;

    // L은 원소이다
    public void DFS(int L){

        // n + 1은 종료지점
        if(L == n + 1){
            String temp = "";
            for(int i = 1; i <= n; i++){
                if(ch[i] == 1){
                    temp += (i + " ");
                }
            }
            if(temp.length() > 0){
                System.out.println(temp);
            }

        } else {
            ch[L] = 1;
            DFS(L + 1); // 사용한다
            ch[L] = 0;
            DFS(L + 1); // 사용하지 않는다
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);

    }
}
