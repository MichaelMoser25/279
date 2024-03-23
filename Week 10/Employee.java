/**
 Class Invariant: All objects have a name string and hire date.
 A name string of "No name" indicates no real name specified yet.
 A hire date of Jan 1, 1000 indicates no real hire date specified yet.
*/
package week10Package;

import java.util.Date;

//public class Employee implements Cloneable, InterfaceA, InterfaceB
public class Employee implements Cloneable
{
    private String name;
    private Date hireDate;

    @SuppressWarnings("deprecation")
	public Employee( )
    {
         name = "No name";
         hireDate = new Date(1000,1,1); //Just a placeholder.
    }

    /**
     Precondition: Neither theName nor theDate is null.
    */
    public Employee(String theName, Date theDate)
    {
        if (theName == null || theDate == null)
        {
             System.out.println("Fatal Error creating employee.");
             System.exit(0);
        }
        name = theName;
        hireDate = (Date)theDate.clone();
    }

    public Employee(Employee originalObject)
    {
         name = originalObject.name;
         hireDate = (Date)originalObject.hireDate.clone();
    }

    public String getName( )
    {
        return name;
    }

    public Date getHireDate( )
    {
        return (Date)hireDate.clone();
    }

    /**
     Precondition newName is not null.
    */
    public void setName(String newName)
    {
        if (newName == null)
        {
             System.out.println("Fatal Error setting employee name.");
             System.exit(0);
        }
       else
            name = newName;
    }

    /**
     Precondition newDate is not null.
    */
    public void setHireDate(Date newDate)
    {
        if (newDate == null)
        {
             System.out.println("Fatal Error setting employee hire date.");
             System.exit(0);
        }
        else
            hireDate = (Date)newDate.clone();
    }


    public String toString( )
    {
        return (name + " " + hireDate.toString( ));
    }


    public boolean equals(Employee otherEmployee)
    {
        return (name.equals(otherEmployee.name)
                       && hireDate.equals(otherEmployee.hireDate));
    }

    public Object clone( )
    {
        try
        {
            Employee copy =
                      (Employee)super.clone( );
            copy.hireDate =
                   (Date)hireDate.clone( );
            return copy;
        }
        catch(CloneNotSupportedException e)
        {//This should not happen.
            return null; //To keep compiler happy.
        }
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
    
}

