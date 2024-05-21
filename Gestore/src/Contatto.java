enum tipoContratto{abitazione,cellulare,aziendale};

public class Contatto {
    public String nome;
    public String cognome;
    public String telefono;
    public tipoContratto tipo;
    public double saldo;
    public boolean nascosto;
    /*public Contatto(String nome, String cognome) {
        this.nome=nome;
        this.ricarica=10;
    }
    public String getNome(){
        return this.nome.toUpperCase();
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }*/

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