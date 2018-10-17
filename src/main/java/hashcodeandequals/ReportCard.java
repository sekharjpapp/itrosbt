package hashcodeandequals;

import java.util.Objects;

public class ReportCard {

    private int mathscore;

    public ReportCard(){
        this.mathscore=(int)((Math.random()*101)+1);
    }
    public int getMathscore() {
        return mathscore;
    }

    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportCard that = (ReportCard) o;
        return mathscore == that.mathscore;
    }

    @Override
    public int hashCode() {

        return Objects.hash(mathscore);
    }
}
