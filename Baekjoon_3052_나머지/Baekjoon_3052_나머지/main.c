#include <stdio.h>

#include <stdio.h>

#include <string.h>

int main() {

	int arr[43] = { 0,  };
	int n = 0;
	for (int i = 0; i < 10; i++) {
		int m;
		scanf("%d", &m);

		if (arr[m % 42] == 0) {
			n++;
			arr[m % 42] = 1;
		}

	}

	printf("%d", n);

	system("pause");

	return 0;

}

// 1. ������ �� �������� �ӽ� temp �� ����
// 2. �������� �迭�� ������ ���� ���� ������ count +1 ex) remain[i] += 1
// 3. �ٸ� ���� ������ i�� ������Ŵ 