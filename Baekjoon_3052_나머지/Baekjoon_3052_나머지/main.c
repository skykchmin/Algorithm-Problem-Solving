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

// 1. 나눴을 때 나머지를 임시 temp 에 저장
// 2. 나머지가 배열에 저장한 같은 값이 있으면 count +1 ex) remain[i] += 1
// 3. 다른 값이 있으면 i를 증가시킴 