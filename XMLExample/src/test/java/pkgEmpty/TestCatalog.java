package pkgEmpty;

import static org.junit.Assert.*;
import pkgLibrary.Catalog;
import pkgLibrary.Book;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCatalog {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void isAlreadyBook() {
		assertTrue("There is already a book with that ID", AddBook("bk101","","","",0.0,new Date(),"",0.0));
	}

}
