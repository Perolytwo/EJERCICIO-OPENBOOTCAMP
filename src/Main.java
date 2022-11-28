public class Main {
    public static void main(String[] args) {
        Car MyCar= new Car();
        MyCar.AddDoor();
        System.out.println(MyCar.Door);
    }

}
class Car{
    public int Door= 4;

    public void AddDoor(){
        this.Door++;
    }


}