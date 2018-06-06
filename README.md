# refactoring-improving-the-design-of-existing-code


----------




----------
## Chapter01 ##


测试代码
```java
package chapter0101;

import org.testng.annotations.Test;

public class CustomerTest {

	@Test
	public void statement() {
		Customer customer = new Customer("John");
		String title = "Titanic";
		int priceCode = 2;
		int _daysRented = 7;
		Movie movie = new Movie(title, priceCode);
		Rental rental = new Rental(movie, _daysRented);
		customer.addRental(rental);
		String result = customer.statement();
		System.out.println(result);
	}
}
```

测试结果：
```sql
[RemoteTestNG] detected TestNG version 6.12.0
Rental Record for John
	Titanic	7.5
Amount owed is 7.5
You earned 1 frequent renter points
PASSED: statement

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================
```

