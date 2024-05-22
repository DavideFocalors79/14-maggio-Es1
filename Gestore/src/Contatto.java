enum tipoContratto{abitazione,cellulare,aziendale};

public class Contatto {
    public String nome;
    public String cognome;
    public String telefono;
    public tipoContratto tipo;
    public double saldo;
    public boolean nascosto;

    public String stampa()
    {
        return String.format("Nome: %s Cognome: %s Telefono: %s, tipo: %s, saldo: %s", nome, cognome, telefono, tipo.toString(), saldo);
    }
    @Override
    public String toString()
    {
        return String.format("%s,%s,%s,%s", nome, cognome, telefono, tipo.toString());
    }
}