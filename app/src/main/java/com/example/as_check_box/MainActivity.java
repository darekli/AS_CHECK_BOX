package com.example.as_check_box;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity
      extends AppCompatActivity {
        CheckBox pb,diesel,lng, cng, lpg;
        Button buttonOrder;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            addListenerOnButtonClick();
        }
        public void addListenerOnButtonClick(){
            //Getting instance of CheckBoxes and Button from the activty_main.xml file
            pb=(CheckBox)findViewById(R.id.checkBoxPb);
            diesel=(CheckBox)findViewById(R.id.checkBoxDiesel);
            lng=(CheckBox)findViewById(R.id.checkBoxLNG);
            cng=(CheckBox)findViewById(R.id.checkBoxCNG);
            lpg=(CheckBox)findViewById(R.id.checkBoxLPG);

            buttonOrder=(Button)findViewById(R.id.button);

            //Applying the Listener on the Button click
            buttonOrder.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    String totalamount="";
                    StringBuilder result=new StringBuilder();
                    result.append("Selected Items:");
                    if(pb.isChecked()){
                        result.append("\npetrol");
                        totalamount+="pb";
                    }
                    if(diesel.isChecked()){
                        result.append("\ndiesel");
                        totalamount+="diesel";
                    }
                    if(lng.isChecked()){
                        result.append("\nLNG");
                        totalamount+="lng";
                    }
                    if(cng.isChecked()){
                        result.append("\nCNG");
                        totalamount+="cng";
                    }
                    if(lpg.isChecked()){
                        result.append("\nLPG");
                        totalamount+="lpg";
                    }
                    result.append("\nFuel: "+totalamount+"");
                    //Displaying the message on the toast
                    Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
                }

            });
        }

}
