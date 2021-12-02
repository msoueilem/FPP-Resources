package prog5_4;

public class Test3 {
    public static void main(String[] args) {
        Polygon[] objects = {new Square(3),
                new Triangle(4,5,6),
                new Rectangle(3,4),};


        //compute perimeter
        for(Polygon p : objects) {
            System.out.println("For this "+p.getClass().getSimpleName()+"\n" +
                    " Perimeter = "+ p.computePerimeter());
        }
    }
}
