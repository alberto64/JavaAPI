import static org.junit.Assert.*;

import org.junit.Test;

public class CesarMethodTest {

	@Test
	public void testEncode() {
		assertFalse("Remember to add the key",CesarMethod.encodingtext("123456789", 5).equals("123456789"));
		assertTrue("The encode equation is incorrect. Failed with word: 123456789 and key 5.",CesarMethod.encodingtext("123456789", 5).equals("6789:;<=>"));
		assertTrue("The encode equation is incorrect. Failed with word: icom4015 and key 5.",CesarMethod.encodingtext("icom4015", 5).equals("nhtr956:"));
		assertTrue("The encode equation is incorrect. Failed with word: eclipse and key 10.",CesarMethod.encodingtext("eclipse", 10).equals("omvsz}o"));
		assertTrue("The encode equation is incorrect. Failed with word: Bienve and key 7.",CesarMethod.encodingtext("Bienve", 7).equals("Iplu}l"));
		assertTrue("The encode equation is incorrect. Failed with word: AMADEUS and key 12.",CesarMethod.encodingtext("AMADEUS", 12).equals("MYMPQa_"));
		assertTrue("The encode equation is incorrect. Failed with word: !@#$%^&*() and key 5.",CesarMethod.encodingtext("!@#$%^&*()", 5).equals("&E()*c+/-."));
	}
	@Test
	public void testDecode() {
		assertFalse("Remember to add the key",CesarMethod.encodingtext("123456789", 5).equals("123456789"));
		assertTrue("The decode equation is incorrect. Failed with word: 6789:;<=> and key 5.",CesarMethod.decodingtext("6789:;<=>", 5).equals("123456789"));
		assertTrue("The decode equation is incorrect. Failed with word: nhtr956 and key 5.",CesarMethod.decodingtext("nhtr956:", 5).equals("icom4015"));
		assertTrue("The decode equation is incorrect. Failed with word: omvsz}o and key 10.",CesarMethod.decodingtext("omvsz}o", 10).equals("eclipse"));
		assertTrue("The decode equation is incorrect. Failed with word: Iplu}l and key 7.",CesarMethod.decodingtext("Iplu}l", 7).equals("Bienve"));
		assertTrue("The decode equation is incorrect. Failed with word: MYMPQa_ and key 12.",CesarMethod.decodingtext("MYMPQa_", 12).equals("AMADEUS"));
		assertTrue("The decode equation is incorrect. Failed with word: &E()*c+/-. and key 5.",CesarMethod.decodingtext("&E()*c+/-.", 5).equals("!@#$%^&*()"));
	}
}