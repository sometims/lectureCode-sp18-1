/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    public AList() {
        int[] A=int [100];
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        A[A.length]=x;
        A.length+=1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return A[A.length-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return A[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return A.length;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int x=getLast();
        A.length-=1;
        return x;
        
    }
} 
