package ro.mycode.models;

public class Person implements Comparable<Person>{

    private int id;
    private String nume;
    private int varsta;
    private String localitate;

    public Person(int id, String nume, int varsta, String localitate){
        this.id=id;
        this.nume=nume;
        this.varsta=varsta;
        this.localitate=localitate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    @Override
    public String toString(){
        String text="";
        text+="id " + this.id + "\n";
        text+="nume " + this.nume+ "\n";
        text+="varsta "+ this.varsta + "\n";
        text+="localitate " + this.localitate+"\n";
        return text;
    }

    @Override
    public boolean equals(Object object){
        Person o =(Person) object;
        return this.id==o.id && this.nume==o.nume && this.varsta==o.varsta && this.localitate==o.localitate;
    }


    @Override
    public int compareTo(Person o){
       if (this.varsta>o.varsta){
           return 1;
       }else if (this.varsta<o.varsta){
           return -1;
       }
       return 0;
    }
}
