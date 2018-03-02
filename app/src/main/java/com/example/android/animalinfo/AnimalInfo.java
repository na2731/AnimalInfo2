package com.example.android.animalinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnimalInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);

        Intent i = getIntent();
        Animal a = (Animal) i.getSerializableExtra("MyClass");


        display(a);
    }

    public void display(Animal a) {
        TextView ReSult = (TextView) findViewById(R.id.result);

        if (a.getAttribute1() && !a.getAttribute2()) {
            ReSult.setText(Keys.ANINAME + a.getName() + '\n' + Keys.NUM + a.getLegs() + '\n' + Keys.FUR + a.getFur() + '\n' + Keys.ATTRIBUTE + "Carnivores" + '\n' + Keys.ADD + a.getInfo());
        } else if (!a.getAttribute1() && a.getAttribute2()) {
            ReSult.setText(Keys.ANINAME + a.getName() + '\n' + Keys.NUM + a.getLegs() + '\n' + Keys.FUR + a.getFur() + '\n' + Keys.ATTRIBUTE + "Herbivores" + '\n' + Keys.ADD + a.getInfo());
        } else {
            ReSult.setText(Keys.ANINAME + a.getName() + '\n' + Keys.NUM + a.getLegs() + '\n' + Keys.FUR + a.getFur() + '\n' + Keys.ATTRIBUTE + " You don't eat??" + '\n' + Keys.ADD + a.getInfo());
        }
    }


}
