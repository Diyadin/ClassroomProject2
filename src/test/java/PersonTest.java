import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	@Test
	public void testConstructor() {
Person P = new Person("Diyadin", "Seker", 27, 'm');
	P.setLastName("Seker");
	P.setFirstName("Ihsan");
	P.setAge(7);
	assertEquals(P.getFirstName().equals("Ihsan"),true);
	assertTrue(P.getFirstName().equals("Ihsan"));
	assertTrue(P.getFirstName() == "Ihsan");
	assertTrue(P.getLastName() == "Seker");
	assertTrue(P.getAge() == 7);
	}
	@Test
	public void testageConstructor() {
	Person P = new Person("Diyadin", "Seker", 27, 'm');
	P.getGender();
	P.setGender('F');
	P.setLastName("Seker");
	P.setFirstName("Ihsan");
	P.setAge(7);
	assertEquals(P.getAge(), 7);
	assertTrue(P.getAge() == 7);
	assertEquals(P.getAge(), 7);
	assertEquals(P.getGender(), 'F');
	}

}
