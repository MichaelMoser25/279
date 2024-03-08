
// The Comparable Interface

public interface Comparable<T>{
    public int compareTo(Object other);
}

• The method compareTo must return:
◦ A negative number if the calling object "comes before" the parameter other
◦ A zero if the calling object "equals" the parameter other
◦ A positive number if the calling object "comes after" the parameter other

public final class Double extends Number implements Comparable<Double>

Double d1 = 3.0;
Double d2 = 5.0;
if (d1.compareTo(d2)<0)

public class GeneralizedSelectionSort{
    /**
    Precondition: numberUsed <= a.length;
    the first numberUsed indexed variables have values.
    Action: Sorts a so that a[0, a[1], ... , a[numberUsed - 1]
    are in increasing order by the compareTo method.
    */
    public static void sort(Comparable[] a, int numberUsed) {
        int index, indexOfNextSmallest;
        for (index = 0; index < numberUsed - 1; index++){
            indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
            interchange(index, indexOfNextSmallest, a);
            // a[0], a[1], ... , a[index] are correctly ordered and these are
            // the smallest of the origional array elements. The remaining
            // positions contain the rest of the original array elements.
        }
    }
    /**
    Returns the index of the smallest value among
    a[startIndex], a[startIndex+1], ... , a[numberUsed - 1]
    */
    private static int indexOfSmallest(int startIndex, Comparable[] a, int numberUsed) {
        Comparable min = a[startIndex];
        int indexOfMin = startIndex;
        int index;
        for (index = startIndex + 1; index < numberUsed; index++) {
            if(a[index].compareTo(min) < 0 { // if a[index] is less than min
                min = a[index];
                indexOfMin = index;
                // min is smallest of a[startIndex] through a[index]
            }
        }
        return indexOfMin;
    }

    /**
    Precondition: i and j are legal for the array a
    Postcondition: Valuse of a[i] and a[j] have been interchanged
    */
    private static void interchange(int i, int j, Comparable[] a) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp; // original value of a[i]
    }
}


public class YourCloneableClass implements Cloneable{
    public Object clone(){
        try {
            return super.clone() // Invocation of clone
                                 // in the base class Object
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }
}

// without privacy leaks

public class YourCloneableClass2 implements Cloneable {
    private DataClass someVariable;

    public Object clone() {
        try {
            YourCloneableClass2 copy = (YourCloneableClass2)super.clone();
            copy.someVariable = (DataClass)someVariable.clone();
        }
        catch {
            return null
        }
    }
}

• When implementing the Cloneable interface and defining the full-version of
the clone method:
◦ First invoke the clone method of the base class Object (or whatever the
base class is)
◦ Then reset the values of any new instance variables whose types are mutable
class types, by making copies of the instance variables using their clone
methods
