public class Main {
    public static void main(String[] args) {
        Human max=new Human(35,"Максим ","Минск", "бренд-менеджер");
        max.speaks();
        Human anya=new Human(29,"Аня","Москва","методист образовательных программ");
        anya.speaks();
        Human kat=new Human(28,"Катя","Калининград","продакт-менеджер");
        kat.speaks();
        Human artem=new Human(27,"Артём","Москва","директор по развитию бизнеса");
        artem.speaks();

        Car lada=new Car("Lada","Granta","Россия","желтый",1.7,2015);
        lada.information();
        Car audi=new Car("Audi","50 L TDL quatro","Германия","чёрный",3.0,2020);
        audi.information();
        Car bmw=new Car("BMW","Z8","Германия","черный",3.0,2021);
        bmw.information();
        Car kia=new Car("Kia","Sportage","Южная Корея","красный",2.4,2018);
        kia.information();
        Car hunday=new Car("Hunday","Avante","Южная Корея","оранжевый",1.6,2016);
        hunday.information();

    }

}