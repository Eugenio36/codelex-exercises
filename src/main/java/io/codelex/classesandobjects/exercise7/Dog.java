package io.codelex.classesandobjects.exercise7;

public class Dog {
    private String name;
    private Sex sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, Sex sex, Dog mother, Dog father) {
        this.name = name;
        this.sex = sex;
        assignParents(mother, father);
    }

    public void assignParents(Dog mother, Dog father) {
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father != null) {
            return father.name;
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.mother != null) {
            return this.mother.equals(otherDog.mother);
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return name + ", " + sex + ". ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
