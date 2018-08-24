package pl.designpatterns.classicBuilder;

public class FlightLegDirector {
    private FlightLegBuilder flightLegBuilder;

    public FlightLegDirector(FlightLegBuilder flightLegBuilder) {
        this.flightLegBuilder = flightLegBuilder;
    }

    public FlightLegDirector buildFlightLeg(){
        flightLegBuilder.buildFrom();
        flightLegBuilder.buildTo();
        flightLegBuilder.buildDelayed();
        flightLegBuilder.buildPrice();

        return this;
    }

    public FlightLeg getFlightLeg(){
        return this.flightLegBuilder.getFlightLeg();
    }
}
