package simple_dictionary;

import java.util.ArrayList;


public class SimpleDictionary {
	private ArrayList<Word> dictionary ; 
	
public SimpleDictionary() {
	dictionary=new ArrayList<Word>();
}

public void addWord(String pWord,String pTranslation) {
	if(!pWord.equals("")&&!pTranslation.equals("")) {
		dictionary.add(new Word(pWord,pTranslation));
	}
	
	
} 

public String translate(String pWord) {
	for(Word w : dictionary) {
		if(w.getWord().equalsIgnoreCase(pWord)) {
			return w.getTranslation();
		}
	}
	return "";
	
	
}
}