public Zoologico() {
        animales = new ArrayList<>();
        conteoPorTipo = new HashMap<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarSonidos() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + ": " + animal.hacerSonido());
        }
    public void mostrarConteoPorTipo(){
        "Gato: " + conteoPorTipo.get("Gato") + "\n"
        "Perro: " + conteoPorTipo.get("Perro") +"
            }
        
    }
}
