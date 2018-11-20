package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportMasterTest {

    @Test
    void calculateCashBack() {

        {
            SportMaster sMaster = new SportMaster();
            int cashBack = sMaster.calculateCashBack(0, 4_000);
            assertEquals(200, cashBack);
        }

        {
            SportMaster sMaster = new SportMaster();
            int cashBack = sMaster.calculateCashBack(4_000, 4_000);
            assertEquals(200, cashBack);
        }

        {
            SportMaster sMaster = new SportMaster();
            int cashBack = sMaster.calculateCashBack(15_001, 10_000);
            assertEquals(700, cashBack);
        }

        {
            SportMaster sMaster = new SportMaster();
            int cashBack = sMaster.calculateCashBack(150_001, 4_000);
            assertEquals(400, cashBack);
        }
    }
}