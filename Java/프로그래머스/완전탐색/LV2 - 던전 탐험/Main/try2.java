class try2 {

    static int n;
    static int max = Integer.MIN_VALUE;

    public int solution(int k, int[][] dungeons) {

        n = dungeons.length;

        boolean[] visit = new boolean[n + 1];

        dfs(0, k, dungeons, visit);

        System.out.println(max);
        return max;
    }

    public void dfs(int depth, int sum, int[][] dungeons, boolean[] visit){

        max = Math.max(max, depth);

        for(int i = 0; i < n; i++){
            if(visit[i + 1] == false && sum >= dungeons[i][0]){
                visit[i + 1] = true;
                dfs(depth + 1, sum - dungeons[i][1], dungeons, visit);
                visit[i + 1] = false;
            }
        }
    }

    public static void main(String[] args) {
        try2 T = new try2();

        int[][] dungeon = {
                {80, 20},
                {50, 40},
                {30, 10}
        };
        T.solution(80, dungeon);
    }
}