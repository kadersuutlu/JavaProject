package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu="�nternet �ubeye gir";
		double dolarDun=8.15;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);

		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else { //s�n�r analizi
			System.out.println("Dolar e�ittir resmi");
		}
		
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="�ift�i Kredisi";
		String kredi5="MSB Kredisi";
		String kredi6="MEB Kredisi";
		String kredi7="K�lt�r Bakanl��� Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler= 
			{
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"K�lt�r Bakanl��� Kredisi"
			};
		
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		//�MPORTANT!!!!
		
		//value type: de�er tipler
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);//20
		
		//referance types: referans tipler
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;//sayilar1'in adresi=sayilar2'nin adresi
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);//100
		
		//istisna: stringler array olsa da de�er tip olarak �al���r.
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);//�stanbul
	}

}
