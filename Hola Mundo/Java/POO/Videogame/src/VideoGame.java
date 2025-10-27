public class VideoGame {
    String name;
    Double price;
    static String categories[] = {"action" , "rpg", "adventure", "racing"};
    String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        boolean isInList = false;

        for(String c: VideoGame.categories){
            if (c.equals(category)) {
                isInList = true;
                break;
            }
        }

        if (isInList) {
            this.category = category;
        } else {
            System.out.println("No está :(");
        }

    }
}
