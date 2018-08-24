package pl.designpatterns.innerClassBuidler;

public class FlightLegInner {
    private String from;
    private String to;
    private Boolean delayed = false;
    private int price;

    private FlightLegInner(FlightLegBuilder builder) {
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

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder from(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to) {
            this.to = to;
            return this;
        }

        FlightLegBuilder delayed(Boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLegInner build() {
            return new FlightLegInner(this);
        }
    }
}
