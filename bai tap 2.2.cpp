#include <stdio.h>
int main(){
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	
	while((a>0)&&(b>0)&&(c>0)){
		if((a+b>c)&&(a+c>b)&&(b+c>a)){
			printf("a=%d\n",a);
			printf("b=%d\n",b);
			printf("c=%d\n",c);
		}else{
			printf("nhap lai\n");
			scanf("%d",&a);
        	scanf("%d",&b);
        	scanf("%d",&c);
        	
            printf("a=%d\n",a);
			printf("b=%d\n",b);
			printf("c=%d\n",c);
	       
		}
		break;
	} 
	
	
	return 0;
}
