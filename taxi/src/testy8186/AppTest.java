package testy8186;

import java.util.ArrayList;
import java.util.List;

import testy8186.Firmy;
import testy8186.Miasto;
import testy8186.Typ_Taxi;

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

		testowe.dodajFirme("FirmaTest", "ul. testowa 1", Typ_Taxi.van);
		assertNotNull(testowe.pobFirme(0));
		}
   
    public void test2WyswietlFirmy(){	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", Typ_Taxi.van);
		for( Firmy f : testowe.gettaxi()) assertNotNull(f);

		}
    public void test3szukaFirmy(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", Typ_Taxi.van);
    	assertNotNull(testowe.pobFirme(0));
    	assertSame(testowe.pobFirme(0),testowe.szukaj("FirmaTest")); 
    }
    public void test4usunPoz(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", Typ_Taxi.van);
    	assertNotNull(testowe.pobFirme(0));
    	testowe.usunPoz(0);
    	assertNull(testowe.szukaj("FirmaTest"));
    }
    public void test5edytuj(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", Typ_Taxi.van);
    	testowe.edytuj(testowe.pobFirme(0).getNazwaF(), "Firma");
    	assertTrue(testowe.pobFirme(0).getNazwaF()=="Firma");
    }
    
   
}