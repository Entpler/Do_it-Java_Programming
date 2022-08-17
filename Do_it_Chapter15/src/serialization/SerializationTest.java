package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {//직렬화가 된 객체

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	transient String title;// 직렬화 할때 넣지 않겠다.

	public Person() {

	}

	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}

	public String toString() {
		return name + ", " + title;
	}
}

public class SerializationTest {
	public static void main(String[] args) {
		Person personLee = new Person("Lee", "Manager");// 객체 생성
		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // 직렬화 : 객체의 값을 어디에 저장해서 write했던것을 그대로 복원하는것.
			oos.writeObject(personLee);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		try(FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois =new ObjectInputStream(fis)){
			Object obj = ois.readObject();
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
