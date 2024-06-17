public class Contador {
    private int n1;
    private int n2;

    public Contador(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Contador() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void cont()
    {
        if(n1 > n2)
            ParamentroInvalido();
        else {
            for(int i =0 ; i< n2;i++)
                System.out.println("Imprimindo o numero "+i);
        }
    }

    private void ParamentroInvalido() {
        System.out.println("O segundo parametro deve ser maior que o Primeiro!!!");
    }
}
