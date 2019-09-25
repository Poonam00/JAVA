import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableVarScopeMain {

	public static void main(String[] args) {
		/*Employee e = new Employee();
		e.age = 1;
		e.vola = "vola";
		Employee.staVar = "static var";
		e.packVar = "packVar";
		e.pubVar = "pubVar";
		e.proVar = "protected var";
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream("E://Employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(e);

			out.close();
			file.close();

			System.out.println("Object has been serialized");
		}

      catch(IOException ex) 
      { 
          System.out.println("IOException is caught"); 
      } */
		   try
	        {    
	            // Reading the object from a file 
	            FileInputStream file = new FileInputStream("E://Employee.ser"); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	              
	            // Method for deserialization of object 
	            SerializableVarScopes object1 = (SerializableVarScopes)in.readObject(); 
	              
	            in.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been deserialized "); 
	            System.out.println("a = " + object1.age); 
	            System.out.println("b = " + object1.vola); 
	            System.out.println("c = " + object1.staVar); 
	            System.out.println("d = " + object1.packVar); 
	            System.out.println("e = " + object1.proVar); 
	            System.out.println("f = " + object1.pubVar); 
	          

	        } 
	          
	        catch(IOException ex) 
	        {            
	            System.out.println("IOException is caught"); 
	        } 
		   catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
	  
	          
	}
}
