package bubbleSort;

public class Car {
    private String carType;
    private int productionYear;
    private int drivenKilomenter;

    public Car(String carType, int productionYear, int drivenKilomenter) {
        this.carType = carType;
        this.productionYear = productionYear;
        this.drivenKilomenter = drivenKilomenter;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getDrivenKilomenter() {
        return drivenKilomenter;
    }

    public void setDrivenKilomenter(int drivenKilomenter) {
        this.drivenKilomenter = drivenKilomenter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                ", drivenKilomenter=" + drivenKilomenter +
                '}';
    }
}
