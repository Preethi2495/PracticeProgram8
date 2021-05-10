package AbstractInterface;

 abstract class Base {
	//if we know partial knowledge on implementation then prefer abstract
	//concreta and abstract methods
	//no restrictions can be private or protected
	//no restrictions on variable decalring
	    abstract void fun();
	}
 
	class Derived extends Base {
	    void fun()
	    {
	        System.out.println("Derived fun() called");
	    }
	}
	
	class Main {
	    public static void main(String args[])
	    {
	  
	        // Uncommenting the following line will cause
	        // compiler error as the line tries to create an
	        // instance of abstract class. Base b = new Base();
	  
	        // We can have references of Base type.
	        Base b = new Derived();
	        b.fun();
	    }
	}
