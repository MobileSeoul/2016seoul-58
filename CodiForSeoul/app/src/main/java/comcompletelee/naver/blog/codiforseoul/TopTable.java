package comcompletelee.naver.blog.codiforseoul;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;


/**
 * Created by hello world on 2015-12-27.
 */
public class TopTable extends Activity {

    TextView oxfordShirt1;
    TextView oxfordShirt2;
    TextView flannelShirt1;
    TextView flannelShirt2;
    TextView lynenShirt1;
    TextView lynenShirt2;
    TextView dressShirt1;
    TextView dressShirt2;
    TextView teeShirt1;
    TextView teeShirt2;
    TextView sleeve1;
    TextView sleeve2;
    TextView lightKnit1;
    TextView lightKnit2;
    TextView heavyKnit1;
    TextView heavyKnit2;
    TextView sweatShirt1;
    TextView sweatShirt2;
    TextView nappingSweatShirt1;
    TextView nappingSweatShirt2;
    TextView neopreneSweatShirt1;
    TextView neopreneSweatShirt2;
    TextView lightCardigan1;
    TextView lightCardigan2;
    TextView heavyCardigan1;
    TextView heavyCardigan2;
    TextView turtleNeck1;
    TextView turtleNeck2;

    WeatherForecast todayOuter;
    int high;
    int low;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);



        Intent intent = getIntent();

        todayOuter = (WeatherForecast) intent.getSerializableExtra("TODAY");

        oxfordShirt1 = (TextView) findViewById(R.id.oxfordShirt1);
        oxfordShirt2 = (TextView) findViewById(R.id.oxfordShirt2);
        flannelShirt1 = (TextView) findViewById(R.id.flannelShirt1);
        flannelShirt2 = (TextView) findViewById(R.id.flannelShirt2);
        lynenShirt1 = (TextView) findViewById(R.id.lynenShirt1);
        lynenShirt2 = (TextView) findViewById(R.id.lynenShirt2);
        dressShirt1 = (TextView) findViewById(R.id.dressShirt1);
        dressShirt2 = (TextView) findViewById(R.id.dressShirt2);
        teeShirt1 = (TextView) findViewById(R.id.teeShirt1);
        teeShirt2 = (TextView) findViewById(R.id.teeShirt2);
        sleeve1 = (TextView) findViewById(R.id.sleeve1);
        sleeve2 = (TextView) findViewById(R.id.sleeve2);
        lightKnit1 = (TextView) findViewById(R.id.lightKnit1);
        lightKnit2 = (TextView) findViewById(R.id.lightKnit2);
        heavyKnit1 = (TextView) findViewById(R.id.heavyKnit1);
        heavyKnit2 = (TextView) findViewById(R.id.heavyKnit2);
        sweatShirt1 = (TextView) findViewById(R.id.sweatShirt1);
        sweatShirt2 = (TextView) findViewById(R.id.sweatShirt2);
        nappingSweatShirt1 = (TextView) findViewById(R.id.nappingSweatShirt1);
        nappingSweatShirt2 = (TextView) findViewById(R.id.nappingSweatShirt2);
        neopreneSweatShirt1 = (TextView) findViewById(R.id.neopreneSweatShirt1);
        neopreneSweatShirt2 = (TextView) findViewById(R.id.neopreneSweatShirt2);
        lightCardigan1 = (TextView) findViewById(R.id.lightCardigan1);
        lightCardigan2 = (TextView) findViewById(R.id.lightCardigan2);
        heavyCardigan1 = (TextView) findViewById(R.id.heavyCardigan1);
        heavyCardigan2 = (TextView) findViewById(R.id.heavyCardigan2);
        turtleNeck1 = (TextView) findViewById(R.id.turtleNeck1);
        turtleNeck2 = (TextView) findViewById(R.id.turtleNeck2);

        low = todayOuter.getLow();
        high = todayOuter.getHigh();

        if(high >=30) {
            oxfordShirt1.setText("퇴각");
            oxfordShirt2.setText("퇴각");
            flannelShirt1.setText("퇴각");
            flannelShirt2.setText("퇴각");
            lynenShirt1.setText("출격");
            lynenShirt2.setText("출격가능\n(겨드랑이 주의)");
            lynenShirt2.setGravity(Gravity.CENTER);
            dressShirt1.setText("출격가능\n(겨드랑이 주의)");
            dressShirt1.setGravity(Gravity.CENTER);
            dressShirt2.setText("출격가능\n(겨드랑이 주의)");
            dressShirt2.setGravity(Gravity.CENTER);
            teeShirt1.setText("출격");
            teeShirt2.setText("출격");
            sleeve1.setText("출격");
            sleeve2.setText("출격");
            lightKnit1.setText("퇴각");
            lightKnit2.setText("퇴각");
            heavyKnit1.setText("퇴각");
            heavyKnit2.setText("퇴각");
            sweatShirt1.setText("퇴각");
            sweatShirt2.setText("퇴각");
            nappingSweatShirt1.setText("퇴각");
            nappingSweatShirt2.setText("퇴각");
            neopreneSweatShirt1.setText("퇴각");
            neopreneSweatShirt2.setText("퇴각");
            lightCardigan1.setText("퇴각");
            lightCardigan2.setText("퇴각");
            heavyCardigan1.setText("퇴각");
            heavyCardigan2.setText("퇴각");
            turtleNeck1.setText("퇴각");
            turtleNeck2.setText("퇴각");

            oxfordShirt1.setTextColor(Color.RED);
            oxfordShirt2.setTextColor(Color.RED);
            flannelShirt1.setTextColor(Color.RED);
            flannelShirt2.setTextColor(Color.RED);
            lynenShirt1.setTextColor(Color.BLUE);
            lynenShirt2.setTextColor(Color.BLUE);
            dressShirt1.setTextColor(Color.BLUE);
            dressShirt2.setTextColor(Color.BLUE);
            teeShirt1.setTextColor(Color.BLUE);
            teeShirt2.setTextColor(Color.BLUE);
            sleeve1.setTextColor(Color.BLUE);
            sleeve2.setTextColor(Color.BLUE);
            lightKnit1.setTextColor(Color.RED);
            lightKnit2.setTextColor(Color.RED);
            heavyKnit1.setTextColor(Color.RED);
            heavyKnit2.setTextColor(Color.RED);
            sweatShirt1.setTextColor(Color.RED);
            sweatShirt2.setTextColor(Color.RED);
            nappingSweatShirt1.setTextColor(Color.RED);
            nappingSweatShirt2.setTextColor(Color.RED);
            neopreneSweatShirt1.setTextColor(Color.RED);
            neopreneSweatShirt2.setTextColor(Color.RED);
            lightCardigan1.setTextColor(Color.RED);
            lightCardigan2.setTextColor(Color.RED);
            heavyCardigan1.setTextColor(Color.RED);
            heavyCardigan2.setTextColor(Color.RED);
            turtleNeck1.setTextColor(Color.RED);
            turtleNeck2.setTextColor(Color.RED);
        } else if(high<30&&high>=25){
            oxfordShirt1.setText("퇴각");
            oxfordShirt2.setText("퇴각");
            flannelShirt1.setText("퇴각");
            flannelShirt2.setText("퇴각");
            lynenShirt1.setText("출격");
            lynenShirt2.setText("출격");
            dressShirt1.setText("출격");
            dressShirt2.setText("출격");
            teeShirt1.setText("출격");
            teeShirt2.setText("출격");
            sleeve1.setText("출격");
            sleeve2.setText("출격");
            lightKnit1.setText("퇴각");
            lightKnit2.setText("퇴각");
            heavyKnit1.setText("퇴각");
            heavyKnit2.setText("퇴각");
            sweatShirt1.setText("퇴각");
            sweatShirt2.setText("퇴각");
            nappingSweatShirt1.setText("퇴각");
            nappingSweatShirt2.setText("퇴각");
            neopreneSweatShirt1.setText("퇴각");
            neopreneSweatShirt2.setText("퇴각");
            lightCardigan1.setText("퇴각");
            lightCardigan2.setText("퇴각");
            heavyCardigan1.setText("퇴각");
            heavyCardigan2.setText("퇴각");
            turtleNeck1.setText("퇴각");
            turtleNeck2.setText("퇴각");

            oxfordShirt1.setTextColor(Color.RED);
            oxfordShirt2.setTextColor(Color.RED);
            flannelShirt1.setTextColor(Color.RED);
            flannelShirt2.setTextColor(Color.RED);
            lynenShirt1.setTextColor(Color.BLUE);
            lynenShirt2.setTextColor(Color.BLUE);
            dressShirt1.setTextColor(Color.BLUE);
            dressShirt2.setTextColor(Color.BLUE);
            teeShirt1.setTextColor(Color.BLUE);
            teeShirt2.setTextColor(Color.BLUE);
            sleeve1.setTextColor(Color.BLUE);
            sleeve2.setTextColor(Color.BLUE);
            lightKnit1.setTextColor(Color.RED);
            lightKnit2.setTextColor(Color.RED);
            heavyKnit1.setTextColor(Color.RED);
            heavyKnit2.setTextColor(Color.RED);
            sweatShirt1.setTextColor(Color.RED);
            sweatShirt2.setTextColor(Color.RED);
            nappingSweatShirt1.setTextColor(Color.RED);
            nappingSweatShirt2.setTextColor(Color.RED);
            neopreneSweatShirt1.setTextColor(Color.RED);
            neopreneSweatShirt2.setTextColor(Color.RED);
            lightCardigan1.setTextColor(Color.RED);
            lightCardigan2.setTextColor(Color.RED);
            heavyCardigan1.setTextColor(Color.RED);
            heavyCardigan2.setTextColor(Color.RED);
            turtleNeck1.setTextColor(Color.RED);
            turtleNeck2.setTextColor(Color.RED);
        } else if(high<25&&high>=23) {
            oxfordShirt1.setText("출격");
            oxfordShirt2.setText("출격");
            flannelShirt1.setText("출격");
            flannelShirt2.setText("출격");
            lynenShirt1.setText("출격");
            lynenShirt2.setText("출격");
            dressShirt1.setText("출격");
            dressShirt2.setText("출격");
            teeShirt1.setText("출격");
            teeShirt2.setText("출격");
            sleeve1.setText("출격");
            sleeve2.setText("출격");
            lightKnit1.setText("퇴각");
            lightKnit2.setText("퇴각");
            heavyKnit1.setText("퇴각");
            heavyKnit2.setText("퇴각");
            sweatShirt1.setText("출격\n(겨드랑이주의)");
            sweatShirt1.setGravity(Gravity.CENTER);
            sweatShirt2.setText("퇴각");
            nappingSweatShirt1.setText("퇴각");
            nappingSweatShirt2.setText("퇴각");
            neopreneSweatShirt1.setText("퇴각");
            neopreneSweatShirt2.setText("퇴각");
            lightCardigan1.setText("출격");
            lightCardigan2.setText("퇴각");
            heavyCardigan1.setText("퇴각");
            heavyCardigan2.setText("퇴각");
            turtleNeck1.setText("퇴각");
            turtleNeck2.setText("퇴각");

            oxfordShirt1.setTextColor(Color.BLUE);
            oxfordShirt2.setTextColor(Color.BLUE);
            flannelShirt1.setTextColor(Color.BLUE);
            flannelShirt2.setTextColor(Color.BLUE);
            lynenShirt1.setTextColor(Color.BLUE);
            lynenShirt2.setTextColor(Color.BLUE);
            dressShirt1.setTextColor(Color.BLUE);
            dressShirt2.setTextColor(Color.BLUE);
            teeShirt1.setTextColor(Color.BLUE);
            teeShirt2.setTextColor(Color.BLUE);
            sleeve1.setTextColor(Color.BLUE);
            sleeve2.setTextColor(Color.BLUE);
            lightKnit1.setTextColor(Color.RED);
            lightKnit2.setTextColor(Color.RED);
            heavyKnit1.setTextColor(Color.RED);
            heavyKnit2.setTextColor(Color.RED);
            sweatShirt1.setTextColor(Color.BLUE);
            sweatShirt2.setTextColor(Color.RED);
            nappingSweatShirt1.setTextColor(Color.RED);
            nappingSweatShirt2.setTextColor(Color.RED);
            neopreneSweatShirt1.setTextColor(Color.RED);
            neopreneSweatShirt2.setTextColor(Color.RED);
            lightCardigan1.setTextColor(Color.BLUE);
            lightCardigan2.setTextColor(Color.RED);
            heavyCardigan1.setTextColor(Color.RED);
            heavyCardigan2.setTextColor(Color.RED);
            turtleNeck1.setTextColor(Color.RED);
            turtleNeck2.setTextColor(Color.RED);
        } else if (high<23&&high>=18){
            oxfordShirt1.setText("출격");
            oxfordShirt2.setText("출격");
            flannelShirt1.setText("출격");
            flannelShirt2.setText("출격");
            lynenShirt1.setText("출격");
            lynenShirt2.setText("출격");
            dressShirt1.setText("출격");
            dressShirt2.setText("출격");

            teeShirt1.setText("출격\n(외투와 함께)");
            teeShirt1.setGravity(Gravity.CENTER);
            teeShirt2.setText("출격");
            sleeve1.setText("출격");
            sleeve2.setText("출격");
            lightKnit1.setText("출격");
            lightKnit2.setText("출격");
            heavyKnit1.setText("퇴각");
            heavyKnit2.setText("퇴각");
            sweatShirt1.setText("출격");
            sweatShirt2.setText("출격");
            nappingSweatShirt1.setText("퇴각");
            nappingSweatShirt2.setText("퇴각");
            neopreneSweatShirt1.setText("퇴각");
            neopreneSweatShirt2.setText("퇴각");
            lightCardigan1.setText("출격");
            lightCardigan2.setText("출격");
            heavyCardigan1.setText("퇴각");
            heavyCardigan2.setText("퇴각");
            turtleNeck1.setText("퇴각");
            turtleNeck2.setText("퇴각");

            oxfordShirt1.setTextColor(Color.BLUE);
            oxfordShirt2.setTextColor(Color.BLUE);
            flannelShirt1.setTextColor(Color.BLUE);
            flannelShirt2.setTextColor(Color.BLUE);
            lynenShirt1.setTextColor(Color.BLUE);
            lynenShirt2.setTextColor(Color.BLUE);
            dressShirt1.setTextColor(Color.BLUE);
            dressShirt2.setTextColor(Color.BLUE);
            teeShirt1.setTextColor(Color.BLUE);
            teeShirt2.setTextColor(Color.BLUE);
            sleeve1.setTextColor(Color.BLUE);
            sleeve2.setTextColor(Color.BLUE);
            lightKnit1.setTextColor(Color.BLUE);
            lightKnit2.setTextColor(Color.BLUE);
            heavyKnit1.setTextColor(Color.RED);
            heavyKnit2.setTextColor(Color.RED);
            sweatShirt1.setTextColor(Color.BLUE);
            sweatShirt2.setTextColor(Color.BLUE);
            nappingSweatShirt1.setTextColor(Color.RED);
            nappingSweatShirt2.setTextColor(Color.RED);
            neopreneSweatShirt1.setTextColor(Color.RED);
            neopreneSweatShirt2.setTextColor(Color.RED);
            lightCardigan1.setTextColor(Color.BLUE);
            lightCardigan2.setTextColor(Color.BLUE);
            heavyCardigan1.setTextColor(Color.RED);
            heavyCardigan2.setTextColor(Color.RED);
            turtleNeck1.setTextColor(Color.RED);
            turtleNeck2.setTextColor(Color.RED);
        } else if (high<18) {
            oxfordShirt1.setText("출격");
            oxfordShirt2.setText("출격");
            flannelShirt1.setText("출격");
            flannelShirt2.setText("출격");
            lynenShirt1.setText("퇴각");
            lynenShirt2.setText("퇴각");
            dressShirt1.setText("출격");
            dressShirt2.setText("출격");
            teeShirt1.setText("퇴각");
            teeShirt2.setText("퇴각");
            sleeve1.setText("퇴각");
            sleeve2.setText("퇴각");
            lightKnit1.setText("출격");
            lightKnit2.setText("출격");
            heavyKnit1.setText("출격");
            heavyKnit2.setText("출격");
            sweatShirt1.setText("출격");
            sweatShirt2.setText("출격");
            nappingSweatShirt1.setText("출격");
            nappingSweatShirt2.setText("출격");
            neopreneSweatShirt1.setText("출격");
            neopreneSweatShirt2.setText("출격");
            lightCardigan1.setText("출격");
            lightCardigan2.setText("출격");
            heavyCardigan1.setText("출격");
            heavyCardigan2.setText("출격");
            turtleNeck1.setText("출격");
            turtleNeck2.setText("출격");

            oxfordShirt1.setTextColor(Color.BLUE);
            oxfordShirt2.setTextColor(Color.BLUE);
            flannelShirt1.setTextColor(Color.BLUE);
            flannelShirt2.setTextColor(Color.BLUE);
            lynenShirt1.setTextColor(Color.RED);
            lynenShirt2.setTextColor(Color.RED);
            dressShirt1.setTextColor(Color.BLUE);
            dressShirt2.setTextColor(Color.BLUE);
            teeShirt1.setTextColor(Color.RED);
            teeShirt2.setTextColor(Color.RED);
            sleeve1.setTextColor(Color.RED);
            sleeve2.setTextColor(Color.RED);
            lightKnit1.setTextColor(Color.BLUE);
            lightKnit2.setTextColor(Color.BLUE);
            heavyKnit1.setTextColor(Color.BLUE);
            heavyKnit2.setTextColor(Color.BLUE);
            sweatShirt1.setTextColor(Color.BLUE);
            sweatShirt2.setTextColor(Color.BLUE);
            nappingSweatShirt1.setTextColor(Color.BLUE);
            nappingSweatShirt2.setTextColor(Color.BLUE);
            neopreneSweatShirt1.setTextColor(Color.BLUE);
            neopreneSweatShirt2.setTextColor(Color.BLUE);
            lightCardigan1.setTextColor(Color.BLUE);
            lightCardigan2.setTextColor(Color.BLUE);
            heavyCardigan1.setTextColor(Color.BLUE);
            heavyCardigan2.setTextColor(Color.BLUE);
            turtleNeck1.setTextColor(Color.BLUE);
            turtleNeck2.setTextColor(Color.BLUE);
        }
    }
}

