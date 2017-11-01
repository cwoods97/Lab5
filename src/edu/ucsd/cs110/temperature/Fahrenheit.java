package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t){
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float c = (this.getValue() - 32) * 5 / 9;
        return new Celsius(c);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString(){
        return this.getValue() + " F";
    }
}
