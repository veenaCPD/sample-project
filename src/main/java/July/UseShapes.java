package July;

public class UseShapes {

    public static void main(String [] a) {
        Shapes1 myCircle = new circle(2.5f);
        myCircle.area();

        circle myCirc = new circle();
        myCirc.setRadius(3.78f);
        myCirc.area();
    }
}
