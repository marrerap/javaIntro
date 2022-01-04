class car {
    // Sting colour is created to store car colour
    public String colour;
    public car() {};
    // Helper methods to set and get the car colour
    public car(String col) {
        this.colour = col;
    }

    public String getColour() {
        return this.colour;
    }
    
    public static void main(String[] args) {
        car newCar = new car("Pink");
        System.out.print("Car colour is: " + newCar.getColour() + "\n");
        setColourBlue(newCar);
        System.out.print("Car colour is: " + newCar.getColour() + "\n");
    }

    public static void setColourBlue(car c) {
        c.colour = "Blue";
    }
}

