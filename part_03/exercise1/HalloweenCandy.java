package part_03.exercise1;


    public class HalloweenCandy {

        private String name;
        private boolean hasNuts;
        private int rating;

        public HalloweenCandy(String name, boolean hasNuts, int rating) {
            this.name = name;
            this.hasNuts = hasNuts;
            this.rating = rating;
        }
        String getName(){
            return name;
        }
    }
