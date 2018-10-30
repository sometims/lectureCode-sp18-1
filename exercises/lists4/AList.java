/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private size=o;
    private int[] A;
    public AList() {
        int[] A=int [100];
        size=0;
        
    }
    public void resize(){
        int[] a=new int[size*2];
        System.arraycopy(A, 0, a, 0, size);
        A=a;
    }
        
    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size<A.length){
            A[size]=x;
            size+=1;
        }
        resize();
        A[size]=x;
        size=size+1;
            
        
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return A[size-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return A[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int x=getLast();
        A.size-=1;
        return x;
        
    }
} 
