public class Main {
    public static void main(String[] args) {
        Human max=new Human(35,"Максим ","Минск", "бренд-менеджер");
        max.speaks();
        Human anya=new Human(29,"Аня","Москва","методист образовательных программ");
        anya.speaks();
        Human kat=new Human(28,"Катя","Калининград","продакт-менеджер");
        kat.speaks();
        Human artem=new Human(27);
        artem.speaks();
        Human vova=new Human(2056,"Владимир","Казань","не работает");
        vova.speaks();

        kat.setYearOfBirth(2023);
       kat.speaks();






        Car lada=new Car(1.6, "желтый",2015);
        lada.information();
        Car audi=new Car("Audi","50 L TDL quatro","Германия","чёрный",2020);
        audi.information();
        Car bmw=new Car("BMW","Z8","Германия",3.0,2021);
        bmw.information();
        Car kia=new Car("Kia","Sportage","Южная Корея","красный",2.4,2018);
        kia.information();
        Car hunday=new Car ("Hunday","Avante","Южная Корея","оранжевый",  1.6);
        hunday.information();

    }

}