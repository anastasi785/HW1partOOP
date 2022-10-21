import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    String name;
    private String city;
    String job;


    Human(int age, String name, String city, String job) {
        if(yearOfBirth>=0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        }else {
            this.yearOfBirth=0;
        }
        this.name = name;
        this.city = city;
        this.job = job;
    }

    Human(int age) {

        if (yearOfBirth >= 0 ) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = 0;
        }
        name = "Информация не указана";
        city = "Информация не указана";
        job = "Информация не указана";
    }

    void speaks() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public int getYear() {
        return LocalDate.now().getYear() -yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth=yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {

       if (yearOfBirth>=0 ) {
           this.yearOfBirth = yearOfBirth;
        }else  {
           System.out.println("Информация не указана");
       }
        }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty() ) {
            this.city = city;
        }else {
            this.city="Информация не указана";
        }
    }
}




