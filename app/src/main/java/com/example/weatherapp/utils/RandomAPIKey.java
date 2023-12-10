package com.example.weatherapp.utils;

import java.util.Random;

public class RandomAPIKey {
    static private String KEY_PHU = "1b7ce001fbf4143a1618c866d8204c56";
    static private String KEY_KHANG = "f17c551a3146bc06178d008192486303";
    static private String KEY_DAT = "9e71c3574feada063b2a749963f0a3a4";
    static private String KEY_AN = "2c94cca18f04c90575983b4d6e3ad57e";


    static public String getRandomKey() {
        String[] contain = {
                KEY_PHU, KEY_KHANG, KEY_DAT, KEY_AN
        };

        // Sử dụng Random để chọn ngẫu nhiên một phần tử từ mảng
        Random random = new Random();
        int randomIndex = random.nextInt(contain.length);

        return contain[randomIndex];
    }
}
