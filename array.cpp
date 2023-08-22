// Online C++ compiler to run C++ program online
#include <iostream>
#include<limits.h>
using namespace std;

int maxnum(int arr[],int size){
    int maxi=INT_MIN;
    for(int i=0;i<size;i++){
        if(arr[i]>=INT_MIN){
            maxi=arr[i];
        }
    }
    cout<<"maximum number in an array is "<<maxi<<endl;
}
int minnum(int arr[],int size){
    int mini=INT_MAX;
    for(int i=0;i<size;i++){
        if(arr[i]<mini){
            
            mini=arr[i];
        }
    }
    cout<<"minimum number in an array is "<<mini<<endl;
}



int main() {
    int arr[10]={15,42,48,53,52,9,8,58,68,100};
    int size=10;
   maxnum(arr,size);
   minnum(arr,size);
    return 0;
}