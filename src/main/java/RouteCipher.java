
public class RouteCipher
{
/** A two-dimensional array of single-character strings, instantiated in the constructor */
private String[][] letterBlock;
/** The number of rows of letterBlock, set by the constructor */
private int numRows;
/** The number of columns of letterBlock, set by the constructor */
private int numCols;
/** Places a string into letterBlock in row-major order.
* @param str the string to be processed
* Postcondition:
* if str.length() < numRows * numCols, "A" is placed in each unfilled cell
* if str.length() > numRows * numCols, trailing characters are ignored
*/
public void fillBlock(String str)
{ /* to be implemented in part (a) */ }
/** Extracts encrypted string from letterBlock in column-major order.
* Precondition: letterBlock has been filled
* @return the encrypted string from letterBlock
*/
 private String encryptBlock()
    { 
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for (int i = 0; i < numCols; i++){
            for (int a = 0; a < numRows; a++){
                builder.append(letterBlock[a][i]);
            }

        }
        return builder.toString();
    }
/** Encrypts a message.
* @param message the string to be encrypted
* @return the encrypted message;
* if message is the empty string, returns the empty string
*/
public String encryptMessage(String message)
{ /* to be implemented in part (b) */ }
// There may be instance variables, constructors, and methods that are not shown.
}
