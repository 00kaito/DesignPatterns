package pl.designpatterns.classicBuilder;

public class SomePreconfiguredFlightType implements FlightLegBuilder {
    private FlightLeg flightLeg;

    public SomePreconfiguredFlightType() {
        this.flightLeg = new FlightLeg();
    }

    @Override
    public void buildFrom() {
        this.flightLeg.setFrom("New York");
    }

    @Override
    public void buildTo() {
        this.flightLeg.setTo("Cracow");
    }

    @Override
    public void buildDelayed() {
        this.flightLeg.setDelayed(false);
    }

    @Override
    public void buildPrice() {
        this.flightLeg.setPrice(500);
    }

    @Override
    public FlightLeg getFlightLeg() {
        return flightLeg;
    }
}
