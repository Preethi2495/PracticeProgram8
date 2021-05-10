package AbstractInterface;

	
//if we dont know anything about implementation just have knowledge on requirement we can prefer interface
	//public and abstract methods 100% pure abstract class
	//it should not final,static,sysnchronized,private,protected
	//variable should be public ,static ,final inside interface
	//transient keyword cannot used in interface

interface InterfaceClass
{
    // public, static and final
    final int a = 10;
  
    // public and abstract 
    void display();
}
  
// A class that implements the interface.
class TestClass implements InterfaceClass
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }
  
    // Driver Code
    public static void main (String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}


