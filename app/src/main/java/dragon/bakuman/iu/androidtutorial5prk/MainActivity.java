package dragon.bakuman.iu.androidtutorial5prk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


// CTRL ALT O to remove unwanted imports!

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        //send a string to another activity.
        //find editText widget by finViewById
        EditText editText  = findViewById(R.id.user_message);

        //store whats in the editText in the String "message"
        String message = editText.getText().toString();

        Intent intent = new Intent(this, MessageActivity.class);

        //put the "message" in the intent
        //CTRL + P shortcut to view Parameter for method
        intent.putExtra("EXTRA_MESSAGE", message);

        startActivity(intent);

    }
}
