package bookstore.android.com.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SignUp extends AppCompatActivity {

    private Spinner mSpinner;

    ArrayAdapter<String> mAdapter;

    private Button cancel;
    private Button submit;
    public String[] locations;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        locations=getResources().getStringArray(R.array.location);
        mSpinner=(Spinner)findViewById(R.id.spin);
        mAdapter=new ArrayAdapter<String>(this,R.layout.activity_dropdownview,R.id.drop,locations);
        mSpinner.setAdapter(mAdapter);
        cancel=(Button)findViewById(R.id.signup_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
