package org.example;
import java.util.List;

public class Museum {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> visitorRatings;
    public Museum(int id, String name, String city, int stars, List<Integer> visitorRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        setStars(stars);
        this.visitorRatings = visitorRatings;
    }
    public double getAverageRating() {
        if (visitorRatings == null || visitorRatings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : visitorRatings) {
            sum += rating;
        }
        return (double) sum / visitorRatings.size();
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public List<Integer> getVisitorRatings() {
        return visitorRatings;
    }
    @Override
    public String toString() {
        return String.format("ID: %d | '%s' (%s) | Звездность: %d | Оценки: %s | Средний балл: %.2f",
                id, getName(), getCity(), getStars(), getVisitorRatings(), getAverageRating());
    }
}
