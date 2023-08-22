#include <iostream>
#include<limits.h>
using namespace std;
int count0(int arr[],int size){
    int count=0;
    for(int i=0;i<size;i++){
        if(arr[i]==0){
            count++;
        }
        
    }
    return count;
}
int count1(int arr[],int size){
    int count=0;
    for(int i=0;i<size;i++){
        if(arr[i]==1){
            count++;
        }
        
    }
    return count;
}




int main() {
    int arr[10]={0,0,0,0,0,1,1,1,0,1,};
    int size=10;
    int a= count0(arr,size);
    int b= count1(arr,size);
    cout<<a<<endl<<b;
    return 0;
}