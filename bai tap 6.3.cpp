#include <stdio.h>
int main(){
    	int a[6];
	for(int i=0;i<6;i++){
	  	scanf("%d",&a[i]);
}
    for(int i=0;i<6;i++){
     if(a[i]==0){
        printf("          *\n");}
      if(a[i]==1){  
        printf("          **\n");}
      if(a[i]==2){ 
        printf("          ***\n");}
      if(a[i]==3){
        printf("          ****\n");}
      if(a[i]==4){  
        printf("          *****\n");}
      if(a[i]==5){  
        printf("          ******\n");}
}

	return 0;
}
