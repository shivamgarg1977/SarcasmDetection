package com.shivamgarg.sarcasmdetection.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.shivamgarg.sarcasmdetection.R;

public class DashBoard extends AppCompatActivity {

    CardView navigationBanner;
    CardView imageBottomDrawerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Log.d("Successfully Created", "DashBoard: running");
        navigationBanner = findViewById(R.id.navigation_banner);
        imageBottomDrawerButton = findViewById(R.id.image_recognition);


        imageBottomDrawerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomDialog();
            }
        });

    }

    public void showBottomDialog() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_image_recoginition);

        LinearLayout imageFromGallery = bottomSheetDialog.findViewById(R.id.select_from_gallery);
        LinearLayout imageFromCamera = bottomSheetDialog.findViewById(R.id.select_from_camera);
        imageFromCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashBoard.this, CameraActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
        bottomSheetDialog.show();
    }
}