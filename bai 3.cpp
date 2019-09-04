#include <stdio.h>
int main(){
	int x,y,a;
	scanf("%d",&x);
	scanf("%d",&y);
	
	a =x;
	x =y;
	y =a;
	
	printf("x=%d",x);
	printf("y=%d",y);
	
	return 0;
	
}
