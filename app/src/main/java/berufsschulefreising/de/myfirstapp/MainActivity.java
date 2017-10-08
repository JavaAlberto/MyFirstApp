package berufsschulefreising.de.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("Test");
        System.out.print("Test");
        Toast.makeText(this,"oncreate gestartet", Toast.LENGTH_LONG).show();
    }
}
