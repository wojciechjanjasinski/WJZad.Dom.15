package CompetitionResults;

import java.util.Objects;

public class PlayerResultInfo implements Comparable<PlayerResultInfo> {
    private String sportDiscipline;
    private String firstName;
    private String lastName;
    private double score;

    public PlayerResultInfo(String sportDiscipline, String firstName, String lastName, double score) {
        this.sportDiscipline = sportDiscipline;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getSportDiscipline() {
        return sportDiscipline;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getScore() {
        return score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerResultInfo that = (PlayerResultInfo) o;
        return Double.compare(that.score, score) == 0 &&
                sportDiscipline.equals(that.sportDiscipline) &&
                firstName.equals(that.firstName) &&
                lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sportDiscipline, firstName, lastName, score);
    }

    @Override
    public String toString() {
        return "PlayerResultInfo{" +
                "sportDiscipline='" + sportDiscipline + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(PlayerResultInfo o) {
        if (this.score > o.score)
            return 1;
        else if (Double.compare(this.score, o.score) == 0) {
            return this.lastName.compareTo(o.lastName);
        } else
            return -1;
    }
}
