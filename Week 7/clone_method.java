
// Clone method

• Let’s discuss another popular method: Every object inherits a method named
clone from the class Object
◦ It is supposed to return a deep copy of the calling object
• However, the inherited version of the method was not designed to be used as is
◦ Instead, each class is expected to override it with a more appropriate version
        Sale aCopy = anSaleObject.clone();

Sale aCopy = anSaleObject.clone(); // with clone
Sale aCopy = new Sale(anSaleObject); // with copy constructor

• To override clone, note that the heading for the clone method that is defined
in the Object class is as follows:

    protected Object clone()

• The heading for a clone method in a derived class that overrides the clone
method in the inherited Object class can differ somewhat from the heading
above:
◦ A change to a more permissive access, such as from protected to public,
is always allowed when overriding a method definition

• Therefore, the clone method for all classes had Object as its return type
◦ Since the return type of the clone method of the Object class was Object, the
return type of the overriding clone method of any other inherited class was
Object as well.

Sale copy = (Sale) original.clone();

• If a class has a copy constructor, the clone method for that class can use the


    public Sale clone() {
        return new Sale(this);
    }
... and another example:
    public DiscountSale clone() {
        return new DiscountSale(this);
    }

• Alternately, if the clone method is used instead of the copy constructor, then
(because of late binding) a true copy is made, even from objects of a derived class
(e.g., DiscountSale):
    b[i] = (a[i].clone()); //DiscountSale object

• The reason this works is because the method clone has the same name in all
classes, and polymorphism/late binding works here.
• However, the copy constructors named Sale and DiscountSale have different
names, and polymorphism doesn't work with methods of different names.

//------------  Interfaces
public interface Ordered{
    public boolean precedes(Object other);
    /**
    For objects of the call a1 and a2
    a1.follows(a2) == a2.preceded(a1)
    */
    public boolean follows(Object other);
}

• To implement an interface, a concrete class must do two things:
1. It must include the phrase:
    implements Interface_Name

at the start of the class definition
– A class can implement multiple interfaces
– If more than one interface is implemented, each is listed, separated by
commas
2. A concrete class must implement all of the method headings listed in the
definition(s) of the interface(s)

// Implementation of an Interface
public class OrderedHourlyEmployee extends HourlyEmployee implements Ordered{
    public boolean precedes(Object other){
        if(other == null){
            return false;
        } else if (!(other instanceof HourlyEmplouee)){
            return false
        } else{
            OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
            return (getPay() < otherOrderedHourlyEmployee.getPay());
        }
    }
    
    public boolean follows(Object other){
        if(other==null)
            return false;
        else {
            (!(other instanceof OrderedHourlyEmployee.precedes(thisO)
        }
    }
}











