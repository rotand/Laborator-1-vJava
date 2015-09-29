#include <iostream>
#include <conio.h>
#include <iomanip>
#define MAXINT 2147483647 
using namespace std;
bool Prim(int number);
int Invers(int value);
bool InversPrim(int number);
int Interval(int Inceput, int Sfirshit);
int PrimeleNr(int Total);
int MinimPrimInvers(int Inceput, int Sfirshit);
int MaximPrimInvers(int Inceput, int Sfirshit);
int main (){
	int key;
	int numar, rez;
	int Inceput1, Sfirshit1;
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
				if(InversPrim(numar))
					cout << " \t\n Numarul Inversat este Prim\n\n\n";
				else
					cout << " \t\n Numarul Inversat NU este Prim\n\n\n";

				break;
			case 2:
				cout << "\nDati inceputul intervalului: \t";
				cin >> Inceput1;
				cout << "\nDati Sfirsitul intervalului: \t";
				cin >> Sfirshit1;
				cout << "\n In total " << Interval(Inceput1, Sfirshit1) << " numere\n";
					
				_getch();
				break;
			case 3:
				int Total1;
				cout << "\n Dati nr numereler afisate: \t";
				cin >> Total1;
				cout << "\n In total " << PrimeleNr(Total1) << " numere\n";
				_getch();
				break;
			case 4:
				cout << "\nDati inceputul intervalului: \t";
				cin >> Inceput1;
				cout << "\nDati Sfirsitul intervalului: \t";
				cin >> Sfirshit1;
				rez = MinimPrimInvers(Inceput1, Sfirshit1);
				if(rez>0) 
				{
					cout << "\n Cel mai mic numar prim invers este " << rez;
					cout << "\n Cel mai mare numar prim invers este " << MaximPrimInvers(Inceput1, Sfirshit1) << ".\n";
				}
				else cout << "\n Mu-i numar prim invers pe acest interval"; 
				_getch();
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
		
	return 1;
}
bool Prim(int number){
	for(int i = 2; i <= number/2; i++)
		if(number % i == 0)
			return false;
	return true;

}
int Invers(int value){
	int result = 0;
	while(value > 0){
		result = result * 10 + value % 10;
		value /= 10;
	}
	
	return result;

}
bool InversPrim(int number)
{
	if(Prim(number))
		if(Prim(Invers(number))) return true;
		else return false;
	else return false;
}
int Interval(int Inceput, int Sfirshit){
	int numar, contor;
	for(numar = Inceput,contor = 0; numar <= Sfirshit; numar++)
	{
		if (InversPrim(numar))
		{
			cout << setw(8) << numar;
			contor ++;
		}
	}
	return contor;
}
int PrimeleNr(int Total)
{
	int numar, contor;
	for(numar = 2, contor = 0; contor < Total; numar++)
	{
		if (InversPrim(numar))
		{
			cout << setw(8) << numar;
			contor ++;
		}
		if(numar == MAXINT) break;
	}
	return contor;
}
int MinimPrimInvers(int Inceput, int Sfirshit)
{
	bool gasit = false;
	int numar = Inceput; 
	while((numar <= Sfirshit) && (!gasit))
		if (InversPrim(numar)) gasit = true;
		else numar++;
	return (gasit)?numar:0;
}
int MaximPrimInvers(int Inceput, int Sfirshit)
{
	bool gasit = false;
	int numar = Sfirshit; 
	while((numar >= Inceput) && (!gasit))
		if (InversPrim(numar)) gasit = true;
		else numar--;
	return (gasit)?numar:0;
}


