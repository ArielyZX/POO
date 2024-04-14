package POO;
import java.time.LocalDate;

public class Pessoa {
    private LocalDate datual;
    protected String name;
    protected int nascimento;
    public String apelido = "";

    public Pessoa (String name, int nascimento){
        this.name = name;
        this.nascimento = nascimento;
    }
    private int calculaidade() {
        LocalDate datual = LocalDate.now();
        return this.nascimento = (datual.getYear() - nascimento);
    }
    public String saudacao()  {
        return "bom dia, me chamo " + this.name + " mas meu apelido é " + this.apelido + " e eu tenho " + this.calculaidade() + " anos.";
    }
    public static void main(String[] args){
        Pessoa me = new Pessoa("Ariely", 2008);
        me.apelido = "inútil";
        System.out.println(me.saudacao());
    }
    }