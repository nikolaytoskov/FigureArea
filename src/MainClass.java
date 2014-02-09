/*
Да се изгради йерархия от класове представящи основните геометрични фигури 
(триъгълник, правоъгълник, кръг). 
Да се дефинира клас който използва тези фигури за да изчисли тяхната повърхност.
*/
public class MainClass {

    public static void main(String[] args) {
        FigureInterface triangle = new Triangle(25.8, 10.11);
        User nikolay = new User(triangle);
        nikolay.setName("Николай");
        System.out.print("Моето име е " +nikolay.getName()+" и ");
        System.out.println("Лицето на триъгълника е: " + nikolay.printResult());
        
       FigureInterface rectangle = new Rectangle(25.8);
       User pesho = new User(rectangle);
       pesho.setFigure(rectangle);
       pesho.setName("Пешо");
       System.out.print("Моето име е " +pesho.getName()+" и ");
       System.out.print("Лицето на правоъгълника е: " + pesho.printResult()+", а ");
       
       
       FigureInterface cyrcle = new Cyrcle(29.8);
       pesho.setFigure(cyrcle);
       System.out.println("лицето на кръга е: " + pesho.printResult());

    }
}
