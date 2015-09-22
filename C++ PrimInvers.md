#include<iostream>
#include<conio.h>
#include<iomanip>

using namespace std;

bool Prim(int number){
	for(int i = 2; i <= number/2; i++)
		if(number % i == 0)
			return false;
	return true;

}
int InversPrim(int value){
	int result = 0;
	while(value > 0){
		result = result * 10 + value % 10;
		value /= 10;
	}
	
	return result;

}
int Interval(int Inceput, int Sfirshit){
	int numar, contor;
	for(numar = Inceput,contor = 0; numar <= Sfirshit; numar++)
	{
		if (Prim(InversPrim(numar)))
		{
			cout << setw(8) << numar;
			contor ++;
		}
	}
	return contor;
}

int main (){
	int key;
	int numar;
	do
	{

		cout << "Proiect Nr 1 elaborat de: Andrei Rotari" << endl;
		cout << "1: De verificat daca numarul este PrimInvers" << endl;
		cout << "2: De indicat toate numerele PrimInvers dintr-un interval" << endl;
		cout << "3: De indicat primele n numere PrimInverse" << endl;
		cout << "4: De indicat cel mai mic si cel mai mare numar PrimInvers" << endl;
		cout << "5: De indicat toate numere PrimInversibile dintrun interval \n" << endl;
		cout << "0: Exit" << endl;
		cout << "\n\n\t Alegeti Numarul operatiei de la 0 -> 5: ";
		cin >> key;
		switch(key)
		{
			case 1:

				cout << "\n\nDati un numar intreg:\t";
				cin >> numar;
				if(Prim(InversPrim(numar)))
					cout << " \t\n Numarul Inversat este Prim\n\n\n";
				else
					cout << " \t\n Numarul Inversat NU este Prim\n\n\n";

				break;
			case 2:
				int Inceput1, Sfirshit1;
				cout << "\nDati inceputul intervalului: \t";
				cin >> Inceput1;
				cout << "\nDati Sfirsitul intervalului: \t";
				cin >> Sfirshit1;
				cout << "\n In total " << Interval(Inceput1, Sfirshit1) << " numere\n";
					
				_getch();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				break;
			default: 
				cout << "\n\n\t Nu ati introdus numarul corect MAI INCERCATI!\n\n";
				break;
		}
	} while(key);
		
	

	
	getch();
	return 1;
}
