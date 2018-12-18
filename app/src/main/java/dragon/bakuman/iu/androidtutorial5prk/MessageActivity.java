package dragon.bakuman.iu.androidtutorial5prk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //get the intent that started this activity
        Intent intent = getIntent();

        //now fetch the extra message from the intent
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        //now display this message on TextView
        TextView textView = findViewById(R.id.display_message);
        textView.setText(message);
    }



}
