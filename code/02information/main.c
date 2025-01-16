#include <limits.h>
#include <stdio.h>


int main(void){
    printf("%d\n" , LONG_MAX * LONG_MAX);
    long long  a = 200ll * 300ll * 400ll * 500ll;
    printf("%lld\n" , a);
    int b = 200 * 300 * 400 * 500; //-884901888 overflow but serious
    printf("%d\n" , b);
    float c =  200.0f* 300.0f* 400.0f * 500.0f; //f < INFINITY  都是准确的，但是approximately
    printf("%f\n" , c);
    printf("%lf\n" , (3.14f + 1e20) - 1e20); //0
    printf("%lf\n" , (3.14f + (1e20 - 1e20))); //3.14
    printf("%d\n" , 21474836 * 1231253245);
    return 0;
}
