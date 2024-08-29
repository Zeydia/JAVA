/*
	L'exercice consiste a mettre un place une fonction permettant 
	de claculer l'age du personne a partir de sa date de naissance

	Fonctions:
		- calculage()
		- main() 
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Exo
{

	public static String calculAge(String mybirth)
	{
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birth = LocalDate.parse(mybirth, fmt);

		LocalDate today = LocalDate.now();

		int years = birth.until(today).getYears();
		int months = birth.until(today).getMonths();
		int days = birth.until(today).getDays();


		return "Tu as "+years+ " ans "+months+" mois et "+days+" jours.";
	}


	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Ce programme permet de calculer ton age exact.\n Veuiller Entrer votre Date de naissance.");

		System.out.print("Jour: ");
		String jour = sc.nextLine();

		System.out.print("Mois: ");
		String mois = sc.nextLine();

		System.out.print("Annee: ");
		String annee = sc.nextLine();

		String birth = jour+"/"+mois+"/"+annee;

		System.out.println(
			calculAge(birth)
		);
	}
}