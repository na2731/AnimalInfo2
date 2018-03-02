package com.example.android.animalinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Button1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = getIntent();
//        Animal a = (Animal)intent.getSerializableExtra(Keys);
    }

//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.one:
//                if (checked)
//                    // Pirates are the best
//                    break;
//            case R.id.two:
//                if (checked)
//                    // Ninjas rule
//                    break;
//            case R.id.three:
//                if(checked)
//                    break;
//        }
//    }

    public void openSecActivity(View view){
//        System.out.print("enter");
        Intent i=new Intent(this,AnimalInfo.class);

        //i.putExtra(Keys.ANINAME, "animal name: ");
        EditText edit = (EditText)findViewById(R.id.aniName);
        String name = edit.getText().toString();

        //i.putExtra(Keys.NUM, "legs number: ");
        EditText edit2 = (EditText)findViewById(R.id.legs);
        int num = Integer.parseInt(edit2.getText().toString());

        //i.putExtra(Keys.FUR, "fur?: ");
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        boolean hascheckBox = checkBox.isChecked();


        //i.putExtra(Keys.ATTRIBUTE,"Meat or Herb?");
        RadioButton radioButton=(RadioButton)findViewById(R.id.one);
        //boolean isMeat=radioButton.isSelected();
        boolean isMeat = radioButton.isChecked();

        //i.putExtra(Keys.ATTRIBUTE,"Meat or Herb?");
        RadioButton radioButton2=(RadioButton)findViewById(R.id.two);
        //boolean isHerb=radioButton2.isSelected();
        boolean isHerb = radioButton2.isChecked();


        //i.putExtra(Keys.ATTRIBUTE, "addition info: ");
        EditText edit3 = (EditText)findViewById(R.id.moreInfo);
        String info = edit3.getText().toString();

        Animal a = new Animal(name, num, hascheckBox, isMeat, isHerb, info);

        i.putExtra("MyClass", a);




//        Animal a = new Animal(name, num, hascheckBox, info);
//        i.putExtra(Keys.ANIMAL)
        //i.putExtra(Keys., a);





//        EditText edit = (EditText)findViewById(R.id.aniName);
//        String name = edit.getText().toString();
//        i.putExtra(Keys.ANINAME, name);
//        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
//        boolean hascheckBox = checkBox.isChecked();
//        i.putExtra(Keys.FUR, hascheckBox);

//        EditText edit2 = (EditText)findViewById(R.id.legs);
//        int num = Integer.parseInt(edit2.getText().toString());
//        i.putExtra(Keys.NUM, num);

//        EditText edit3 = (EditText)findViewById(R.id.moreInfo);
//        String info = edit3.getText().toString();
//        i.putExtra(Keys.ADD, info);



        startActivity(i);
    }

//    public void AnotherActivity(View view) {
//        Intent i=new Intent(this,AnimalInfo.class);
//        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
//        boolean hascheckBox = checkBox.isChecked();
//
//        if (!hascheckBox) {
//            CheckBox box = (CheckBox)findViewById(R.id.checkBox);
//            boolean value = box.isChecked();
//            i.putExtra(Keys.FUR, value);
//        }
//    }

//    public class Animal implements Serializable {
//        private String name;
//        private int legs;
//        private boolean Fur;
//        private String info;
//
//        public Animal(String name, int legs, boolean Fur, String info){
//            this.name=name;
//            this.legs=legs;
//            this.Fur=Fur;
//            this.info=info;
//        }
//
//
//        public String getName(){
//            return name;
//        }
//
//        public int getLegs(){
//            return legs;
//        }
//
//        public boolean getFur(){
//            return Fur;
//        }
//    }
}
