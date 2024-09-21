public abstract class Burner{
private double diameter, maxTemp, minTemp;
private boolean isHot;


public burner(double diameter, double maxTemp, double minTemp){
    this.diameter = diameter;
    this.maxTemp = maxTemp;
    this.minTemp = minTemp;
    this.isHot = false;
}

public abstract boolean turnOn();
public abstract boolean turnOff();
public abstract void increaseTemp();
public abstract void decreaseTemp();
public double getDiameter(){
    reutrn diameter;
}
public double getMaxTemp(){
    return maxTemp;
}
public double getMinTemp(){
    return minTmep;
}

public boolean isHot(){
    return isHot;
}



}