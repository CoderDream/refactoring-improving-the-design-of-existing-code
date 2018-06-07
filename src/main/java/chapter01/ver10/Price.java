package chapter01.ver10;

public abstract class Price {
	abstract int getPriceCode(); // 取得价格代号

	abstract double getCharge(int daysRented);
}
