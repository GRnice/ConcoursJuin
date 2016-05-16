#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <array>
#include <string>
// SMARTSTACK
using namespace std;

int getNumber(string ordre)
{
	string s = ordre.substr(5);
	int d = std::stoi(s);
	return d;
}

int main()
{
	int* stack = (int*)malloc(sizeof(int) * 16);
	int size = 16;
	int top = 0;
	int base = 0;
	array<string, 4> myarray;
	myarray[0] = string("PUSH 5");
	myarray[1] = string("PUSH 7");
	myarray[2] = string("BASEPOP");
	myarray[3] = string("BASEPOP");

	for (int i = 0; i < 4; i++)
	{
		if (myarray[i].at(1) == 'U' && top < 16) // pUsh
		{
			stack[top] = getNumber(myarray[i]);
			top++;
		}
		else if (myarray[i].at(1) == 'O' && top > base) // pOp
		{
			top--;
			cout << stack[top] << endl;
		}
		else if(base < top)
		{
			cout << stack[base] << endl;
			base++;
		}
	}

	getchar();

}
