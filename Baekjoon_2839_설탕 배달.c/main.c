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

		N = N - 3; // 3�� ��� �������ν� �������� 5�� �ǰ� �����.
		bag++;

		if (N < 0) { // 0�� �Ǿ��µ��� 5�� ������������ ������ -1�� ��� 
			printf("-1");
			break;
		}

		
	}
	
	system("pause");
	return 0;
}