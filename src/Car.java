public class Car {
    private String kolor;
    private int numberDoor;
    private String marka;
    private boolean gearbox;

    public Car(String kolor, int numberDoor, String marka, boolean gearbox){
        this.kolor = kolor;
        this.numberDoor = numberDoor;
        this.marka = marka;
        this.gearbox = gearbox;
    }
    public void setGearbox(boolean gearbox){
        this.gearbox = gearbox;
    }
    public boolean getgearbox(){
        return gearbox;
    }
    public void setKolor(String kolor){
        this.kolor = kolor;
    }
    public String getkolor(){
        return kolor;
    }
    public void setNumberDoor(int numberDoor){
        this.numberDoor = numberDoor;
    }
    public int getnumberDoor(){
        return numberDoor;
    }
    public String getmarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }

}
