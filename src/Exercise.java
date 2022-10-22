public class Exercise {
    private String Name;
    private int defaultWeight;
    public Exercise(String name,int baseWeight){
        Name = name;
        defaultWeight = baseWeight;
    }

    public String getName() {
        return Name;
    }

    public int getDefaultWeight() {
        return defaultWeight;
    }

    public void setDefaultWeight(int defaultWeight) {
        this.defaultWeight = defaultWeight;
    }
}
