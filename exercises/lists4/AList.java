/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private size=o;
    private fanxin[] A;
    public AList() {
        fanxin[] A=(fanxin []) new object [100];
        size=0;
        
    }
    public void resize(int capacity){
        fanxin[] a=(fanxin[]) new object [capacity];
        System.arraycopy(A, 0, a, 0, size);
        A=a;
    }
        
    /** Inserts X into the back of the list. */
    public void addLast(fanxin x) {
        if(size=A.length){
            resize();
        }      
        A[size]=x;
        size=size+1;
            
        
    }

    /** Returns the item from the back of the list. */
    public fanxin getLast() {
        return A[size-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public fanxin get(int i) {
        return A[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public fanxin removeLast() {
        int x=getLast();
        A.size-=1;
        return x;
        
    }
} 
