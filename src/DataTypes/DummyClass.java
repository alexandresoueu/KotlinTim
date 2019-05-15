package DataTypes;

public class DummyClass {
    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on Vacation" : "I'm working.....";
    }

    public void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
