public class Person { public String firstName;
    public String lastName;
    public String city;
    public String phone;
    public static void personInfo(Person person){
        System.out.println("Зателефонувати громадянину " + person.firstName + person.lastName + " із міста " + person.city + " можна за номером " + person.phone);
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName= "Will";
        person1.lastName = "Smith";
        person1.city = "New York";
        person1.phone= "2936729462846";
        person1.personInfo(person1);
        Person person2 = new Person();
        person2.firstName = "Jackie";
        person2.lastName ="Chan";
        person2.city = "Shanghai";
        person2.phone = "12312412412";
        person2.personInfo(person2);
        Person person3 = new Person();
        person3.firstName = "Sherlock";
        person3.lastName = "Holmes";
        person3.city = "London";
        person3.phone = "37742123513";
        person3.personInfo(person3);
    }
}
