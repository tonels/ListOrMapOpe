package 四_default_methods_默认方法;

public class Car implements Vehicle,FourWheeler{

    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }


}
