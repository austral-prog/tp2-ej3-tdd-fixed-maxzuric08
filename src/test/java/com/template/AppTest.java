package com.template;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.template.App.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testDeposit() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts = deposit(accounts, "mati", -5);
        assertEquals(10, accounts.get("mati"));

    }

    @Test
    void testDeposit2() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);
        Map<String, Integer> updatedAccounts_1 = deposit(accounts, "pedro", 30);
        assertEquals(accounts, updatedAccounts_1);
    }

    @Test
    void testDeposit3() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_2 = deposit(accounts, "maxi", 15);
        assertEquals(40, accounts.get("maxi"));
    }

    @Test
    void testDeposit4() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_3 = deposit(accounts, "leo", -30);
        assertEquals(0, accounts.get("leo"));
    }

    @Test
    void testDeposit5() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = deposit(accounts, "bauti", 10);
        assertEquals(30, accounts.get("bauti"));
    }

    @Test
    void testWithdraw() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = withdraw(accounts, "bauti", 10);
        assertEquals(10, accounts.get("bauti"));

    }
    @Test
    void testWithdraw_1() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = withdraw(accounts, "mati", -5);
        assertEquals(10, accounts.get("mati"));
    }
    @Test
    void testWithdraw_2() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = withdraw(accounts, "leo", -5);
        assertEquals(0, accounts.get("leo"));
    }
    @Test
    void testWithdraw_4() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = withdraw(accounts, "pedro", 20);
        assertEquals(accounts, updatedAccounts_4);
    }

    @Test
    void testWithdraw_5() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = withdraw(accounts, "bauti", 10);
        assertEquals(10, accounts.get("bauti"));
    }

    @Test
    void testTransfer(){
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = transfer(accounts, "mati", "juan",5);
        assertEquals(5, accounts.get("mati"));
        assertEquals(20, accounts.get("juan"));
    }


    @Test
    void testTransfer_1() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_1 = transfer(accounts, "maxi", "bauti", 10);
        assertEquals(15, accounts.get("maxi"));
        assertEquals(30, accounts.get("bauti"));
    }
    @Test
    void testTransfer3(){
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = transfer(accounts, "juan", "leo",15);
        assertEquals(0, accounts.get("juan"));
        assertEquals(15, accounts.get("leo"));
    }
    @Test
    void testTransfer4() {
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = transfer(accounts, "pedro", "leo", 15);
        assertEquals(accounts, updatedAccounts_4);
    }
    @Test
    void testTransfer5(){
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("mati", 10);
        accounts.put("juan", 15);
        accounts.put("maxi", 25);
        accounts.put("leo", 0);
        accounts.put("bauti", 20);

        Map<String, Integer> updatedAccounts_4 = transfer(accounts, "maxi", "bauti",30);
        assertEquals(25, accounts.get("maxi"));
        assertEquals(20, accounts.get("bauti"));
    }

}
