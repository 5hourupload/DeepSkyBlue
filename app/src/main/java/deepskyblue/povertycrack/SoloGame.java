package deepskyblue.povertycrack;

import android.content.Intent;
import android.widget.TextView;

public class SoloGame extends MainActivity {
    private void startSolo(){
        
    }

    private void highLow(String Question, String Answer){
        TextView Q = findViewById(R.id.questionBox);
        String test = "";
        Q.setText(test);
    }

    private void checkAll(String question, String Answer){
        TextView Q = findViewById(R.id.questionBox);
        String Answers [] = Answer.split(";");

    }

    private void multipleChoice(String question, String answer){
        TextView Q = findViewById(R.id.questionText);
        Q.setText(question);

    }

    private void slider(String Question, String Answer) {
        TextView Q = findViewById(R.id.questionText);
        Q.setText(Question);
    }
}
