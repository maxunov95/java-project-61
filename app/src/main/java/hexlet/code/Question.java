package hexlet.code;

public class Question {
    private final String sample;
    private final String correctAnswer;

    public Question(String sample, String correctAnswer) {
        this.sample = sample;
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void ask() {
        System.out.printf("Question: %s%nYour answer: ", sample);
    }

    public boolean userAnswerIsCorrect(String userAnswer, String userName) {
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%nLet's try again, %s!%n",
                    userAnswer, correctAnswer, userName);
            return false;
        }
    }
}
