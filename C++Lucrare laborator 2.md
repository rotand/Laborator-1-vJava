#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <iomanip>
#define NMAX 100

using namespace std;

void Afisare(int n, int a[], char sir[]);
int Cititre(int a[]);
int Minimum(int n, int a[]);
int Maximum(int n, int a[]);
void Aranjare(int n, int a[]);
int Generare(int a[]);//puctul 4
int Statistica(int n, int a[], int &suma, int &prod, int &min, int &max);//Suma, Produsul


int main()
{	
	int key;
	int dim = 10;
	int tabel[NMAX] = {3, 5, 7, 11, 13, 12, 20, -10, 55, 66 };
 do	{
		
		cout << "\n1: De determinat elementul minim si maxim";
		cout << "\n2: De aranjat in ordine crescatoare sau descrescatoare";
		cout << "\n3: De rotit la dreapta cu 8 pozitii";
		cout << "\n4: De completat un tabel cu numere 1,2,3,4,5,1,2,3,4,5 ";
		cout << "\n5: Statistica numerelor PrimInverse Numarul, Produsul, Suma";//
		cout << "\n0: exit";
		cout << "\nAlegeti de la 0 -> 5 \n\t\t\t";
		cin >> key;
			switch(key)
			{
			case 1:
				dim = Cititre(tabel);
				Afisare(dim, tabel, "initial");
				cout << "\nCel mai mare numar este: " << Maximum(dim, tabel);
				cout << "\nCel mai mic numar este: " << Minimum(dim, tabel);
				_getch();
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
}

void Afisare(int n, int a[], char sir[])
{
	cout << "Tabelul " << sir << endl;
	for(int i = 0; i < n; i++ )
	cout << setw(8) << a[i]; 
	cout << endl;	
}
int Cititre(int a[])
{	int n;
	cout << "Dati dimensiunea:";
	cin >> n;
	cout << "Dati elementele" << endl;
	for(int i = 0; i < n ; i++)
		cin >> a[i];
return 1;
}
int Minimum(int n, int a[])
{
	int min = a[0];
	for(int i = 1; i < n; i++)
		if(a[i] < min)
			min = a[i];
return min;
}
int Maximum(int n, int a[])
{
	int max = a[0];
	for(int i = 1; i < n; i++)
		if(a[i] > max)
			max = a[i];
return max;
}
void Aranjare(int n, int a[])
{
}
int Generare(int a[])
{
return 1;
}//puctul 4
int Statistica(int n, int a[], int &suma, int &prod, int &min, int &max){
return 1;
}//Suma, Produsul
