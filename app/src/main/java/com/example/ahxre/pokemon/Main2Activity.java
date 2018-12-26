package com.example.ahxre.pokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView story,one,two;int i;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.textView);
        TextView story = (TextView)findViewById(R.id.story);

        textView.setText(getIntent().getStringExtra("Country"));
        name = getIntent().getStringExtra("Country");
        imageView.setImageResource(getIntent().getIntExtra("Flag",R.drawable.pm001));
        Intent it = getIntent();
        String s = it.getStringExtra("story");story.setText(s);
        int v = it.getIntExtra("at",0); int g = it.getIntExtra("at2",0);
        int position = it.getIntExtra("position",0);
        if(position == 0)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(View.VISIBLE);
            findViewById(R.id.po).setVisibility(View.VISIBLE);

        }
        if(position == 1)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 2)
        {
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
            i = position;
        }
        if(position == 3)
        {
            findViewById(R.id.fire).setVisibility(v);
            i = position;
        }
        if(position == 4)
        {
            findViewById(R.id.fire).setVisibility(v);
            i = position;
        }
        if(position == 5)
        {
            findViewById(R.id.fire).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
            i = position;
        }
        if(position == 6)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 7)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);

        }
        if(position == 8)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 9)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);

        }
        if(position == 10)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
        }
        if(position == 11)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 12)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 13)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 14)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 15)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 16)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 17)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 18)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);

        }
        if(position == 19)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);

        }
        if(position == 20)
        {
            i = position;
            findViewById(R.id.fly).setVisibility(v);
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 21)
        {
            i = position;
            findViewById(R.id.fly).setVisibility(v);
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 22)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 23)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 24)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);
        }
        if(position == 25)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);
        }
        if(position == 26)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 27)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 28)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 29)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 30)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 31)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 32)
        {
            i = position;

            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 33)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 34)
        {
            i = position;
            findViewById(R.id.fairy).setVisibility(v);

        }
        if(position == 35)
        {
            i = position;
            findViewById(R.id.fairy).setVisibility(v);
        }
        if(position == 36)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 37)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 38)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fairy).setVisibility(v);
        }
        if(position == 39)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fairy).setVisibility(v);
        }
        if(position == 40)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 41)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 42)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 43)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 44)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 45)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.grass).setVisibility(v);
        }
        if(position == 46)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.grass).setVisibility(v);
        }
        if(position == 47)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 48)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 49)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 50)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 51)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 52)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 53)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 54)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 55)
        {
            i = position;
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 56)
        {

            i = position;
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 57)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 58)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 59)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 60)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 61)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 62)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 63)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 64)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);

        }
        if(position == 65)
        {
            i = position;
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 66)
        {
            i = position;
            findViewById(R.id.fight).setVisibility(v);

        }
        if(position == 67)
        {
            i = position;
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 68)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 69)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 70)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 71)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 72)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 73)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.rock).setVisibility(v);
        }
        if(position == 74)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.rock).setVisibility(v);
        }
        if(position == 75)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.rock).setVisibility(v);
        }
        if(position == 76)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);

        }
        if(position == 77)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 78)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 79)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 80)
        {
            i = position;
            findViewById(R.id.gun).setVisibility(v);
            findViewById(R.id.elec).setVisibility(v);
        }
        if(position == 81)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);
            findViewById(R.id.gun).setVisibility(v);
        }
        if(position == 82)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 83)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 84)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 85)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 86)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.ice).setVisibility(v);
        }
        if(position == 87)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 88)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 89)
        {
            i = position;

            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 90)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.ice).setVisibility(v);
        }
        if(position == 91)
        {
            i = position;
            findViewById(R.id.ghost).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 92)
        {
            i = position;
            findViewById(R.id.ghost).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 93)
        {
            i = position;
            findViewById(R.id.ghost).setVisibility(v);
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 94)
        {
            i = position;
            findViewById(R.id.rock).setVisibility(v);
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 95)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 96)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 97)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 98)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 99)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);
        }
        if(position == 100)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);

        }
        if(position == 101)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 102)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
            findViewById(R.id.grass).setVisibility(v);
        }
        if(position == 103)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 104)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
        }
        if(position == 105)
        {
            i = position;
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 106)
        {
            i = position;
            findViewById(R.id.fight).setVisibility(v);
        }
        if(position == 107)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 108)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 109)
        {
            i = position;
            findViewById(R.id.po).setVisibility(v);
        }
        if(position == 110)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.rock).setVisibility(v);
        }
        if(position == 111)
        {
            i = position;
            findViewById(R.id.gnd).setVisibility(v);
            findViewById(R.id.rock).setVisibility(v);
        }
        if(position == 112)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 113)
        {
            i = position;
            findViewById(R.id.grass).setVisibility(v);
        }
        if(position == 114)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);

        }
        if(position == 115)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 116)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 117)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 118)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 119)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 120)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 121)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
            findViewById(R.id.fairy).setVisibility(v);

        }
        if(position == 122)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 123)
        {
            i = position;
            findViewById(R.id.ice).setVisibility(v);
            findViewById(R.id.sup).setVisibility(v);

        }
        if(position == 124)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);
        }
        if(position == 125)
        {
            i = position;

            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 126)
        {
            i = position;
            findViewById(R.id.worm).setVisibility(v);

        }
        if(position == 127)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);

        }
        if(position == 128)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);

        }
        if(position == 129)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 130)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);
            findViewById(R.id.ice).setVisibility(v);
        }
        if(position == 131)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 132)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);

        }
        if(position == 133)
        {
            i = position;
            findViewById(R.id.water).setVisibility(v);

        }
        if(position == 134)
        {
            i = position;
            findViewById(R.id.elec).setVisibility(v);

        }
        if(position == 135)
        {
            i = position;
            findViewById(R.id.fire).setVisibility(v);

        }
        if(position == 136)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 137)
        {
            i = position;
            findViewById(R.id.rock).setVisibility(v);
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 138)
        {
            i = position;
            findViewById(R.id.rock).setVisibility(v);
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 139)
        {
            i = position;
            findViewById(R.id.rock).setVisibility(v);
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 140)
        {
            i = position;
            findViewById(R.id.rock).setVisibility(v);
            findViewById(R.id.water).setVisibility(v);
        }
        if(position == 141)
        {
            i = position;
            findViewById(R.id.rock).setVisibility(v);
            findViewById(R.id.fly).setVisibility(v);
        }
        if(position == 142)
        {
            i = position;
            findViewById(R.id.normal).setVisibility(v);
        }
        if(position == 143)
        {
            i = position;
            findViewById(R.id.fly).setVisibility(v);
            findViewById(R.id.ice).setVisibility(v);
        }
        if(position == 144)
        {
            i = position;
            findViewById(R.id.fly).setVisibility(v);
            findViewById(R.id.elec).setVisibility(v);
        }
        if(position == 145)
        {
            i = position;
            findViewById(R.id.fly).setVisibility(v);
            findViewById(R.id.fire).setVisibility(v);
        }
        if(position == 146)
        {
            i = position;
            findViewById(R.id.dragon).setVisibility(v);
        }
        if(position == 147)
        {
            i = position;
            findViewById(R.id.dragon).setVisibility(v);
        }
        if(position == 148)
        {
            i = position;
            findViewById(R.id.fly).setVisibility(v);
            findViewById(R.id.dragon).setVisibility(v);

        }
        if(position == 149)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
        }
        if(position == 150)
        {
            i = position;
            findViewById(R.id.sup).setVisibility(v);
        }


    }
    public void onClick(View v)
    {
        Intent it = new Intent(this,ability.class);
        it.putExtra("ability",i);
        it.putExtra("name",name);
        startActivity(it);
    }
}
