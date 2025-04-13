#include<iostream>
#include<string>
using namespace std;
string freq2nd(string s){
    int n = s.length();
    string str="";
    int hash[256]={0};
    for(int i =0;i<n;i++){
        hash[s[i]]++;
    }
    while(str.length()<s.length()){
        int max=0;
        int maxIdx=0;
        for(int i =0;i<256;i++){
            if(max<hash[i]){
                max=hash[i];
                maxIdx=i;
            }
        }
        for(int i =0;i<max;i++){
            str += ((char)(maxIdx));
        }
        hash[maxIdx]=0;
    }
    return str;
}
int max(int a, int b){
    return (a>b)? a:b;
}
string freqMyapproach(string s) {
    int n = s.length();
    string str="";
    int hash[256]={0};
    for(int i =0;i<n;i++){
        hash[s[i]]++;
    }
    int m=0;
    for(int i =0;i<256;i++){
        m= max(m,hash[i]);
    }
    while(m>0){
          for(int i =0;i<256;i++){
            if(hash[i] == m){
               str += string(m,char(i));
            }
        }
        m--;
    }
    return str;
}
int main(){
    string str="tree";
    cout<<freq2nd(str)<<endl;
    cout<<freqMyapproach(str);
    return 0;
}
