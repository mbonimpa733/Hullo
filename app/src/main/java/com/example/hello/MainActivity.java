package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.button6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Pearlz_app.class);
                startActivity(intent);
            }
        });
    }

    public void sendMessage(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        Toast.makeText(this, "Sending message " + message.getText().toString(),
                Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("Message", message.getText().toString());
        startActivity(intent);

        message.setText("");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.talking:
                startActivity(new Intent(this,Timothyz_app.class));
                return true;

            case R.id.Toms:
                startActivity(new Intent(this,Shalomz_app.class));
                return true;
                 default:
                     return true;

        }

    }
}
