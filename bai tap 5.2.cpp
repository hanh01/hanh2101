#include <stdio.h>
int main(){
	printf(" 1.cafe\n 2.sinh to\n 3.nuoc ep\n");
		int n;
	printf("nhap vao so :");
	scanf("%d",&n);
 	
 for(;n>3;){
 	printf("nhap lai\n");
 	scanf("%d",&n);
 }
    switch(n){
   	case 1: printf("cafe \n");break;
   	case 2: printf("sinh to \n");break;
   	case 3: printf(" nuoc ep \n");break;
   	defaulf:break;
   }
	 
	  return 0;
}
