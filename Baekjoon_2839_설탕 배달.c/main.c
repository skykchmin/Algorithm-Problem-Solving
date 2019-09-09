#include <stdio.h>

int main(void) {

	int N;
	scanf("%d", &N);
	int bag = 0;
	while (1) {
		if (N % 5 == 0) {
			bag += N / 5;
			printf("%d", bag);
			break;
			
		}

		N = N - 3; // 3을 계속 빼줌으로써 나머지가 5가 되게 만든다.
		bag++;

		if (N < 0) { // 0이 되었는데도 5로 나눠떨어지지 않으면 -1을 출력 
			printf("-1");
			break;
		}

		
	}
	
	system("pause");
	return 0;
}