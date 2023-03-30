package main;

import animals.Cow;
import animals.Horse;
import animals.Sheep;
import farm.Farm;

public class Main {
    public static void main(String[] args) {
        Cow[] cow = new Cow[5];
        cow[0] = new Cow (180,2,"Male","Mallavoi");
        cow[1] = new Cow (114,1,"Male","Ipavoi");
        cow[2] = new Cow (220,4,"Male","Molcha");
        cow[3] = new Cow (200,5,"Female","Carley");
        cow[4] = new Cow (160,2,"Female","Amia");
        

        Sheep[] sheep = new Sheep[3];
        sheep[0] = new Sheep(80,2,"Male","Utata");
        sheep[1] = new Sheep(68,1,"Female","Apila");
        sheep[2] = new Sheep(110,3,"Female","Aba");


        Horse[] horse = new Horse[2];
        horse[0] = new Horse(180,6,"Male","Taibu");
        horse[1] = new Horse(190,5,"Male","Batu");


        Farm farm1 = new Farm("USA",cow,horse,sheep,"Farm an");
        Farm farm2 = new Farm("USA",cow,horse,sheep,"Farm nices");

        System.out.println(farm1);
        System.out.println(farm2);
    }
}