package com.chelimo.A08mySet;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int chineseScore;
    private int mathScore;
    private int englishScore;
    int score = chineseScore+mathScore+englishScore;

    public Student2() {
    }

    public Student2(String name, int age, int chineseScore, int mathScore, int englishScore, int score) {
        this.name = name;
        this.age = age;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.score = score;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chineseScore
     */
    public int getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     * @param chineseScore
     */
    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    /**
     * 获取
     * @return mathScore
     */
    public int getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     * @param mathScore
     */
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    /**
     * 获取
     * @return englishScore
     */
    public int getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     * @param englishScore
     */
    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    /**
     * 获取
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chineseScore = " + chineseScore + ", mathScore = " + mathScore + ", englishScore = " + englishScore + ", score = " + score + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        //最简洁
        int i = this.score - o.score;
        i = i == 0 ?this.chineseScore - o.chineseScore :i;
        i = i == 0 ?this.mathScore - o.mathScore:i;
        i = i == 0 ?this.englishScore - o.englishScore:i;
        i = i == 0 ?this.age - o.age:i;
        i = i == 0 ?this.name.compareTo(o.name):i;
        return i;
    }


//    @Override
//    public int compareTo(Student2 o) {
//        if(this.score == o.score){
//            if(this.chineseScore == o.chineseScore){
//                if(this.mathScore == o.mathScore){
//                    if(this.englishScore == o.englishScore){
//                        if(this.age == o.age){
//                            if(this.name.equals(o.name)){
//                                return 0;
//                            }
//                        }else{
//                            return o.age-this.age;
//                        }
//                    }else{
//                        return  o.englishScore-this.englishScore;
//                    }
//                }else{
//                    return o.mathScore-this.mathScore ;
//                }
//            }else {
//                return o.chineseScore-this.chineseScore ;
//            }
//        }else{
//            return o.score-this.score;
//        }
//        return 0;
//    }
}
