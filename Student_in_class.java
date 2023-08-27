package Problem_10;

public class Student_in_class {

    private double[] scores;
    private int scoresSize;
    private String studentName;
    public Student_in_class(int scoreCapacity , String name ){
        scores = new double[scoreCapacity];
        scoresSize = 0;
        studentName = name;
    }
    public boolean addScore(double score){
        if(scoresSize < scores.length){
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        }
        else
            return false;
    }
    public double sum(){
        double total = 0;
        for(int i = 0 ; i < scoresSize; i++){
            total = total + scores[i];
        }
        return  total;
    }
    public double minimum(){

        if(scoresSize == 0){
            return 0;
        }
        else {
            double smallest = scores[0];

            for (int i = 1 ; i < scoresSize ; i++){

                if(scores[i] < smallest){
                    smallest = scores[i];
                }
            }
            return smallest;

        }
    }
    public double finalScore(){
        if (scoresSize == 0){
            return 0;
        }
        else if(scoresSize  == 1){
            return scores[0];
        }
        else {
            return sum() - minimum();
        }
    }
    public double getScoreAt(int index){

        return scores[index];
    }
    public  double getScoreCount(){
        return scoresSize;

    }
    public String getName(){
        return studentName;

    }

}
