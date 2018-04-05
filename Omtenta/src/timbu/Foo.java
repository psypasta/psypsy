package timbu;
import java.util.ArrayList;
import java.util.List;

public class Foo
{
   private Foo() { }
   
   private static List<Foo> FooList = new ArrayList<Foo>();
   
   public static void main(String[] args) {
	   
	   if(true) {

		   System.out.println(CreateFoo());
		   Foo f = CreateFoo();
		      
	   }
   
   }
   
   
   
   public static Foo CreateFoo()
   {
      Foo f = new Foo();
      FooList.add(f);
      System.out.println(FooList.get(FooList.size()-1));
      return f;

      
   }
   
}