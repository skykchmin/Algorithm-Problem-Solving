#include <stdio.h>
int main(void) {
	int a, b, c, min;
	scanf_s("%d %d %d", &a, &b, &c);
	min = a;
	if (min > b)    min = b;
	if (min > c)    min = c;

	if (min == a) {
		if (b <= c)        printf("%d", b);
		else    printf("%d", c);
	}
	else if (min == b) {
		if (a <= c)        printf("%d", a);
		else    printf("%d", c);
	}
	else {
		if (a <= b)        printf("%d", a);
		else    printf("%d", b);
	}

	system("pause");

	return 0;
}
