#include <stdio.h>

int main(void) {

	int num;
	int a, b, c; // a�� ���� �ڸ� b�� 10�� �ڸ� c�� 1�� �ڸ�
	int count = 0;
	scanf_s("%d", &num);

	if (num < 100) {
		printf("%d", num);
	}
	else {
		int	count = 99; // 1�� �ڸ�, 10�� �ڸ��� �� ������ �Ѽ� 
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