package com.template;

import java.util.Collections;
import java.util.Map;

public class App {
    public static Map<String, Integer> deposit(Map<String, Integer> accounts, String account, int amount) {
            if (amount<0) return accounts;
            if (!accounts.containsKey(account)) return accounts;

            accounts.put(account, accounts.get(account) + amount);

        return accounts;
    }

    public static Map<String, Integer> withdraw(Map<String, Integer> accounts, String account, int amount) {
        if (!accounts.containsKey(account)) return accounts;
        if (accounts.get(account) < amount || accounts.get(account) < 0) return accounts;
        if (amount<0) return accounts;
        accounts.put(account, accounts.get(account) - amount);

        return accounts;

    }

    public static Map<String, Integer> transfer(Map<String, Integer> accounts,String account, String account_1, int amount ) {
        if (!accounts.containsKey(account) || !accounts.containsKey(account_1)) return accounts;
        if (accounts.get(account)<amount) return accounts;
        if (amount<0) return accounts;
        if (account==account_1) return accounts;

        accounts.put(account, accounts.get(account) - amount);
        accounts.put(account_1, accounts.get(account_1) + amount);
        return accounts;

    }



}
