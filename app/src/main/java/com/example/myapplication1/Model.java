package com.example.myapplication1;

import java.util.Objects;

public class Model {
    private double lat;
    private double lon;

    public Model(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Double.compare(model.lat, lat) == 0 &&
                Double.compare(model.lon, lon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon);
    }

    @Override
    public String toString() {
        return "Model{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
