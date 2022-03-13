package com.bus.service;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class TitleServiceImp implements TitleService {
    @Override
    public List<Map<String, Integer>> getTitle() {
        String[] arr = {"+", "-", "*", "/"};
        Random random = new Random();
        int i = random.nextInt(100);
        int cha = random.nextInt(4);
        String s = arr[cha];
        return null;
    }
}
