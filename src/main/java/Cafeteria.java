public class Cafeteria {

    public String prepararCafe(){
        Cafe cafe = new Cafe();
        return cafe.preparar();
    }

    public String prepararCha(){
        Cha cha = new Cha();
        return cha.preparar();
    }
}
