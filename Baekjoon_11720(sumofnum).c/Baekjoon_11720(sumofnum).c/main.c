#include <stdio.h>
#include <stdlib.h>

int main() {
	int * a; // 배열 요소 첫번째 포인터
	int selectnum = 0;
	int sum = 0; // 합
	printf("입력할 숫자갯수를 입력하세요:");
	scanf("%d", &selectnum);

	 a = calloc(selectnum, sizeof(int));

	for (int i = 0; i < selectnum; i++) {
		scanf("%d", &a[i]);
		sum += a[i];
	}
	printf("%d", sum);
	free(a);
	//system("pause");
	return 0;
}