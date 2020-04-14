package org.example.growingplant;

public class App {

    public static void main(String[] args) {
        growingPlant(10, 9, 4);
    }

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {

        int afterDay = 0;
        int afterNight = 0;
        int upSpeedInt = upSpeed;

        int count = 0;
        while (afterDay < desiredHeight && afterNight < desiredHeight) {
            afterDay = (afterNight + upSpeedInt);
            afterNight = (afterDay - downSpeed);
            count++;
        }
        return count;
    }

}