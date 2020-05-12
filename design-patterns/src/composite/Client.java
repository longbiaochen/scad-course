package composite;

public class Client {
    public static void main(String a[]) {
	MyElement fruit1, fruit2, fruit3, fruit4, fruit5;
	Plate plate1, plate2, plate3;

	fruit1 = new Apple();
	fruit2 = new Pear();
	plate1 = new Plate("P1");
	plate1.add(fruit1);
	plate1.add(fruit2);

	fruit3 = new Banana();
	fruit4 = new Banana();
	plate2 = new Plate("P2");
	plate2.add(fruit3);
	plate2.add(fruit4);

	fruit5 = new Apple();
	plate3 = new Plate("P3");
	plate3.add(plate1);
	plate3.add(plate2);
	plate3.add(fruit5);

	plate3.eat();
    }
}
