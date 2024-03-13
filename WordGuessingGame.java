
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
    private InputReader reader;

    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        reader = new InputReader();
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

    private void showGuessedWord()
    {
        System.out.println("Palavra adivinhada: " + guessedWord);
    }

    private void showWelcome()
    {
        System.out.println("Bem vindo ao jogo da forca!");
    }

    private boolean guess(char guessedLetter)
    {
        boolean guessed = false;
        char[] guessedWord = this.guessedWord.toCharArray();

        for(int i = 0; i < hiddenWord.length(); i++)
        {
            if(guessedLetter == hiddenWord.toCharArray()[i])
            {
                guessedWord[i] = guessedLetter;
                guessed = true;
            }
        }

        numberOfTries++;
        this.guessedWord = String.valueOf(guessedWord);
        return guessed;
    }

    private void showResult()
    {
        if(guessedWord.equals(hiddenWord))
        {
            System.out.println("Número de tentativas : " + numberOfTries);
        }
    }

    public void play()
    {
        showWelcome();
        do
        {
            guess(reader.getChar("Diga uma letra: "));
            showGuessedWord();
        }
        while(!guessedWord.equals(hiddenWord));
        showResult();
    }
}
