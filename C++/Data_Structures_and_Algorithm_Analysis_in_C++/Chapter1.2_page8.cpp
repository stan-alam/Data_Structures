#include <iostream>

using namespace std;


	int f( int x)
	{
		if ( x == 0)
			return 0;
		else
			cout << " This is the result " + 2 * f(x - 1) + x * x << endl;

	}

int main() {

f(1);


return 0;


}