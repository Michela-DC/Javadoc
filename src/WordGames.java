//Create a class called WordGames that has two methods:
//    addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
//    getFullName method that takes two parameters as input called name and surname and returns their concatenation
//create a class called Tester that has the main method where you:
//    create a new WordGames object
//    print in console the result of the addHelloWord method invocation
//    print in console the result of the getFullName method invocation
//add Javadoc comments to:
//    the 2 classes with a short description and the author
//    the 3 methods with a short description, the parameters and the return

/**
 * Class WordGames containing two methods:
 * one method to print a greeting sentence
 * the other to print the name and surname of the word game creator
 *
 * @author Michela Del Conte
 */
public class WordGames {
    /**
     * method that takes one parameter as input called word and returns the String Hello [wordHere]
     *
     * @param word input parameter to be added to "Hello" to greet the user, type String
     * @return a string consisting of "Hello" and the input parameter word
     */
    public String addHelloWord(String word) {
        return String.format("Hello %s", word);
    }

    /**
     * method that takes two parameters as input called name and surname and returns their concatenation
     *
     * @param name the name of the game author, type String
     * @param surname the surname of the game author, type String
     * @return the concatenation of the name and the surname of the author
     */

    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}
