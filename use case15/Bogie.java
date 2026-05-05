public class Bogie {
    private String shape;
    private String cargo;

    public Bogie(String shape) {
        this.shape = shape;
        this.cargo = null;
    }

    public void assignCargo(String cargo) {
        if ("Rectangular".equals(this.shape) && "Petroleum".equals(cargo)) {
            throw new CargoSafetyException("Unsafe cargo assignment: Rectangular bogie cannot carry Petroleum");
        }
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }
}
