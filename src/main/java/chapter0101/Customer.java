package chapter0101;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name; // 姓名
	private Vector _rentals = new Vector(); // 租借记

	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = 0; // 总消费金。
		int frequentRenterPoints = 0; // 常客积点
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
			// determine amounts for each line
			switch (each.getMovie().getPriceCode()) { // 取得影片出租价格
			case Movie.REGULAR: // 普通片
				thisAmount += 2;
				if (each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE: // 新片
				thisAmount += each.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS: // 儿童。
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;
			}
			// add frequent renter points （累计常客积点。
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
					&& each.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental（显示此笔租借记录）
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// add footer lines（结尾打印）
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}
}
