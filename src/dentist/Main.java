package dentist;

import dentist.Procedure.TypeOfOperation;

public class Main {

	public static void main(String[] args) {
		PatientInformation pi1 = new PatientInformation("Кацюк Дмитрий Геннадьевич", 1234);
		Procedure denta1 = new Procedure(TypeOfOperation.DENTALFILLING);
		pi1.setProcedure(denta1);
		pi1.payForProcedure();//Метод для оплаты операции.
		System.out.println(pi1);
		System.out.println("----------------------");
		PatientInformation pi2 = new PatientInformation("Барталев Павел Эдуардович", 1235);
		Procedure denta2 = new Procedure(TypeOfOperation.DENTALPROSTHETICS);
		pi2.setProcedure(denta2);
		System.out.println(pi2);
		
		
	}
}
