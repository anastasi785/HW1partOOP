public class Car {
    String brand;
    String model;
    String productionCountry;
    String color;
    double engineVolume;
    int productionYear;

    Car (String brand,String model,String productionCountry,String color, double engineVolume,int productionYear){
        this.brand=brand;
        this.model=model;
        this.productionCountry=productionCountry;
        this.color=color;
        this.engineVolume=engineVolume;
        this.productionYear=productionYear;
    }
    void information(){
        System.out.println("Mарка "+ brand+" Модель "+model+" Страна производства "+productionCountry+" Цвет кузова "+color+" Объем двигателя в литрах "+engineVolume+" Год производства "+productionYear);
    }
}
