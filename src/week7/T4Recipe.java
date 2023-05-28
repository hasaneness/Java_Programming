package week7;

public class T4Recipe {

    String name, ingredients;
    int servingSize;
    double cost;

    public void setInfo(String name, String ingredients, int servingSize, double cost ){
        this.name = name;
        this.ingredients = ingredients;
        this.servingSize = servingSize;
        this.cost = cost;
    }


    public double costPerPerson(){
        return cost/servingSize;
    }

    public String toString() {
        return "Recipe for " + name + " will require these ingredients: \n" +
                ingredients + "\n"+
                "This dish will serve "+ servingSize + " and cost a total of " + cost + " to make.";
    }
}
