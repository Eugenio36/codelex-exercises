package io.codelex.oopExercises.LazyBox;

public class MainProgram {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(MainProgram::doLargeCalculation);

        LazyBox<String> textBox = box.map(Object::toString);
        LazyBox<String> upperTextBox = textBox.map(String::toUpperCase);
        LazyBox<String> fullTextBox = textBox.map((String s) -> "Result is " + s);

        String result2 = fullTextBox.get();
        System.out.println(result2);
    }

    public static Integer doLargeCalculation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return 153;
    }

    public static <A> void printOutBoxContents(LazyBox<A> box) {
        System.out.println(box.get());
    }


}
