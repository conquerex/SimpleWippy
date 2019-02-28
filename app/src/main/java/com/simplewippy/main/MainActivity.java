package com.simplewippy.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.simplewippy.R;
import com.simplewippy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    private long backKeyPressedTime = 0;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.mainToolbar.setElevation(0);

        binding.imageMainBack.setOnClickListener(this);
        binding.textMainBack.setOnClickListener(this);
        binding.buttonMainBad.setOnClickListener(this);
        binding.buttonMainGood.setOnClickListener(this);
        binding.imageMainReport.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == binding.imageMainBack || view == binding.textMainBack) {
            onBackPressed();
            return;
        }

        // Show a toast after Onclick event
        if (toast != null) {
            toast.cancel();
        }

        if (view == binding.buttonMainBad) {
            toast = Toast.makeText(getApplicationContext(), "그럼 손종국을 만나보세요.", Toast.LENGTH_SHORT);
        }

        if (view == binding.buttonMainGood) {
            toast = Toast.makeText(getApplicationContext(), "손종국도 괜찮답니다.", Toast.LENGTH_SHORT);
        }

        if (view == binding.imageMainReport) {
            toast = Toast.makeText(getApplicationContext(), "알림 서비스는 준비중입니다.", Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            toast = Toast.makeText(getApplicationContext(), "Back 버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            finish();
            toast.cancel();
        }
    }
}
