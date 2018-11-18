package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportMasterTest {

    @Test
    void calculateCashBack() {
        {
            SportMaster SMaster = new SportMaster();
            int cashBack = SMaster.calculateCashBack(4_000, 4_000);
            assertEquals(200, cashBack);
        }

        {
            SportMaster SMaster = new SportMaster();
            int cashBack = SMaster.calculateCashBack(15_001, 10_000);
            assertEquals(700, cashBack);
        }

        {
            SportMaster SMaster = new SportMaster();
            int cashBack = SMaster.calculateCashBack(150_001, 4_000);
            assertEquals(400, cashBack);
        }
    }
}