package com.msb.state;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:27
 */
public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
//        trafficLight.setState(new YellowState());
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
    }
}
