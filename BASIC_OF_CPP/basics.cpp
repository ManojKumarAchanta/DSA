// instead of including all libraries individually write
#include <iostream>
using namespace std;
int main()
{
     cout <<"Hey Striver!" << endl<< "Hey Manoj" << endl;
     cout <<"Hey Striver!\n";

     int x,y;
     cin >> x >> y;
     cout << "value of x: " << x << " and y: "<<y;
     // data types

     // int
     // long
     // long long
     //
     // float,double

     float x=5.6;
     double y=5;
     cout<<"Value of y: "<<y;

     // String and getline

     string x;
     cin >> x;
     cout <<"The String is "<<x;

     string firstName,lastName;
     cin>>firstName>>lastName;
     cout<<"Hey"<<firstName<<" "<<lastName<<" "<<"How are You?";

     // Input Entire String at Once

     string str;
     getline(cin,str);
     cout<<"Hey Striver! I'm "<<str;

     // characters char

     char ch;
     cin>>ch;
     cout<<ch;

     // Write a program that takes an input of age and prints if you are adult or not

     int age;
     cin >> age;
     if (age >= 18) {
         cout << "You are an Adult";
     }
     else {
         cout << "Your'e not an Adult";
     }
    else if
     int age;
     cout << "Enter your age: ";
     cin >> age;
     if (age< 18)
         cout <<"Not Eligible for job";
     else if (age<=54) {
         cout <<"Eligible for job";
     }else if (age<=57) {
         cout <<"Eligible for job but retirement soon";
     }else {
         cout <<"retirement time";
     }

//Nested if
    int age;
    cout << "Enter your age: ";
    cin >> age;
    if (age< 18)
        cout <<"Not Eligible for job";
    else if (age<=57) {
        cout <<"Eligible for job";
        if (age>=55) {
            cout <<"but retirement soon";
        }
    }else {
        cout <<"retirement time";
    }
    return 0;
}