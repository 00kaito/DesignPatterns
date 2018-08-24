package pl.designpatterns.classicBuilder;

public class OtherPreconfiguredFlightType implements FlightLegBuilder {
    private FlightLeg flightLeg;

    public OtherPreconfiguredFlightType() {
        this.flightLeg = new FlightLeg();
    }

    @Override
    public void buildFrom() {
        this.flightLeg.setFrom("Cracow");
    }

    @Override
    public void buildTo() {
        this.flightLeg.setTo("NewYork");
    }

    @Override
    public void buildDelayed() {
        this.flightLeg.setDelayed(false);
    }

    @Override
    public void buildPrice() {
        this.flightLeg.setPrice(700);
    }

    @Override
    public FlightLeg getFlightLeg() {
        return flightLeg;
    }
}
