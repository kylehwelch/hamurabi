package hamurabi.src.main.java;

public class People {


    public static int plagueDeaths(int population) {
        int plagueDeaths;
        if (Math.random() <= 0.15) {
            plagueDeaths = population / 2;
            return plagueDeaths;
        }
        return 0;
    }

    public static int starvationDeaths(int population, int bushelsFedToPeople) {
        int bushelsNeeded = population * 20;
        int canFeed = (int) Math.floor(bushelsFedToPeople / 20);
        int starvationDeaths = 0;
        if (bushelsFedToPeople < bushelsNeeded) {
            starvationDeaths = population - canFeed;
            return starvationDeaths;
        }

        return 0;
    }

    public static boolean uprising(int population, int howManyPeopleStarved) {
        double percentDead = ((double) howManyPeopleStarved / population);
        if (percentDead >= 0.45) {
            return true;
        }
        return false;
    }

    public static int immigrants(int population, int acresOwned, int grainInStorage) {
        int numberOfImmigrant = (20 * acresOwned + grainInStorage) / (100 * population) + 1;

        return numberOfImmigrant;
    }

}
