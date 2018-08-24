package pl.designpatterns.classicBuilder;

public interface FlightLegBuilder {
    void buildFrom();
    void buildTo();
    void buildDelayed();
    void buildPrice();

    FlightLeg getFlightLeg();

}
