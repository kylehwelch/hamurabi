package hamurabi.src.main.java;

import java.util.Random;
import java.util.Scanner;



//KYLE LAND
//TRISTAN BUSHELS
//ERIC PEOPLE

public class Hammurabi {
    //    THE COLORS DUKE, THE COLORS!
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Hammurabi().playGame();
    }

    void playGame() {

        int currentPop = 100;
        int currentBushels = 2800;
        int currentLand = 1000;
        int costOfLand = 19;
        int year = 1;
        int harvest;
        int plagueDeaths;
        int landToSell = 0;
        int landToBuy = 0;
        int immigrants;
        int starvationDeaths;
        boolean uprising = false;
        int bushelsToFeedPeople = 0;
        int landToPlant = 0;
        int ratFood = 0;
        int totalImmigrants = 0;
        int totalDeaths = 0;
        int totalHarvest = 0;




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

//        try{scanner.next();}
//        catch(Exception e){}
        try {
            System.in.read();
        } catch (Exception e) {
        }

        System.out.println("Great Hammurabi! You have returned from your grand voyage to visit the newly built pyramids!\n" +
                "I hope you found it rejuvenating. I am your High Priest Garza, I will report our holdings to you\n" +
                "every year, and aid you in your decisions. You have much work to do. Our people need leadership!\n" +
                "Much has changed since you departed, the economy has grown stagnant, and our people have become slothful.\n" +
                "Through your actions, you shall return our great land of Sumer to glory and endless prosperity!\n" +
                "We currently have " + CYAN_BRIGHT + currentPop + TEXT_RESET + " citizens, " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres for them to farm,\n" +
                "(1 citizen can farm 10 acres) and " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain in our stores.\n" +
                "For our first order of business, we must decide how much land we wish to acquire!\n" +
                "You may purchase more land, but it will cost " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n");
//                "(enter a number for how much land you would like to buy, and press Enter)\n");


        while (true) {
//            landToBuy = scanner.nextInt();
            landToBuy = TheScanner.getNumber("(enter a number for how much land you would like to buy, and press Enter)\n");
            if (landToBuy != 0 && (landToBuy * costOfLand < currentBushels)) {
                currentLand += landToBuy;
                currentBushels -= (costOfLand * landToBuy);
                break;
            } else if (landToBuy != 0 && (landToBuy * costOfLand > currentBushels)) {
                System.out.println("We cannot afford to purchase that much land, Sire!\n" +
                        "Please choose an amount of land that we can afford!\n" +
                        "I must remind you that land costs " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels per acre\n" +
                        "and we have " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain.");
            } else if (landToBuy == 0) {
                System.out.println("If you do not wish to purchase more land, My Lord, then of course we can choose to\n" +
                        "sell it instead! We can sell land for " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n");
//                        "(enter a number for how much land you would like to sell, and press Enter)\n");
                landToSell = TheScanner.getNumber("(enter a number for how much land you would like to sell, and press Enter)\n");
                if ((landToSell != 0) && (landToSell < currentLand)) {
                    currentLand -= landToSell;
                    currentBushels += (costOfLand * landToSell);
                    break;
                } else if (landToSell != 0 && (landToSell > currentLand)) {
                    System.out.println("We don't have that much land to sell, Sire!\n" +
                            "Are you sure you don't want to BUY some land?\n" +
                            "How much land would you like to BUY?");
                } else if (landToSell == 0) {
                    System.out.println("This year we shall neither purchase, nor sell any of our land.\n" +
                            "Why change our holdings, when the current amount fits so well?\n");
                    break;
                }
            }
        }

        System.out.println("An excellent choice Sire. I am in awe of your wisdom.\n" +
                "Next, we must decide how much food we desire to feed our people (if any *wink*).\n" +
                "20 bushels per person is enough for them to survive, we can give them more\n" +
                "if we want to make them happier, but who cares about happy people?\n" +
                "Remember that we only have " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain in our stores.\n");
//                "(enter a number for how many total bushels of grain to feed all of our citizens, and press Enter)\n");

        while (true) {
            bushelsToFeedPeople = TheScanner.getNumber("(enter a number for how many total bushels of grain to feed all of our citizens, and press Enter)\n");
            if (bushelsToFeedPeople < (currentPop * 20)) {
                System.out.println("A frugal decision, the people will have to learn restraint and ration their foods properly\n");
                currentBushels -= bushelsToFeedPeople;
                break;
            } else if (bushelsToFeedPeople > (currentPop * 20)) {
                System.out.println("The people will celebrate your name in the streets and rejoice!\n");
                currentBushels -= bushelsToFeedPeople;
                break;
            } else if (bushelsToFeedPeople == (currentPop * 20)) {
                System.out.println("A wise choice. You paid attention in your math lessons.");
                currentBushels -= bushelsToFeedPeople;
                break;
            } else if (bushelsToFeedPeople > currentBushels) {
                System.out.println("We don't have that many bushels, My Liege. " +
                        "Perhaps a number of bushels lower than " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + ".");
            }
        }

        System.out.println("Certainly you have made the right choice Your Eminence.\n" +
                "Finally, we must decide how many acres of land we wish to plant with grain!\n" +
                "I am sure you already know this, Your Greatness, but it costs us 2 bushels of grain\n" +
                "per acre of land that we plant. Once planted the land will return anywhere from\n" +
                "1 to 6 bushels of grain the following year. \n" +
                "We have " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres of land that we can plant.\n" +
                "May Enki bless our lands with fertility and rain.\n");
//                "(enter a number for how many acres of land you would like to plant with grain, and press Enter)\n");


        while (true) {
            landToPlant = TheScanner.getNumber("(enter a number for how many acres of land you would like to plant with grain, and press Enter)\n");
            if (landToPlant > currentLand) {
                System.out.println("We do not have that much land Sire! Please choose a lower amount!\n");
            } else if (landToPlant * 2 > currentBushels) {
                System.out.println("We do not have enough grain to plant that much land, Sire!\n" +
                        "Please choose a lower amount of land to plant.\n");
            } else if (landToPlant <= currentLand && (landToPlant * 2) < currentBushels) {
                System.out.println("What an excellent choice, O Great Emperor. The land will be planted and grow plentifully.");
                break;
            }
        }

        System.out.println("Oh Great Hammurabi, your decisions have been noted. Surely goodness and\n" +
                "prosperity await us in the coming year.\n" +
                "You have fulfilled your kingly duties, I look forward to our meeting next year.\n\n\n");


        //=======================================
        //THIS IS WHERE THE WHILE LOOP STARTS!!!!
        //=======================================

        while (year <= 10) {

            //Win Condition
            if (year == 10) {
                System.out.println("Congraturation!\n" +
                        "This story is happy end.\n" +
                        "Thank you.\n\n\n" +
                        "Total Citizen Deaths: " + totalDeaths + "\n" +
                        "Total Grain Harvested: " + totalHarvest + "\n" +
                        "Total immigrants to your land: " + totalImmigrants + "\n\n" +
                        "Would you like to play again? y/n\n");
                String playAgain;
                playAgain = scanner.nextLine();
                if (playAgain == "y") {
                    new Hammurabi().playGame();
                } else if (playAgain == "n") {
                    break;
                }
            }

            System.out.println("You have completed year " + year + ". Press Enter to begin year " + (year + 1) + "\n\n");

            try {
                System.in.read();
            } catch (Exception e) {
            }

            //Review Last Year
            System.out.println("O Great Hammurabi, how the time has flown! A year has passed since last we met.\n" +
                    "Allow me to review your choices for last year.\n");
            if (landToBuy != 0) {
                System.out.println("You Chose to purchase " + GREEN_BRIGHT + landToBuy + TEXT_RESET + " acres of land");
            } else if (landToBuy == 0) {
                System.out.println("You chose to sell " + GREEN_BRIGHT + landToSell + TEXT_RESET + " acres of land");
            } else {
                System.out.println("You did not make any changes to the amount of land that we owned last year.");
            }
            System.out.println("You fed our citizens " + YELLOW_BRIGHT + bushelsToFeedPeople + TEXT_RESET + " bushels of grain.");
            System.out.println("And finally, you planted " + YELLOW_BRIGHT + landToPlant + TEXT_RESET + " acres of land with grain.\n\n" +
                    "Press Enter to continue.\n");

            try {
                System.in.read();
            } catch (Exception e) {
            }

            year++;
            costOfLand = rand.nextInt(7) + 17;
            System.out.println("The cost of land has changed this year, My Lord.\n" +
                    "This year it will cost " + YELLOW_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre of land.");


            //PLAGUE ROLL
            plagueDeaths = People.plagueDeaths(currentPop);
            totalDeaths += plagueDeaths;
            if (plagueDeaths == 0) {
            } else if (plagueDeaths != 0) {
                currentPop = currentPop - plagueDeaths;
                System.out.println("The Gods frowned upon us, a great plague swept through the lands killing " +
                        RED_BRIGHT + plagueDeaths + TEXT_RESET + " people.\n" + CYAN_BRIGHT + currentPop + TEXT_RESET + " citizens remain.\n\n" +
                        "We shall build a grand memorial in their memory.\n\n");
            }

            //STARVATION DEATHS AND UPRISING!
            starvationDeaths = People.starvationDeaths(currentPop, bushelsToFeedPeople);
            totalDeaths += starvationDeaths;
            if (starvationDeaths == 0) {
                System.out.println("Our people were well fed this year! No citizens died from starvation.");
            } else if (starvationDeaths > 0) {
                if (People.uprising(currentPop, starvationDeaths) == true) {
                    System.out.println("Sire! More than half of our people starved to death this year!\n" +
                            "Your decision to feed them less, while frugal, decimated our population. The streets are flooded with\n" +
                            "angry citizens. They are calling for your head! They believe that you would make a powerful sacrifice to\n" +
                            "the gods, and restore favor to our lands. I must flee the palace at once, good luck to you!\n\n" +
                            RED_BRIGHT + "YOU WERE SACRIFICED TO THE GODS\n" + TEXT_RESET +
                            "It was a beautiful ceremony.\n\n\n" +
                            "Game Over");
                    String playAgain;
                    playAgain = scanner.nextLine();
                    if (playAgain == "y") {
                        new Hammurabi().playGame();
                    } else if (playAgain == "n") {
                        break;
                    }

                }
                currentPop = currentPop - starvationDeaths;
                System.out.println("Though you made the wise decision to trust our people to ration their food wisely,\n" +
                        "they did not properly ration their food stores. " + RED_BRIGHT + starvationDeaths + TEXT_RESET + " citizens died from starvation.\n" +
                        CYAN_BRIGHT + currentPop + TEXT_RESET + " citizens remain.");
            }

            //IMMIGRATION
            immigrants = People.immigrants(currentPop, currentLand, currentBushels);
            currentPop += immigrants;
            totalImmigrants += immigrants;
            if (immigrants == 0) {
                System.out.println("No new citizens joined our great nation this year.\n" +
                        "Our people were hungry, and did not inspire any outsiders to join us.\n" +
                        "They shall be lashed for their insolence!\n");
            } else if (immigrants > 0) {
                System.out.println("Our people were well fed this year! They spread the word\n" +
                        "to our neighboring countries and people flocked to our borders!\n" +
                        immigrants + " joined our population, increasing our total population to " + CYAN_BRIGHT + currentPop + TEXT_RESET + ".");
            }

            //HARVEST
            harvest = Bushels.harvest(landToPlant);
            currentBushels += harvest;
            totalHarvest += harvest;
            System.out.println("We planted " + YELLOW_BRIGHT + landToPlant + TEXT_RESET + " acres of land this year, and from that land our workers\n" +
                    "harvested " + YELLOW_BRIGHT + harvest + TEXT_RESET + " bushels of grain, bringing our total " +
                    "amount of grain stored up to " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + ".");

            //RATS!!!!!!!
            ratFood = Bushels.grainEatenByRats(currentBushels);
            currentBushels -= ratFood;
            if (ratFood != 0) {
                System.out.println("I am disappointed to report, Sire, that a RAT infestation has broken out\n" +
                        "in our lands. The cats we hired to control the rat population did not do their jobs, \n" +
                        "and will be lashed. The rats got into our grain silo's and ate " + RED_BRIGHT + ratFood + TEXT_RESET + " bushels of grain.\n" +
                        YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain remain.");
            }

            //AFTER METHODS RUN, HERE IS THE REST OF THE UPDATE!

            System.out.println("My King, it is that time of year again. With the news delivered you must make decisions\n" +
                    "about what to do in the coming year. Here are your holdings at the beginning of this year: \n" +
                    "We have " + CYAN_BRIGHT + currentPop + TEXT_RESET + " citizens.\n" +
                    "We have " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres of land.\n" +
                    "Our food stores hold " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain.\n" +
                    "The cost of land is " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n");
//                    "How much land would you like to purchase this year?\n");


            while (true) {
                landToBuy = TheScanner.getNumber("How much land would you like to purchase this year?\n");
                if (landToBuy != 0 && (landToBuy * costOfLand < currentBushels)) {
                    currentLand += landToBuy;
                    currentBushels -= (costOfLand * landToBuy);
                    break;
                } else if (landToBuy != 0 && (landToBuy * costOfLand > currentBushels)) {
                    System.out.println("We cannot afford to purchase that much land, Sire!\n" +
                            "Please choose an amount of land that we can afford!\n" +
                            "I must remind you that land costs " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels per acre\n" +
                            "and we have " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels of grain.");
                } else if (landToBuy == 0) {
                    System.out.println("If you do not wish to purchase more land, My Lord, then of course we can choose to\n" +
                            "sell it instead! We can sell land for " + PURPLE_BRIGHT + costOfLand + TEXT_RESET + " bushels of grain per acre.\n");
//                            "(enter a number for how much land you would like to sell, and press Enter)\n");
                    landToSell = TheScanner.getNumber("(enter a number for how much land you would like to sell, and press Enter)\n");
                    if ((landToSell != 0) && (landToSell < currentLand)) {
                        currentLand -= landToSell;
                        currentBushels += (costOfLand * landToSell);
                        break;
                    } else if (landToSell != 0 && (landToSell > currentLand)) {
                        System.out.println("We don't have that much land to sell, Sire!\n" +
                                "Are you sure you don't want to BUY some land?\n" +
                                "How much land would you like to BUY?");
                    } else if (landToSell == 0) {
                        System.out.println("This year we shall neither purchase, nor sell any of our land.\n" +
                                "Why change our holdings, when the current amount fits so well?\n");
                        break;
                    }
                }
            }

            System.out.println("As always, I am ever impressed by your endless knowledge and wisdom.\n" +
                    "It is time to choose how many bushels of grain you wish to feed to your people\n" +
                    "We have " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + " bushels in our stores now.\n");
//                    "How much would you like to give to our citizens?");

            while (true) {
                bushelsToFeedPeople = TheScanner.getNumber("How much would you like to give to our citizens?");
                if (bushelsToFeedPeople < (currentPop * 20)) {
                    System.out.println("A frugal decision, the people will have to learn restraint and ration their foods properly\n");
                    currentBushels -= bushelsToFeedPeople;
                    break;
                } else if (bushelsToFeedPeople > (currentPop * 20)) {
                    System.out.println("The people will celebrate your name in the streets and rejoice!\n");
                    currentBushels -= bushelsToFeedPeople;
                    break;
                } else if (bushelsToFeedPeople == (currentPop * 20)) {
                    System.out.println("A wise choice. You paid attention in your math lessons.");
                    currentBushels -= bushelsToFeedPeople;
                    break;
                } else if (bushelsToFeedPeople > currentBushels) {
                    System.out.println("We don't have that many bushels, My Liege. " +
                            "Perhaps a number of bushels lower than " + YELLOW_BRIGHT + currentBushels + TEXT_RESET + ".");
                }
            }

            System.out.println("Certainly you have made the right choice Your Eminence.\n" +
                    "Finally, we must decide how many acres of land we wish to plant with grain!\n" +
                    "We have " + GREEN_BRIGHT + currentLand + TEXT_RESET + " acres of land that we can plant.\n" +
                    "May Enki bless our lands with fertility and rain.\n");
//                    "How many acres would you like to plant?\n");


            while (true) {
                landToPlant = TheScanner.getNumber("How many acres would you like to plant?\n");
                if (landToPlant > currentLand) {
                    System.out.println("We do not have that much land Sire! Please choose a lower amount!\n");
                } else if (landToPlant * 2 > currentBushels) {
                    System.out.println("We do not have enough grain to plant that much land, Sire!\n" +
                            "Please choose a lower amount of land to plant.\n");
                } else if (landToPlant <= currentLand && (landToPlant * 2) < currentBushels) {
                    System.out.println("What an excellent choice, O Great Emperor. The land will be planted and grow plentifully.");
                    break;
                }
            }

            System.out.println("Oh Great Hammurabi, your decisions have been noted. Surely goodness and\n" +
                    "prosperity await us in the coming year.\n" +
                    "You have fulfilled your kingly duties, I look forward to our meeting next year.\n\n\n");

        }
    }
}

