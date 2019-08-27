#include <stdio.h>

int main(void) {

	int num;
	int a, b, c; // a는 백의 자리 b는 10의 자리 c는 1의 자리
	int count = 0;
	scanf_s("%d", &num);

	if (num < 100) {
		printf("%d", num);
	}
	else {
		int	count = 99; // 1의 자리, 10의 자리는 는 무조건 한수 
		for (int i = 100; i <= num; i++) {
			a = i / 100;
			b = (i/ 10) % 10;
			c = i % 10;
			if (a + c == 2 * b)
				count++;
		}
		printf("%d", count);
	}
	

	system("pause");

	return 0;
}