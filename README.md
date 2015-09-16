# Laborator-1-vJava
Laborator nr 1  varianta Prim - Invers versiune Java
a
#include<iostream>
#include<conio.h>

using namespace std;

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
				cout << "Dati un numar intreg:\t";
				cin >> numar;
				if(PrimInvers(numar))
					cout << " /n Numarul este PrimInvers"
				else
					cout << " /n Numarul NU este PrimInvers"
				break;
			case 2:
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
