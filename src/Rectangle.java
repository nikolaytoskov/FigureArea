

public class Rectangle implements FigureInterface{
    private double a;
    
    public Rectangle(double a){
        this.a = a;
    } 
    @Override
      public double calculateLice(){
          return Math.pow(a, a);
      }
}
