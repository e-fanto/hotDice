package org.ef;

public class Main {

        public static void main(String[] args) {
            Menu menu = new Menu();
            AsciiImages images = new AsciiImages();
            images.printFlames();

            images.printBanner();
            images.printUpsideDownFlames();
            System.out.println();
            images.lilPause();

            menu.run();



}}