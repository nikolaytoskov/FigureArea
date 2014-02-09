

public class Triangle implements FigureInterface{
      private double a;
      private double h;
      
      public Triangle(double a, double h){
          this.a = a;
          this.h = h;
      }
      @Override
      public double calculateLice(){
          return (a*h)/2;
      }
}
