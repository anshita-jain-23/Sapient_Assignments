package bankImpl;

public class MyAccount {

	public static void main(String[] args) {
		SavingsAcc s=new SavingsAcc();
		FDAcc f=new FDAcc();
		HousingLoanAcc h=new HousingLoanAcc();
		PersonalLoanAcc p=new PersonalLoanAcc();
		s.createAcc();
		f.calcInt();
		h.calcInt();
		p.calcInt();
	}

}
