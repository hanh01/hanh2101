#include <stdio.h>
int main(){
	int ary[12];
	int s=0;
	float a;
	for(int i=0;i<12;i++){
		scanf("%d",&ary[i]);
    	s+=ary[i];  
        a=(float)s/12; 
}
	  printf("gia tri trung binh cua mang la :a=%f\n",a);
	  return 0;
}
