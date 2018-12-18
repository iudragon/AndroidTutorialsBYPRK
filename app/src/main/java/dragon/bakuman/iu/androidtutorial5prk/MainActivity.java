package dragon.bakuman.iu.androidtutorial5prk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


// CTRL ALT O to remove unwanted imports!

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {

        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);

    }
}
