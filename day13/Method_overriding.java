class car {
    void station() {
        System.out.println("petrol station");
    }
}
class EVCAR extends car{
    void station(){
        System.out.println("EV station");
    }
}
class PETROL_CAR extends car{
    void station(){
        System.out.println("petrol station is not working");
    }
}
public class Method_overriding {
    public static void main(String[] args){
        EVCAR evcar=new EVCAR();
        evcar.station();
        PETROL_CAR car=new PETROL_CAR();
        car.station();
    }

}