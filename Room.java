import java.util.ArrayList;

public class Room {
    double powierzchnia;
    ArrayList<Furniture> meble =new ArrayList<>();

    public Room(double powierzchnia, ArrayList<Furniture> meble){
        this.powierzchnia = powierzchnia;
        this.meble = meble;
    }

    public double FurniturePrice(ArrayList<Furniture> meble){
        double sum = 0;
        for(Furniture m:meble){
            sum+=m.getPriceWithVat();
        }
        return sum;
    }

}
