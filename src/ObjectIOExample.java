import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class ObjectIOExample {
 
    private static final String filepath="C:\\Users\\Asus\\Desktop\\NetBeansProjects\\file\\New Text Document.txt";
 
    public static void main(String args[]) {
 
        ObjectIOExample objectIO = new ObjectIOExample();
 
        Student student = new Student("John","Frost",22);
        objectIO.WriteObjectToFile(student);
    }
 
    public void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}