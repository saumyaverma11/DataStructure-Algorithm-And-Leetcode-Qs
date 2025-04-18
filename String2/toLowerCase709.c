#include<stdio.h>
#include<string.h>
char* convert( char *s);
int main(){
    char arr[100];
    fgets(arr,sizeof(arr),stdin);
    convert(arr);
    printf("%s",arr);
}
char* convert(char *s){
    int n = strlen(s);
    for(int i =0;i<n;i++){
        if(s[i]>='A' && s[i]<='Z' ){
            s[i]= s[i]+32;
        }
        else{
            s[i]=s[i];
        }
    }
    return s;
}