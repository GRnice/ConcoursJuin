#include <iostream>
#include <vector>
#include <sstream>
#include <string>
using namespace std;
using std::stringstream;


int permutation(vector<int> liste, vector<int> permut){
	int i=0;
	while(i < liste.size()){
		if(  ((i+1) != permut[liste.at(i)-1]) || (permut.at(i) != liste.at(i)) ) {
			return 0;
		}
		i++;
	}
	return 1;
}

int main( int argc, const char* argv[] )
{
	string input_line;
	string input_line2;
	vector<int> liste;
	vector<int> permut;

	getline(cin, input_line);
	getline(cin, input_line2);

    stringstream stream(input_line);
    stringstream stream2(input_line2);
    int n;

    while(stream>>n){
        liste.push_back(n);
    }

    while(stream2>>n){
        permut.push_back(n);
    }


    if(permutation(liste,permut)){
    	cout << "TRUE" << endl;
    }
    else{
    	 cout << "FALSE" << endl;
    }

}