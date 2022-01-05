public class constructor {

    private String model;
    private int horsepower;


    public constructor(String m, int h) {
        this.model = m;
        this.horsepower = h;
    }

    public void showDetails() {
        System.out.println("Car horsepower is: " + this.horsepower);
        System.out.println("Car model is: " + this.model);
    }

    class check {
        public void main(String[] args) {
            
        constructor newCar = new constructor("New", 1000);

        newCar.showDetails();
        }
    }

}
