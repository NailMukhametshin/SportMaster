package ru.itpark;

public class SportMaster {
    public int calculateCashBack(int previousPurchase, int currentPurchase) {

        int blueCardCashBackPercent = 5;
        int silverCardCashBackRercent = 7;
        int goldCardCashBackPercent = 10;
        int minLimitBlueCard = 0;
        int maxLimitBlueCard = 15_000;
        int minLimitSilverCard = 15_000;
        int maxLimitSilverCard = 150_000;
        int result;


        if (previousPurchase < maxLimitBlueCard && previousPurchase > minLimitBlueCard) {
            result = currentPurchase * blueCardCashBackPercent / 100;

        } else {

            if (previousPurchase > minLimitSilverCard & previousPurchase < maxLimitSilverCard) {
                result = currentPurchase * silverCardCashBackRercent / 100;
            } else {
                result = currentPurchase * goldCardCashBackPercent / 100;
            }

        }
        return result;

    }

}
