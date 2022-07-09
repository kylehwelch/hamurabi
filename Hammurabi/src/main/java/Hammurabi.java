import java.util.Random;
import java.util.Scanner;


//KYLE LAND
//TRISTAN GRAIN
//ERIC PEOPLE
public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);


//    THE COLORS DUKE, THE COLORS!
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE


    public static void main(String[] args) {
        new Hammurabi().playGame();
    }

    void playGame() {
        // declare local variables here: grain, population, etc.
        // statements go after the declarations
        int currentPop = 100;
        int currentBushels = 2800;
        int currentLand = 1000;
        int costOfLand = 19;
        int year = 1;
        int deaths;
        int percentDeaths;
        int harvest;
        int newLand;

        System.out.println("WELCOME TO\n" +
                "===================\n" +
                "HAMMURABI!\n" +
                "===================\n" +
                "Developed by Kyle, Eric and Tristan\n\n" +
                "     ^       /\\             /\\   ~!~\n" +
                "        ^   (())           (())\n" +
                " ^         /(())\\         /(())\\      ~!~\n" +
                "          (((())))       (((())))\n" +
                "          |^|^^|^|_______|^|^^|^|\n" +
                "      /\\   |^^^^|-_-_-_-_-|^^^^|   /\\\n" +
                "     (())  | \"\" |+_+_+_+_+| \"\" |  (())\n" +
                "    ((())) |    |[X]_+_[X]|    | ((()))\n" +
                "   (((())))|    |+_+_+_+_+|    |(((())))\n" +
                "   |^|^^|^||____|-_-_-_-_-|____||^|^^|^|\n" +
                "    |^^^^|_-_-_-_-_-_-_-_-_-_-_-_|^^^^|\n" +
                "~^~~| \"\" |_-_-_-_-_-_-_-_-_-_-_-_| \"\" |~~\n" +
                "~~  |    |_+_+_+_+_+_+_+_+_+_+_+_|    | ~^~\n" +
                " ~^^|    |_+[X]+_[X]_+_[X]_+[X]+_|    |~~^\n" +
                "    |    |_+_+_+_+_+/l\\+_+_+_+_+_|    |\n" +
                "    |    |_-_-_-_-_|:::|_-_-_-_-_|    |\n" +
                "    |____|_+_+_+_+_|:::|_+_+_+_+_|____|\n" +
                "@@@@@@@@@@@@@@@@@@@@\"\"\"@@@@@@@@@@@@@@@@@@@@\n" +

                "Press Enter to begin!");

        try{System.in.read();}
        catch(Exception e){}

        System.out.println("Great Hammurabi! You have returned from your grand voyage to visit the newly built pyramids!\n" +
                "I hope you found it rejuvenating. I am your High Priest Garza, I will report our holdings to you\n" +
                "every year, and aid you in your decisions. You have much work to do. Our people need leadership!\n" +
                "Much has changed since you departed, the economy has grown stagnant, our people have become slothful,\n" +
                "Through our actions, we will return our great land of Sumer to glory!\n" +
                "We currently have " + CYAN_BRIGHT + currentPop + TEXT_RESET + " citizens, " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres for them to farm,\n" +
                "(10 acres per citizen) and " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain in our stores.\n" +
                "Our first order of business, we must decide how much land we wish to acquire!\n" +
                "You may purchase more land, but it will cost " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n" +
                "(enter a number for how much land you would like to buy, and press Enter)");



        scanner.nextInt();
//      CODE ABOVE IS PLACEHOLDER
//      THIS IS WHERE THEY DECIDE WHETHER TO BUY OR SELL LAND!!
//      scanner entry will decide. if they don't buy land, ask to sell
//        Land.askHowManyAcresToBuy(costOfLand, acres);

        System.out.println("An excellent choice Sire. I am in awe of your wisdom.\n" +
                "Next, we must decide how much food we desire to feed our people (if any *wink*).\n" +
                "20 bushels per person is enough for them to survive, we can give them more\n" +
                "if we want to make them happier, but who cares about happy people?\n" +
                "Remember that we only have " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain in our stores.\n" +
                "(enter a number for how many bushels of grain you would like to feed each citizen, and press Enter)");


        scanner.nextInt();
//        CODE ABOVE IS PLACEHOLDER
//        THIS IS WHERE THEY DECIDE HOW MUCH FOOD TO GIVE THEM
//        Land.askHowMuchGrainToFeedPeople(bushels);

        System.out.println("Certainly you have made the right choice Your Eminence.\n" +
                "Finally, we must decide how many acres of land we wish to plant with grain!\n" +
                "I am sure you already know this, Your Greatness, but it costs us 2 bushels of grain\n" +
                "per acre of land that we plant. Once planted the land will return anywhere from\n" +
                "1 to 6 bushels of grain the following year. We have " + GREEN_BRIGHT + currentLand + TEXT_RESET + "acres of land that we can plant." +
                "May Enki bless our lands with fertility and rain.");

        scanner.nextInt();



    }


//    public Integer askHowManyAcresToBuy(int price, int acres) {
//        acres = scanner.nextInt();
//        if ((acres * costOfLand) > currentGrain) {
//
//        }
//    }


    void newYear() {



    }



}

//UNUSED DIALOGUE GOES OUT HERE

//                "Next, we must decide if we wish to sell any of our land.\n" +
//                "We currently have " + currentLand + "acres, and we can sell them\n" +
//                "for " + costOfLand + " bushels of grain. Tell me sire, how many acres\n" +
//                "of land do you wish to sell?\n" +
//                "(enter a number for how much land you would like to sell, and press Enter");

