package GradesAvarageSystem;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> subject;
    private ArrayList<Integer> grade;

    // erstellt bei der der erzeugten Klasse Arraylist für subjekt & grade
    public Student(String name){
        this.name = name;
        subject = new ArrayList<String>();
        grade = new ArrayList<>();
    }

    public String getName (){
        return name;
    }

    public void add(String s, int g){
        subject.add(s);
        grade.add(g);
    }

    public ArrayList<String> getSubject(){
        return subject;
    }

    // Notendurchschnitt
    public double getAvarage(){
        double sum = 0;

        for (int i=0; i < grade.size(); i++){
            sum += grade.get(i);
        }
        return  ( sum / grade.size());
    }

    public int getMedian(ArrayList<Integer> noten){
        bubbleSort(noten);
        return noten.get(noten.size()/2);
    }

    // Hilfsmethode
    private void bubbleSort(ArrayList<Integer> noten){
        for (int i = 0; i < noten.size(); i++){
            for (int k = 0; k < noten.size(); k++){
                if (noten.get(k) > noten.get(k+1)){

                    int temp = noten.get(k);
                    //noten.get(k) = noten.get(k+1);
                    noten.set(k,noten.get(k+1));

                    //noten.get(k+1) = temp;
                    noten.set(k+1,temp);
                }
            }
        }
    }


}

