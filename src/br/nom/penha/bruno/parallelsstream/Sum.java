package br.nom.penha.bruno.parallelsstream;

public class Sum {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        total += input;
    }
}
