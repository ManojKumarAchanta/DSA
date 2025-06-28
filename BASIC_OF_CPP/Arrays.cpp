//
// Created by manoj on 12/15/2024.
//
#include<iostream>
using namespace std;
int main(){
   cout<<"Enter the size of array: ";
   int n;
   cin>>n;
     int array[n];
     for(int i=0;i<n;i++){
       cin>>array[i];
     }
     for(int i=0;i<n;i++){
       cout<<array[i]<<" ";
     }
     for(int i=0;i<n;i++) {
         cin>>*(array+i);
     }
     for(int i=0;i<n;i++) {
         cout<<*(array+i)<<" ";
     }
    2D Arrays
     int arr[3][5];
     arr[1][3]=78;
     cout<<arr[1][3];
     for(int i=0;i<3;i++) {
         for(int j=0;j<5;j++) {
             cout<<arr[i][j]<<" ";
         }
         cout <<endl;
     }

    string name="Striver";
    cout <<name[name.size()-1];
    name[name.size()-1]='f';
    cout<<"Length of String is :"<<name;
}