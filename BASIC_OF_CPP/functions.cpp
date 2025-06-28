//
// Created by manoj on 12/15/2024.
//

//functions
#include<iostream>
//as Cpp goes line by line function before using should be defined at top of the source code.
//Function can be defined as a set of code which is used to perform a specific task
//Functions increases modularity,readability,reusability
using namespace std;
void printName(string);  //can define prototype is available is bottom somewhere else in the code
int sum(int num1,int num2);
//on a function call control flow goes to function definition
// int sum(int num1,int num2) {
//     return num1+num2;
// }
void printName(string name){
  cout<<name<<endl;
}
    //math function min,max
    // int res=min(num1,num2);
    // printName("Striver\n");
    // cout<<sum(2,3)<<endl;
    // int num1,num2;
    // cin>>num1>>num2;

//pass by value
//when value passed to the function
//number original will not be passsed into function
//copy of number will be passed into the function
void doSomething(int num) {
    cout<<num<<endl;
    num+=5;
    cout<<num<<endl;
    num+=5;
    cout<<num<<endl;
}
//pass by value
void mutateString(string str) {
    str[str.length()-1]='j';
}
//pass by reference
void changeVal(string &str) {
    str[str.length()-1]='j';
}

//array will be passed into functions directly pass by reference
//so should be carefully while passing arrays into functions
int arrMod(int arr[],int n) {
    arr[0]+=100;
    cout<<"Value inside function:  "<<arr[0]<<endl;
}
int main(){
    int num=10;
    // doSomething(num);
    // cout<<num<<endl;


    //only copy passed
    // string str="shahad";
    // mutateString(str);


    //original value will not change
    // printName(str);


    //pass by reference
    // changeVal(str);
    // printName(str);

    int n;
    cout<<"Enter n value: "<<endl;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin>>arr[i];
    }
    arrMod(arr,n);
    cout<<"Value outside function:  "<<arr[0]<<endl;
    return 0;
}
