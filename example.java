public class example {
    //3.2
    /*public static void zoop() {
        baffle();
        System.out.print("You wugga "); baffle();
    }
    public static void main(String[] args) { System.out.print("No, I "); zoop();
        System.out.print("I "); baffle();
    }
    public static void baffle() { System.out.print("wug"); ping();
    }
    public static void ping() { System.out.println(".");
    }*/

    //3.3
    public static void zool(int number, String animal, String street){
        System.out.println(number);
        System.out.println(animal);
        System.out.println(street);

    }

    public static void main(String[] args) {
        int number = 11;
        String animal = "dog";
        String street = "Hung Vuong";
        zool(number, animal, street);

        printAmerican("Sarturday",16,"July",2011);
        printEuropean("Saturday",16,"July", 2011);

    }

    //3.4
    public static void printAmerican(String day, int date, String month, int year){
        String today = String.format("%s, %s %s, %s.",day, month, date, year);
        System.out.println("American format :");
        System.out.println(today);

    }
    public static void printEuropean(String day, int date, String month, int year){
        String today = String.format("%s %s %s, %s.",day, date, month, year);
        System.out.println("European format");
        System.out.println(today);
    }


}
