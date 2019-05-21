#include <stdio.h>

int dayofmonth[13] = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
char *dayofweek[7] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

int main() {
	int month, day;
	scanf("%d %d", &month, &day);
	for (int i = 1; i < month; ++i) {
		day += dayofmonth[i];
	}
	printf("%s\n", dayofweek[day % 7]);

	//system("pause");

	return 0;
}