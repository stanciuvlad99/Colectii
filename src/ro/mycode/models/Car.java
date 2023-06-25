package ro.mycode.models;

public class Car implements Comparable<Car>{

    private int id;
    private String marca;
    public String model;
    private int an;

    public Car(int id, String marca, String model, int an){
        this.id=id;
        this.marca=marca;
        this.model=model;
        this.an=an;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String toString(){
        String text="";
        text+="id " + this.id+"\n";
        text+="marca " + this.marca+"\n";
        text+="model " + this.model+"\n";
        text+="an " + this.an+"\n";
        return text;
    }

    @Override
    public boolean equals(Object object){
        Car o =(Car) object;
        return this.id==o.id && this.marca== o.marca && this.model==o.model && this.an==o.an;
    }

    @Override
    public int compareTo(Car o) {
        if (this.an>o.an){
            return 1;
        }else if (this.an<o.an){
            return -1;
        }
        return 0;
    }
}
