package pl.designpatterns;

public class FlightLeg {
    private String from;
    private String to;
    private Boolean delayed = false;
    private int price;

    private FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Boolean getDelayed() {
        return delayed;
    }

    public int getPrice() {
        return price;
    }

    public void setDelayed(Boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private Boolean delayed = false;
        private int price;

        FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        FlightLegBuilder from(String from) {
            this.from = from;
            return this;
        }

        FlightLegBuilder to(String to) {
            this.to = to;
            return this;
        }

        FlightLegBuilder delayed(Boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        FlightLeg build() {
            return new FlightLeg(this);
        }
    }
}
