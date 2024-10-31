public class Gato extend Animal{
 public Gato(String nombre, int edad){
  super(nombre, edad);
 }

  @Override
  public String hacerSonido(){
   return "El gato maulla"
    }
}
