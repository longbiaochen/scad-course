package composite;

import java.util.ArrayList;

public class Plate extends MyElement {
    private String name;
    private ArrayList<MyElement> list = new ArrayList<MyElement>();

    public Plate(String name) {
	this.name = name;
    }

    public void add(MyElement element) {
	list.add(element);
    }

    public void delete(MyElement element) {
	list.remove(element);
    }

    @Override
    public void eat() {
	System.out.println("Opening plate " + this.name + ".");
	for (MyElement ele : list) {
	    ele.eat();
	}
    }
}