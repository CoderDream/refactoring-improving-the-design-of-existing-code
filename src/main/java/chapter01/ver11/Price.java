package chapter01.ver11;

public abstract class Price {
	abstract int getPriceCode(); // 取得价格代号

	abstract double getCharge(int daysRented);

//	public int getFrequentRenterPoints(int daysRented) {
//		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
//			return 2;
//		else
//			return 1;
//	}
	
	public int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
