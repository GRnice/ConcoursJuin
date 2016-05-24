#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <array>
#include <string>
#include <vector>

using namespace std;

//SMARTSTACK


int getNumber(string ordre)
{
	string s = ordre.substr(5);
	int d = std::stoi(s);
	return d;
}

int main()
{
	std::string input_line;
	std::vector<std::string> vect;
	// echo PUSHBACK\nkl| TER.exe
	while (cin)
	{
		getline(cin, input_line);
		vect.push_back(input_line);
		//cout << input_line.size() << endl;
		//cout << input_line << endl;
	}
	for (int i = 0; i < vect.size(); i++)
	{
		cout << vect.at(i) << endl;
	}

	int* stack = (int*)malloc(sizeof(int) * 16);
	int size = 16;
	int top = 0;
	int base = 0;
	array<string, 4> myarray;
	myarray[0] = string("PUSH 5");
	myarray[1] = string("PUSH 7");
	myarray[2] = string("BASEPOP");
	myarray[3] = string("BASEPOP");

	for (int i = 0; i < vect.size() ; i++)
	{
		if (vect.at(i).at(1) == 'U' && top < 16) // pUsh
		{
			stack[top] = getNumber(myarray[i]);
			top++;
		}
		else if (vect.at(i).at(1) == 'O' && top > base) // pOp
		{
			top--;
			cout << stack[top] << endl;
		}
		else if(base < top) // BASEPOP
		{
			cout << stack[base] << endl;
			base++;
		}
		else
		{
			// PRINTSTACK

		}
	}

	getchar();

}
