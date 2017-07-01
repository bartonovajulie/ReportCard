package com.example.android.reportcard;

import java.util.ArrayList;

public class ReportCard {

    // mGrades stores subjects grades as integers
    // mSubject stores subjects as Strings
    private ArrayList<Integer> mGrades = new ArrayList<Integer>();
    private ArrayList<String> mSubjects = new ArrayList<String>();

    // mList stores list of subjects and their grades
    private String mList;

    // mGradesAverage stores the subject average
    private double mGradesAverage;

    public ReportCard(Integer englishGrade, Integer historyGrade, Integer mathGrade) {
        mGrades.add(0, englishGrade);
        mGrades.add(1, historyGrade);
        mGrades.add(2, mathGrade);

        mSubjects.add(0, "English");
        mSubjects.add(1, "History");
        mSubjects.add(2, "Math");
    }

    // setters (can be added other by the similar way)
    // setmEnglishGrade sets the grade for English which is in the zero position in the array
    public void setmEnglishGrade(Integer englishGrade) {
        mGrades.set(0, englishGrade);
    }

    // setmHistoryGrade sets the grade for History which is in the first position in the array
    public void setmHistoryGrade(Integer historyGrade) {
        mGrades.set(1, historyGrade);
    }

    // setmMathGrade sets the grade for Math which is in the second position in the array
    public void setmMathGrade(Integer mathGrade) {
        mGrades.set(1, mathGrade);
    }

    // setmList
    public void setmList(String list) {
        mList = list;
    }

    // setmGradesAverage
    public void setmGradesAverage(double average) {
        mGradesAverage = average;
    }

    // getters
    // getmEnglishGrade sets the grade for English which is in the zero position in the array
    public Integer getmEnglishGrade() {
        return mGrades.get(0);
    }

    // getmHistoryGrade sets the grade for English which is in the zero position in the array
    public Integer getmHistoryGrade() {
        return mGrades.get(1);
    }

    // getmMathGrade sets the grade for English which is in the zero position in the array
    public Integer getmMathGrade() {
        return mGrades.get(2);
    }

    // getmList
    public String getmList() {
        return mList;
    }

    // getmGrades returns all grades for all subjects
    public String getmGrades() {
        mList = "";
        for (int i = 0; i < mGrades.size(); i++) {
            mList += mSubjects.get(i) + ": " + mGrades.get(i) + ". ";
        }
        return mList;
    }

    // getmGradesAverage returns the average of all grades of all subjects
    public double getmGradesAverage() {
        for (int i = 0; i < mGrades.size(); i++) {
            int grade = mGrades.get(i);
            mGradesAverage = mGradesAverage + grade;
        }
        return mGradesAverage / mGrades.size();
    }

    @Override
    public String toString() {
        return "Name: John Doe. " + getmGrades() + "The average: " + getmGradesAverage() + ".";
        // e.g.: "Name: John Doe. English: 2. History: 2. Math: 2. The average: 2.0."
    }
}
