import java.util.Random;
import java.util.Scanner;


//KYLE LAND
//TRISTAN BUSHELS
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
        int harvest;
        int newLand;
        int plagueDeaths;
        int percentDead;

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
                "Much has changed since you departed, the economy has grown stagnant, and our people have become slothful.\n" +
                "Through your actions, you shall return our great land of Sumer to glory and endless prosperity!\n" +
                "We currently have " + CYAN_BRIGHT + currentPop + TEXT_RESET + " citizens, " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres for them to farm,\n" +
                "(1 citizen can farm 10 acres) and " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain in our stores.\n" +
                "For our first order of business, we must decide how much land we wish to acquire!\n" +
                "You may purchase more land, but it will cost " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n" +
                "(enter a number for how much land you would like to buy, and press Enter)");

        int landToBuy = scanner.nextInt();
        int landToSell = 0;
        if (landToBuy == 0) {
            System.out.println("If you do not wish to purchase more land, My Lord, then of course we can choose to\n" +
                    "sell it instead! We can sell land for " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n" +
                    "(enter a number for how much land you would like to sell, and press Enter)");
            landToSell = scanner.nextInt();
        }

        System.out.println("An excellent choice Sire. I am in awe of your wisdom.\n" +
                "Next, we must decide how much food we desire to feed our people (if any *wink*).\n" +
                "20 bushels per person is enough for them to survive, we can give them more\n" +
                "if we want to make them happier, but who cares about happy people?\n" +
                "Remember that we only have " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain in our stores.\n" +
                "(enter a number for how many bushels of grain you would like to feed each citizen, and press Enter)");

        int grainToFeedPeople = scanner.nextInt();
        if (grainToFeedPeople < 20) {System.out.println("A frugal decision, the people will have to learn restraint and ration their foods properly");}
        else if (grainToFeedPeople > 20) {System.out.println("The people will shout your name in the streets, and rejoice!");}

        System.out.println("Certainly you have made the right choice Your Eminence.\n" +
                "Finally, we must decide how many acres of land we wish to plant with grain!\n" +
                "I am sure you already know this, Your Greatness, but it costs us 2 bushels of grain\n" +
                "per acre of land that we plant. Once planted the land will return anywhere from\n" +
                "1 to 6 bushels of grain the following year. \n" +
                "We have " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres of land that we can plant." +
                "May Enki bless our lands with fertility and rain.\n" +
                "(enter a number for how many acres of land you would like to plant with grain, and press Enter)");

        int landToPlant = scanner.nextInt();

        System.out.println("Oh Great Hammurabi, your decisions have been noted. Surely goodness and\n" +
                "prosperity await us in the coming year.\n" +
                "You have fulfilled your kingly duties, I look forward to our meeting next year.\n\n\n" +
                "You have completed year " + year + ". Press Enter to begin year " + (year+1) + "\n\n");
        try{System.in.read();}
        catch(Exception e){}


        //=======================================
        //THIS IS WHERE THE WHILE LOOP STARTS!!!!
        //=======================================

        while (year <= 10) {
            //Review Last Year
             System.out.println("O Great Hammurabi, how the time has flown! A year has passed since last we met.\n" +
                     "Allow me to review your choices for last year.\n");
             if (landToBuy != 0) {System.out.println("You Chose to purchase " + GREEN_BRIGHT + landToBuy + TEXT_RESET + " acres of land");}
             else if (landToBuy == 0) {System.out.println("You chose to sell " + GREEN_BRIGHT + landToSell + TEXT_RESET + " acres of land");}
             else {System.out.println("You did not make any changes to the amount of land that we owned last year.");}
             System.out.println("You fed each of our citizens " + YELLOW_BRIGHT + grainToFeedPeople + TEXT_RESET + " bushels of grain.");
             System.out.println("And finally, you planted " + landToPlant + " acres of land with grain.\n\n" +
                     "Press Enter to continue.\n");
             try{System.in.read();}
             catch(Exception e){}

             year++;

         //Call methods to update holdings
         //wait for classes from eric and tristan

        //AFTER METHODS RUN, HERE IS THE REST OF THE UPDATE!

            System.out.println("Let's get right to the news of this past year, Great Emperor");

//            if (plagueDeaths != 0) {
//                System.out.println("The Gods frowned upon us, a great plague swept through the lands killing " + RED_BRIGHT + plagueDeaths + TEXT_RESET + " people.\n" +
//                        currentPop + "citizens remain.");
//            }






     }












    }
}

