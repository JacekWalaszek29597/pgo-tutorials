import java.util.ArrayList;

public class House {
    static int liczbaPokoi;
    ArrayList<Room> listaPokoi;
    public House(int liczbaPokoi, ArrayList<Room> listaPokoi) {
        this.liczbaPokoi = liczbaPokoi;
        this.listaPokoi = listaPokoi;
    }

    public void addRoom(Room pokoj){
        listaPokoi.add(pokoj);
        liczbaPokoi++;
    }
    public void addRooms(ArrayList<Room> pokoje){
        listaPokoi.addAll(pokoje);
        liczbaPokoi += pokoje.size();
    }
    public int getRoomCount(){
        return liczbaPokoi;
    }

}

