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

        kat.setYearOfBirth(-2056);
        System.out.println(kat.getYearOfBirth());

        kat.setCity("");
        System.out.println(kat.getCity());












    }

}