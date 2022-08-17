package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {//����ȭ�� �� ��ü

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	transient String title;// ����ȭ �Ҷ� ���� �ʰڴ�.

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
		Person personLee = new Person("Lee", "Manager");// ��ü ����
		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // ����ȭ : ��ü�� ���� ��� �����ؼ� write�ߴ����� �״�� �����ϴ°�.
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