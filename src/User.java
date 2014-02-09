
public class User {
    private FigureInterface figure;
    private String name;
    
    public User(FigureInterface figure){
        this.figure = figure;
    }

    public void setFigure(FigureInterface figure) {
        this.figure = figure;
    }
    public FigureInterface getFigure() {
        return figure;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    
    public double printResult(){
        return figure.calculateLice();
    }
          
}
