public class Cyrcle implements FigureInterface{
    private double radius;
    
    public Cyrcle(double radius){
        this.radius = radius;    
    }
    
    @Override
      public double calculateLice(){
          return Math.PI*(Math.pow(radius, radius)); // S = π. r2
      }
}
