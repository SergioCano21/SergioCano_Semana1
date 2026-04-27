class Moto extends Vehiculo {
  private int cilindrada;

  public Moto(String marca, String modelo, int anio, int cilindrada) {
    super(marca, modelo, anio);
    this.cilindrada = cilindrada;
  }

  @Override
  public String tipoVehiculo() {
    return "Moto";
  }

  @Override
  public void arrancar() {
    System.out.println(
        "  La moto " + this.marca + " " + this.modelo + " ruge con " + this.cilindrada + "cc...");
  }

  @Override
  public void detener() {
    System.out.println("  La moto " + this.marca + " " + this.modelo + " se detiene.");
  }

  @Override
  public String toString() {
    return info() + " - " + this.cilindrada + "cc";
  }
}
