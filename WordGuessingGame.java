
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    private String hiddenWord, guessedWord;
    private int numberOfTries;
    
    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
    }
    
    public String getHiddenWord()
    {
        return hiddenWord;
    }
    
    public String getGuessedWord()
    {
        return guessedWord;
    }
    
    public int getNumberOfTries()
    {
        return numberOfTries;
    }
    
    public void showGuessedWord()
    {
        System.out.println(guessedWord);
    }
}
