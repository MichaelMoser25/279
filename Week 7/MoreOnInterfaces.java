• Again, concrete classes that implement Comparable must define the compareTo
method
• compareTo basically compares two objects, puts one "before" another, and so a
list of objects will be in a total ordering.
◦ This is intuitive for Double and String
• You can define compareTo based on the need of your task.
◦ E.g., you can define your compareTo in the Employee class as: compare
employees’ names first, if names are same, compare hireData, if still same,
compare salary, ...
• If you define both the compareTo and equals method in your class, the
meaning of "equals" in the compareTo method should often be same as that of
your equals method.


// Implements of the method clone: simple case
public Object clone() {
    try {
        return super.clone(); // invocation of clone in the base class Object
    }
    catch (CloneNotSupportedException e) {
        return null;
    }
}

//---
public interface MonthNumbers{
    public static final int JANUARY = 1, FEBRUARY = 2, ...
}

public class DemoMonthNumbers implements MonthNumbers {
    public static void main(String[] args) {
        System.out.println("The number for January is " + January);
    }
}

//---
public interface Interface1{
    int ANSWER = 42;
}

public interface Interface2{
    int ANSWER = 0;
}
// ERRORRRRRRRRRR
public class MyClass implements Interface1, Interface2{
.
.
.
}
//---

public abstract class MyAbstractClass implements Ordered{
    int number;
    char grade;

    public boolean precedes(Object other){
        if(other == null)
            return false;
        else if (!(other instanceof HourlyEmployee))
            return false;   // this will only work for an HourlyEmployee type?
        else {
            MyAbstractClass otherOfMyAbstractClass = (MyAbstractClass)other;
            return (this.number < otherOfMyAbstractClass.number);
        }
    }
    public abstract boolean follows(Object other);
}

• A concrete class must give definitions for all the method headings given in the
abstract class and the interface
◦ method definitions can be inherited from an abstract base class
• i.e., all method definitions don’t have to be at the level of the inherited
concrete class

• Like classes, an interface may be derived from a base interface
◦ This is called extending the interface
◦ The derived interface must include the phrase
    
    extends BaseInterfaceName

• A concrete class that implements a derived interface must have definitions for
any methods in the derived interface as well as any methods in the base
interface
