public abstract class Person {

   private String name;  //Persons første navn

   public Person (String name ){
       this.name = name;
   }

   public String getName() {

       return name;
   }

   public void setName(String name) { //Persons nye navn
       this.name = name;

   }

   //Metodesignaturen:
   public abstract boolean addCourse (String course);

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
