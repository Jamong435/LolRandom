package com.example.lolrandom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] images = new int[] {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,
            R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,
            R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25,R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,
            R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35,R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,
            R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45,R.drawable.a46,R.drawable.a47,R.drawable.a48,R.drawable.a49,R.drawable.a50,
            R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55,R.drawable.a56,R.drawable.a57,R.drawable.a58,R.drawable.a59,R.drawable.a60,
            R.drawable.a61, R.drawable.a62, R.drawable.a63, R.drawable.a64, R.drawable.a65,R.drawable.a66,R.drawable.a67,R.drawable.a68,R.drawable.a69,R.drawable.a70,
            R.drawable.a71, R.drawable.a72, R.drawable.a73, R.drawable.a74, R.drawable.a75,R.drawable.a76,R.drawable.a77,R.drawable.a78,R.drawable.a79,R.drawable.a80,
            R.drawable.a81, R.drawable.a82, R.drawable.a83, R.drawable.a84, R.drawable.a85,R.drawable.a86,R.drawable.a87,R.drawable.a88,R.drawable.a89,R.drawable.a90,
            R.drawable.a91, R.drawable.a92, R.drawable.a93, R.drawable.a94, R.drawable.a95,R.drawable.a96,R.drawable.a97,R.drawable.a98,R.drawable.a99,R.drawable.a100,
            R.drawable.a101, R.drawable.a102, R.drawable.a103, R.drawable.a104, R.drawable.a105,R.drawable.a106,R.drawable.a107,R.drawable.a108,R.drawable.a109,R.drawable.a110,
            R.drawable.a111, R.drawable.a112, R.drawable.a113, R.drawable.a114, R.drawable.a115,R.drawable.a116,R.drawable.a117,R.drawable.a118,R.drawable.a119,R.drawable.a120,
            R.drawable.a121, R.drawable.a122, R.drawable.a123, R.drawable.a124, R.drawable.a125,R.drawable.a126,R.drawable.a127,R.drawable.a128,R.drawable.a129,R.drawable.a130,
            R.drawable.a131, R.drawable.a132, R.drawable.a133, R.drawable.a134, R.drawable.a135,R.drawable.a136,R.drawable.a137,R.drawable.a138,R.drawable.a139,R.drawable.a140,
            R.drawable.a141, R.drawable.a142, R.drawable.a143, R.drawable.a144, R.drawable.a145,R.drawable.a146,R.drawable.a147,R.drawable.a148,R.drawable.a149,R.drawable.a150,
            R.drawable.a151, R.drawable.a152, R.drawable.a153, R.drawable.a154, R.drawable.a155    };

    NavigationView navigationView;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.nav);
        tv= findViewById(R.id.text);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id){
                    case R.id.menu_gallery:
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                        break;

                }
                return false;
            }

        });

    }

    public void btnclick(View view) {
        ImageView mImageView = (ImageView)findViewById(R.id.lol);
        int imageId = (int)(Math.random() * images.length);
        mImageView.setBackgroundResource(images[imageId]);

        Log.v("태그",""+imageId);

    }



}