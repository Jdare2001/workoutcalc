public class Exercise {
    private String Name;
    private int defaultWeight;
    private int percentOfOneRepMax;
    private int reps;
    public Exercise(String name,int baseWeight,int theReps, int thePercentOfOneRepMax){
        Name = name;
        defaultWeight = baseWeight;
        reps = theReps;
        percentOfOneRepMax = thePercentOfOneRepMax;
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

    public int getPercentOfOneRepMax() {
        return percentOfOneRepMax;
    }

    public int getReps() {
        return reps;
    }
}
