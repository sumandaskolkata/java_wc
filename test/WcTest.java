import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WcTest {
	@Test 
	public void wc_charCount_should_give_number_of_character_in_given_data(){
		String data ="Similar to the classic dynamic loading behavior, when executing Java programs, the Java Virtual"; 

		Wc a= new Wc(data);

		assertEquals(a.charCount(),96);
	}

	@Test 
	public void wc_wordCount_should_give_number_of_word_in_given_data(){
		String data ="Similar to the classic dynamic loading behavior, when executing Java programs, the Java Virtual"; 

		Wc a= new Wc(data);

		assertEquals(a.wordCount(),14);
	}

	@Test 
	public void wc_lineCount_should_give_number_of_line_in_given_data(){
		String data ="Similar to the classic dynamic loading behavior, when executing Java programs, the Java Virtual"; 

		Wc a= new Wc(data);

		assertEquals(a.lineCount(),1);
	}	
}