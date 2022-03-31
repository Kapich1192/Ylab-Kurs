package YLab_Tasks_Lection6.Task5;

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private String color;
        public static int countCat = 0;
        //constructors
        public Cat(){
            countCat++;
        }
        public Cat(String name){
            this.name = name;
            countCat++;
        }
        public Cat(String name, int age){
            this.name = name;
            this.age = age;
            countCat++;
        }
        public Cat(String name, int age,int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
            countCat++;
        }
        public Cat(String name, int age, int weight,String color){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
            countCat++;
        }
        //initialize
        public void initialize(String name){
            this.name = name;
        }
        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void initialize(String name, int age,int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public void initialize(String name, int age, int weight,String color){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
        }
        //getters
        public String getName(){return name;}
        public int getAge(){return age;}
        public int getWeight(){return weight;}
        public String getColor(){return color;}
        //setters
        public void setName(String name){this.name = name;}
        public void setAge(int age){this.age = age;}
        public void setWeight(int weight){this.weight = weight;}
        public void setColor(String color){this.color = color;}
        //methods
        @Override
        public String toString(){
            return "name = " + name + ", age = " + age + ", weight = " + weight + ", color = " + color + ";";
        }
        @Override
        protected void finalize() throws Throwable{
            System.out.println(name + " destroyed");
            countCat--;
        }
    }

