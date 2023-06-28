package org.example.interfaces;

interface DoubleBass {
    void strum();

    default int getVolume() {
        return 5;
    }
}

interface BassGuitar {
    void strum();

    default int getVolume() {
        return 10;
    }
}

abstract class ElectricBass implements /*can't extend two default methods DoubleBass,*/ BassGuitar {
    @Override
    public void strum() {
        System.out.print("X");
    }
}

public class RockBand {
    public static void main(String[] strings) {
        final class MyElectricBass extends ElectricBass {
            public int getVolume() {
                return 30;
            }

            public void strum() {
                System.out.print("Y");
            }
        }
    }
}
