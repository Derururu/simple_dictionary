package simple_dictionary;

public class Word {
	private String word;
	private String translation ;
	public Word(String pWord, String pTranslation)
	{
		this.word=pWord;
		this.translation=pTranslation;
	}
	public String getWord() {
		return word;
	}
	public String getTranslation() {
		return translation;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}

}
