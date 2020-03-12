package Set6;

public class ClassDetails {
    private String name;  //e.g. Algorithms
    private String roomNumber;   //e.g. R203

    ClassDetails(String Name, String RoomNumber){

        name= Name;
        roomNumber = RoomNumber;

    }

    public String getName() {
        return name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String toString(){
       return getName()  + getRoomNumber();
    }
}
