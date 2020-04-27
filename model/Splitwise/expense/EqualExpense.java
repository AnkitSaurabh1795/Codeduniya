package model.splitwise.expense;

import java.util.Date;
import java.util.List;

import model.splitwise.expense;
import model.splitwise.split.Split;

public class EqualExpense extends Expense {

	public EqualExpense(String name, Date date, User addedBy, User paidBy, String catagory, double totalAmount) {
		super(name, date, addedBy, paidBy, catagory, totalAmount);
	}
	
	boolean validate() {
		super.validate();
		return false;
	}

	@Override
	void updateBalance() {
		
		List<Split> splits = getSplits();
		int size = splits.size();
		for(Split s : splits) {
			s.setAmount(getTotalAmount()/size);
		}
	}
