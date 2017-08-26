package com.safety.kids.school.safekids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void signUpFunction(View view) {
        launchRegistrationActivity();
    }
    private void launchRegistrationActivity() {

        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}
