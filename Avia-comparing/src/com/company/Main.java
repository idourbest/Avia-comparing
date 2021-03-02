package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BaggageInfo> baggageContainer = new ArrayList<>();
            baggageContainer.add(new BaggageInfo("American Airlines Group", "Advanced", 25));
            baggageContainer.add(new BaggageInfo("Deutsche Lufthansa", "Business", 32));
            baggageContainer.add(new BaggageInfo("United Continental Holdings", "Business", 35));
            baggageContainer.add(new BaggageInfo("Delta Air Lines", "Standart", 20));
            baggageContainer.add(new BaggageInfo("Emirates", "Lowcoster", 10));
            baggageContainer.add(new BaggageInfo("Virgin Airlines", "Lowcoster", 8));
            baggageContainer.add(new BaggageInfo("Ryanair", "Advanced", 23));

        // Sorting by weight
        Comparator<BaggageInfo> baggageComparatorWeight = new Comparator<BaggageInfo>() {
            @Override
            public int compare(BaggageInfo o1, BaggageInfo o2) {
                if (o1.getWeight() > o2.getWeight()) {
                    return 1;
                } else if (o1.getWeight() < o2.getWeight()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        baggageContainer.stream()
                .sorted(baggageComparatorWeight)
                .forEach(System.out::println);

        System.out.println("==========================");

        // Sorting by name + comfort String length
        Comparator<BaggageInfo> baggageComparatorName = (o1, o2) -> {
            if ((o1.getAviacompanyName() + o1.getComfortClass()).length() < (o2.getAviacompanyName() + o2.getComfortClass()).length()) {
                return 1;
            } else if ((o1.getAviacompanyName() + o1.getComfortClass()).length() > (o2.getAviacompanyName() + o2.getComfortClass()).length()) {
                return -1;
            } else {
                return 0;
            }
        };

        baggageContainer.stream()
                .sorted(baggageComparatorName)
                .forEach(System.out::println);
    }
}
