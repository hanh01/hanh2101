#include <stdio.h>
#include <math.h>
int main(){
     float a,b,c;
     scanf("%f",&a);
	 scanf("%f",&b);
	 scanf("%f",&c);
	 printf("ngiem cua phuong trinh ax^2+bx+c=0\n");
	  
	  float  Denta =(float)b*b- (float)4*a*c;
	 if(Denta<0){
	 	printf("phuong trinh vo nghiem\n");
	 	
	 }if(Denta=0){
	 	float x=-b/(2*a);
	 	printf("phuong trinh co mot nghiem duy nhat x=%f",x);
	 	
	 }else{
	 	float x1=(-b+(float)sqrt(Denta)) /(2*a);
	 	float x2=(-b-(float)sqrt(Denta)) /(2*a);
	 	printf("phuong trinh co hai nghiem phan biet\n x1=%f\n x2=%f",x1,x2);
		 }
	 
	 
	 
	 			
	return 0;
}
