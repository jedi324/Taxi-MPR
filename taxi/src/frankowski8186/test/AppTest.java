package frankowski8186.test;

import java.util.ArrayList;
import java.util.List;

import frankowski8186.Firmy;
import frankowski8186.Miasto;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest
    extends TestCase
{
	private Miasto testowe = new Miasto("Testowe");

    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
    
    public void test1dodajFirme() {
		assertNotNull(testowe);
		assertEquals(testowe.getNazwa(),"Testowe");

		testowe.dodajFirme("FirmaTest", "ul. testowa 1");
		assertNotNull(testowe.gettaxi(0));
		}
   
    public void test2WyswietlFirmy(){	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1");
		for( Firmy f : testowe.getKorporacje()) assertNotNull(f);

		}
    public void test3szukaFirmy(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1");
    	assertNotNull(testowe.gettaxi(0));
    	assertSame(testowe.gettaxi(0),testowe.szukaj("FirmaTest")); 
    }
    public void test4usunPoz(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1");
    	assertNotNull(testowe.gettaxi(0));
    	testowe.usunPoz(0);
    	assertNull(testowe.szukaj("FirmaTest"));
    }
    public void test5edytuj(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1");
    	testowe.edytuj(testowe.gettaxi(0).getNazwaF(), "Firma");
    	assertTrue(testowe.gettaxi(0).getNazwaF()=="Firma");
    }
    
   
}