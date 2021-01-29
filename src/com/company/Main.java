package com.company;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Presser> pressers = new ArrayList<>();
        pressers.add(new Presser(KeyEvent.VK_NUMPAD7, 3000));
        pressers.add(new Presser(KeyEvent.VK_NUMPAD8, 3000));
        pressers.add(new Presser(KeyEvent.VK_NUMPAD9, 400));
        pressers.forEach(Thread::start);
}}
