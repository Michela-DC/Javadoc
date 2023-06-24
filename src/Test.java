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
* Class Test containing the main method to be run
 * The author of the
 *
 * @author Michela Del Conte
 */
public class Test {
    /**
     * In this main method a new WordGames object is created, a greeting sentence and the full name of the author are printed.
     *
     * @param args array of strings
     */
    public static void main(String[] args) {
        WordGames wordGame = new WordGames();

        System.out.println(wordGame.addHelloWord("world"));
        System.out.println(wordGame.getFullName("Giulio", "Cesare"));
    }
}