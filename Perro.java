public class Perro extend Animal{
 public Perro(String nombre, int edad){
  super(nombre, edad);
 }

  @Override
  public String hacerSonido(){
    return "El perro ladra"
    }
}
