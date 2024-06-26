public class Vertex{
    private String name;
    private boolean isVisited;
    public Vertex(String name){
        this.name = name;
        this.isVisited = false;
    }
    public String getName(){
        return name;
    }
    public boolean getIsVisited(){
        return isVisited;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIsVisited(boolean isVisited){
        this.isVisited = isVisited;
    }
}