#include<iostream>
using namespace std;
void reverse(int arr[],int n){
    int first = 0;
    int end = n-1;
    while(first<end){
        swap(arr[first],arr[end]);
        first++;
        end--;
    }
    
    
}
void print_arr(int arr[],int n){
    for(int i =0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
int main(){
    int array[6]={5,32,54,76,23,12};
    print_arr(array,6);
    cout<<endl;
   
    reverse(array,6);
    print_arr(array,6);

}