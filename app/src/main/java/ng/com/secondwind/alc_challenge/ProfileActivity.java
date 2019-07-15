package ng.com.secondwind.alc_challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ProfileActivity.this.setTitle("My Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
