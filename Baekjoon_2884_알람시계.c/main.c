#include <stdio.h>

int main(void) {

	int H, M = 0;
	int temp = 0;

	scanf_s("%d %d", &H, &M);
	
	temp = M - 45;
	

	if (temp < 0) {
		H = H - 1;
		M = temp + 60;
		if (H == -1) {
			H = 23;
		}
	}
	else
		M = temp;
	printf("%d %d", H, M);


		system("pause");
		return 0;
}