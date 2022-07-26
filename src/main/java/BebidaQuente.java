public abstract class BebidaQuente {

    public final String preparar(){
        String saida = new String();
        saida = esquentarAgua();
        saida = saida + mistura();
        saida = saida + colocarEmCopo();
        saida = saida + addCondimentos();
        return saida;
    }

    public String esquentarAgua(){
        return "Esquentando água ";
    }
    public abstract String mistura();

    public String colocarEmCopo(){
        return "Colocando no copo ";
    }

    public abstract String addCondimentos();
}
