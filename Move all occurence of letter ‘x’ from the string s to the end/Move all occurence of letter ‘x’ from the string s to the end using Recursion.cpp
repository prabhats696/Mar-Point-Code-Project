// CPP implementation to Move all occurence of letter ‘x’ 
// from the string s to the end using Recursion 
#include <bits/stdc++.h> 
using namespace std; 
  
void moveAtEnd(string s, int i, int l) 
{ 
    if (i >= l) 
        return; 
  
    char curr = s[i]; 
  
    if (curr != 'x') 
        cout << curr; 
  
    moveAtEnd(s, i + 1, l); 
  
    if (curr == 'x') 
        cout << curr; 
  
    return; 
} 
  
// Driver code 
int main() 
{ 
	string s;
	cout<<"Enter the String  ";
	cin>>s;
   // string s = "geekxsforgexxeksxx"; 
  
    int l = s.length(); 
    cout<<"the output   ";
    moveAtEnd(s, 0, l); 
  
    return 0; 
} 
