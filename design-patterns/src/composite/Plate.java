package composite;

import java.util.ArrayList;

public class Plate extends MyElement {

    private ArrayList<MyElement> list = new ArrayList<MyElement>();

    public void add(MyElement element) {
	list.add(element);
    }

    public void delete(MyElement element) {
	list.remove(element);
    }

    public void eat() {
	System.out.println("³ÔÅÌ×Ó£¡£¡£¡£¡£¡£¡");
	for (MyElement ele : list) {
	    ele.eat();
	}
    }
}