package pl.designpatterns;

import pl.designpatterns.classicBuilder.FlightLegDirector;
import pl.designpatterns.classicBuilder.OtherPreconfiguredFlightType;
import pl.designpatterns.classicBuilder.SomePreconfiguredFlightType;
import pl.designpatterns.classicBuilder.FlightLeg;
import pl.designpatterns.classicBuilder.FlightLeg;
import pl.designpatterns.innerClassBuidler.FlightLegInner;

public class Main {

    public static void main(String[] args) {
        //inner builder
        FlightLegInner leg = new FlightLegInner.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();
        System.out.println(leg);

        System.out.println("-----------------------------");

        //classical builder
        SomePreconfiguredFlightType flight1 = new SomePreconfiguredFlightType();
        OtherPreconfiguredFlightType flight2 = new OtherPreconfiguredFlightType();

        FlightLeg flightNYC = new FlightLegDirector(flight1).buildFlightLeg().getFlightLeg();
        FlightLeg flightCracow = new FlightLegDirector(flight2).buildFlightLeg().getFlightLeg();

        System.out.println(flightNYC);
        System.out.println(flightCracow);

    }
}
