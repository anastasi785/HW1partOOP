public class Human {
    int yearOfBirth;
    String name;
    String city;
    String job;



Human(int yearOfBirth,String name,String city,String job){
    this.yearOfBirth=2022-yearOfBirth;
    this.name=name;
    this.city=city;
    this.job=job;
}
void speaks(){
    System.out.println("Привет! Меня зовут "+name+". Я из города "+ city+". Я родился в "+yearOfBirth+" году. Я работаю на должности "+job+". Будем знакомы!");
}
}



