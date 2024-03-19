import java.util.Scanner;
public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year,calculator;
        String message1,message2,message3,message4,message5,message6,message7;
        String horoscope0,horoscope1,horoscope2,horoscope3,horoscope4,horoscope5,horoscope6,horoscope7,horoscope8,horoscope9,horoscope10;
        String horoscope11;

        message1 = "Welcome to the Chinese Zodiac calculator";
        message2 = "Please enter your year of birth : ";
        message3 = "Your Chinese Zodiac sign : ";

        horoscope0 = "Monkey";
        horoscope1 = "Cockerel";
        horoscope2 = "Dog";
        horoscope3 = "Pork";
        horoscope4 = "Mouse";
        horoscope5 = "Ox";
        horoscope6 = "Tiger";
        horoscope7 = "Rabbit";
        horoscope8 = "Dragon";
        horoscope9 = "Snake";
        horoscope10 = "Horse";
        horoscope11 = "Sheep";

        System.out.print(message1 + "\n" + message2);
        year = input.nextInt();

        calculator = year % 12;

        switch (calculator){
            case (0):
                System.out.println(message3 + horoscope0);
                break;
            case (1):
                System.out.println(message3 + horoscope1);
                break;
            case (2):
                System.out.println(message3 + horoscope2);
                break;
            case (3):
                System.out.println(message3 + horoscope3);
                break;
            case (4):
                System.out.println(message3 + horoscope4);
                break;
            case (5):
                System.out.println(message3 + horoscope5);
                break;
            case (6):
                System.out.println(message3 + horoscope6);
                break;
            case (7):
                System.out.println(message3 + horoscope7);
                break;
            case (8):
                System.out.println(message3 + horoscope8);
                break;
            case (9):
                System.out.println(message3 + horoscope9);
                break;
            case (10):
                System.out.println(message3 + horoscope10);
                break;
            case (11):
                System.out.println(message3 + horoscope11);
                break;

        }

    }
}
