package ru.itpark;

public class SportMaster {
    public int calculateCashBack(int previousPurchase, int currentPurchase) {

        int blueCardCashBackPercent = 5;
        int silverCardCashBackPercent = 7;
        int goldCardCashBackPercent = 10;
        int minLimitBlueCard = 0;
        int maxLimitBlueCard = 15_000;
        int maxLimitSilverCard = 150_000;
        int result;


        if (previousPurchase <= maxLimitBlueCard && previousPurchase >= minLimitBlueCard) {
            result = currentPurchase * blueCardCashBackPercent / 100;

        } else if (previousPurchase > maxLimitSilverCard) {
            result = currentPurchase * goldCardCashBackPercent / 100;

        } else {
            result = currentPurchase * silverCardCashBackPercent / 100;
        }


        return result;

    }

}
