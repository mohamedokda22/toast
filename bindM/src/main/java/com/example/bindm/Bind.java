package com.example.bindm;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Bind {
   public static void toast(Context context,String string){
       Toast.makeText(context.getApplicationContext(),string,Toast.LENGTH_LONG).show();
   }
}
