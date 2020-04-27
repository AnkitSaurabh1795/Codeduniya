package model.splitwise.expense;

import java.util.Date;

import model.splitwise.User;

public class ExactAmountExpense extends Expense {
	public ExactAmountExpense(String name, Date date, User addedBy, User paidBy, String catagory, double totalAmount,List<Split> splits;) {
		super(name, date, addedBy, paidBy, catagory, totalAmount, splits);
	}
	@Override
  	// TODO Auto-generated method stub
	void updateBalance() {
  		for(Split s:splits) {
			totalAmount += s.getAmount();
		} 
	}
}
