package com.thoriqq.ETSGAIS;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HalamanTentangActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.halamanutama){
            startActivity(new Intent(this, HalamanUtamaActivity.class));
        } else if (item.getItemId() == R.id.halamandetail) {
            startActivity(new Intent(this, HalamanDetailActivity.class));
        }
        return true;//super.onOptionsItemSelected(item);

    }
}
