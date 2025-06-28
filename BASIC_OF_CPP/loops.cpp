//
// Created by manoj on 12/15/2024.
//

#include<iostream>
using namespace std;

int main(){
    cout<<"Striver"<<endl;
    for(int i=0;i<25;i+=5){
      cout<<"Printed for "<<i<<endl;
    }
    int i;
    while (i<=25) {
        cout<<i<<endl;
        i+=5;
    }

    //do while
    int i;
    do {
        cout<<i<<endl;
        i++;
    }while(i<=25);
    return 0;
}