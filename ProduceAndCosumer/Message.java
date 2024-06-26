package ProduceAndCosumer;

public class Message {
    private int id;
    private double data;

    Message(int id,double data){
        this.id = id;
        this.data = data;
    }

    void setId(int id){
        this.id = id;
    }
    void setData(double data){
        this.data = data;
    }
    int getId(){
        return id;
    }
    double getData(){
        return data;
    }

}
